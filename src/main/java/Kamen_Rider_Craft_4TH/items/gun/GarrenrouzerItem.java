package Kamen_Rider_Craft_4TH.items.gun;

import Kamen_Rider_Craft_4TH.item.Item_gun;
import Kamen_Rider_Craft_4TH.util.ProjectileUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Vector3d;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.dedicated.DedicatedServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author DustW
 **/
public class GarrenrouzerItem extends Item_gun {
    public GarrenrouzerItem(String name, ToolMaterial par2EnumToolMaterial, Item item) {
        super(name, par2EnumToolMaterial, item);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        int viewDistance = 0;
        ItemStack stack = playerIn.getHeldItem(handIn);

        if (!worldIn.isRemote) {
            MinecraftServer minecraftServer = worldIn.getMinecraftServer();

            if (minecraftServer != null) {
                viewDistance = minecraftServer.getPlayerList().getViewDistance();
            }

            if (viewDistance > 0) {
                EntityLivingBase entityLivingBase = ProjectileUtils
                        .rayTraceTargetFixedDistance(playerIn, 1, viewDistance * 16, .5);

                if (entityLivingBase != null) {
                    damage(5, stack, playerIn, entityLivingBase);

                    if (!playerIn.capabilities.isCreativeMode) {
                        stack.damageItem(1, playerIn);
                    }

                    playerIn.getCooldownTracker().setCooldown(stack.getItem(), 4);

                    return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
                }
            }
        }

        return ActionResult.newResult(EnumActionResult.FAIL, stack);
    }

    @Override
    protected float getFinalDamage(float damage, ItemStack stack, EntityPlayer player, EntityLivingBase target) {
        return Math.max(Math.max(0, 10 - player.getDistance(target)) * 0.2f, 0.2f) * damage;
    }
}
