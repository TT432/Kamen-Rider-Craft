package Kamen_Rider_Craft_4TH.mixin;

import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.api.cap.BaublesCapabilities;
import baubles.api.cap.IBaublesItemHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

/**
 * @author DustW
 **/
@Mixin(LayerArmorBase.class)
public abstract class MixinLayerArmor<T extends ModelBase> {
    @Shadow public abstract T getModelFromSlot(EntityEquipmentSlot slotIn);

    @Shadow(remap = false) protected abstract T getArmorModelHook(EntityLivingBase entity, ItemStack itemStack, EntityEquipmentSlot slot, T model);

    @Shadow @Final private RenderLivingBase<?> renderer;

    @Shadow protected abstract void setModelSlotVisible(T p_188359_1_, EntityEquipmentSlot slotIn);

    @Shadow(remap = false) public abstract ResourceLocation getArmorResource(Entity entity, ItemStack stack, EntityEquipmentSlot slot, String type);

    @Shadow private float colorR;

    @Shadow private float colorG;

    @Shadow private float colorB;

    @Shadow private float alpha;

    @Shadow private boolean skipRenderGlint;

    @Inject(method = "renderArmorLayer", at = @At("HEAD"), cancellable = true)
    private void renderArmorLayerKR(EntityLivingBase entityLivingBaseIn,
                                    float limbSwing, float limbSwingAmount,
                                    float partialTicks, float ageInTicks,
                                    float netHeadYaw, float headPitch,
                                    float scale, EntityEquipmentSlot slotIn, CallbackInfo ci) {

        ItemStack itemstack = entityLivingBaseIn.getItemStackFromSlot(slotIn);

        T t = getModelFromSlot(slotIn);
        boolean changed = false;

        if (entityLivingBaseIn instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLivingBaseIn;

            IBaublesItemHandler capability = player.getCapability(BaublesCapabilities.CAPABILITY_BAUBLES, null);

            if (capability != null) {
                for (int i = 0; i < capability.getSlots(); i++) {
                    if (changed) {
                        break;
                    }

                    ItemStack stackInSlot = capability.getStackInSlot(i);
                    IBauble bauble = stackInSlot.getCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null);

                    if (bauble != null && bauble.getBaubleType(stackInSlot) == BaubleType.BELT && stackInSlot.getItem() instanceof RiderDriverItem) {

                        RiderDriverItem driver = (RiderDriverItem) stackInSlot.getItem();

                        if (t instanceof ModelBiped) {
                            ModelBiped biped = (ModelBiped) t;

                            switch (slotIn) {
                                case HEAD: {
                                    itemstack = new ItemStack(driver.HEAD);
                                    changed = true;
                                    break;
                                }
                                case CHEST: {
                                    itemstack = new ItemStack(driver.TORSO);
                                    changed = true;
                                    break;
                                }
                                case LEGS: {
                                    itemstack = new ItemStack(driver.LEGS);
                                    changed = true;
                                    break;
                                }
                                case FEET: {
                                    itemstack = stackInSlot;
                                    changed = true;
                                    break;
                                }
                                default:
                                    break;
                            }

                            if (changed) {
                                t = (T) itemstack.getItem().getArmorModel(entityLivingBaseIn, itemstack, slotIn, biped);
                            }
                        }
                    }
                }
            }
        }

        boolean isArmor = itemstack.getItem() instanceof ItemArmor;

        if (!changed && isArmor) {
            ItemArmor itemarmor = (ItemArmor) itemstack.getItem();

            if (itemarmor.getEquipmentSlot() == slotIn) {
                t = getArmorModelHook(entityLivingBaseIn, itemstack, slotIn, t);
            }
        }

        if (t == null || itemstack.isEmpty()) {
            ci.cancel();
            return;
        }

        t.setModelAttributes(renderer.getMainModel());
        t.setLivingAnimations(entityLivingBaseIn, limbSwing, limbSwingAmount, partialTicks);
        setModelSlotVisible(t, slotIn);

        this.renderer.bindTexture(getArmorResource(entityLivingBaseIn, itemstack, slotIn, null));

        if (isArmor) {
            ItemArmor itemarmor = (ItemArmor) itemstack.getItem();

            if (itemarmor.hasOverlay(itemstack)) // Allow this for anything, not only cloth
            {
                int i = itemarmor.getColor(itemstack);
                float f = (float) (i >> 16 & 255) / 255.0F;
                float f1 = (float) (i >> 8 & 255) / 255.0F;
                float f2 = (float) (i & 255) / 255.0F;
                GlStateManager.color(this.colorR * f, this.colorG * f1, this.colorB * f2, this.alpha);
                t.render(entityLivingBaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
                this.renderer.bindTexture(this.getArmorResource(entityLivingBaseIn, itemstack, slotIn, "overlay"));
            }
        }

        { // Non-colored
            GlStateManager.color(this.colorR, this.colorG, this.colorB, this.alpha);
            t.render(entityLivingBaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        } // Default
        if (!this.skipRenderGlint && itemstack.hasEffect()) {
            LayerArmorBase.renderEnchantedGlint(this.renderer, entityLivingBaseIn, t, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
        }

        ci.cancel();
    }
}
