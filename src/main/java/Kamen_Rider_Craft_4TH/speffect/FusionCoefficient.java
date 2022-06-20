package Kamen_Rider_Craft_4TH.speffect;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import Kamen_Rider_Craft_4TH.util.BeltHelp;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Collection;

/**
 * @author DustW
 **/
@Mod.EventBusSubscriber
public class FusionCoefficient {
    public static final String NBT_KEY = "FusionCoefficient";

    public static int get(EntityPlayer player) {
        ItemStack belt = BeltHelp.getBelt(player);
        int oldValue = player.getEntityData().getInteger(NBT_KEY);

        if (oldValue == 0 && !belt.isEmpty()) {
            int newValue = getBaseMax(player);
            set(player, newValue);
            return newValue;
        }
        else if (oldValue != 0 && belt.isEmpty()) {
            set(player, 0);
            return 0;
        }

        return oldValue;
    }

    public static void set(EntityPlayer player, int value) {
        player.getEntityData().setInteger(NBT_KEY, value);
    }

    static final ImmutableMap<String, Integer> map = ImmutableMap.<String, Integer>builder()
            .put("garren", 500)
            .put("blade", 600)
            .put("leangle", 600)
            .put("chalice", 700)
            .put("glaive", 400)
            .put("larc", 400)
            .put("lance", 400)
            .build();

    public static int getBaseMax(EntityPlayer player) {
        ItemStack belt = BeltHelp.getBelt(player);

        if (belt.isEmpty()) {
            return 0;
        }

        RiderDriverItem item = (RiderDriverItem) belt.getItem();
        String rider = item.Rider;
        return map.getOrDefault(rider, 0);
    }

    public static int getMax(EntityPlayer player) {
        int base = getBaseMax(player);
        return base > 0 ? base + player.experienceLevel / 3 : 0;
    }

    public static int getDifference(EntityPlayer player) {
        return get(player) - getBaseMax(player);
    }

    public static void tick(EntityPlayer player) {
        int current = get(player);
        int max = getMax(player);

        if (current < max) {
            set(player, Math.min(current + 4, max));
        }
    }

    private static final ImmutableSet<Potion> potion5 = ImmutableSet.<Potion>builder().add(
            MobEffects.UNLUCK,
            MobEffects.HUNGER,
            MobEffects.NAUSEA,
            MobEffects.BLINDNESS,
            MobEffects.WEAKNESS,
            MobEffects.POISON,
            MobEffects.WITHER
    ).build();

    @SubscribeEvent
    public static void onEvent(PotionEvent.PotionAddedEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();

            if (player.world.isRemote) {
                return;
            }

            Potion potion = event.getPotionEffect().getPotion();

            if (potion.isBadEffect() && !potion5.contains(potion) && potion != MobEffects.INSTANT_DAMAGE) {
                set(player, get(player) - 15);
            }
        }
    }

    @SubscribeEvent
    public static void onEvent(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;

        if (player.world.isRemote) {
            return;
        }

        if (player.ticksExisted % 20 == 0) {
            boolean canTick = true;

            Collection<PotionEffect> effects = player.getActivePotionEffects();

            for (PotionEffect effect : effects) {
                Potion potion = effect.getPotion();

                if (potion.isBadEffect() && potion5.contains(potion)) {
                    set(player, get(player) - 5);
                    canTick = false;
                }
            }

            if (canTick) {
                tick(player);
            }
        }

    }

    @SubscribeEvent
    public static void onEvent(LivingHurtEvent event) {
        if (event.getEntityLiving().world.isRemote) {
            return;
        }

        if (event.getEntityLiving() instanceof EntityPlayer && event.getSource().getTrueSource() instanceof EntityPlayer) {
            EntityPlayer hurt = (EntityPlayer) event.getEntityLiving();
            EntityPlayer attacker = (EntityPlayer) event.getSource().getTrueSource();
            int hurtDifference = getDifference(hurt);
            int attackerDifference = getDifference(attacker);
            float hurtAmount = event.getAmount() - (event.getAmount() * hurtDifference * (1F / 100F));
            event.setAmount(hurtAmount + (hurtAmount * attackerDifference * (5F / 100F)));
            return;
        }

        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();
            int difference = getDifference(player);
            event.setAmount(event.getAmount() - (event.getAmount() * difference * (1F / 100F)));
            return;
        }

        if (event.getSource().getTrueSource() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
            int difference = getDifference(player);
            event.setAmount(event.getAmount() + (event.getAmount() * difference * (5F / 100F)));
        }
    }
}
