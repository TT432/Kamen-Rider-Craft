package Kamen_Rider_Craft_4TH.item.rider_armor_base;


import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel2;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.api.cap.BaublesCapabilities;
import baubles.api.cap.IBaublesItemHandler;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_rider_armor extends ItemArmor  implements IHasModel {
	private static final int[] maxDamageArray = new int[]{11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public Class<? extends RiderDriverItem> BELTCLASS;
	private final Item base;

	public item_rider_armor(String name, Class<? extends RiderDriverItem> beltClass, ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4, Item item) {
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		BELTCLASS = beltClass;
		base = item;
	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
		if (!stack.isEmpty()) {
			if (stack.getItem() instanceof item_rider_armor) {
				tokuArmorModel2 armorModel = new tokuArmorModel2();

				RiderDriverItem belt = null;

				if (stack.getItem() instanceof RiderDriverItem) {
					belt = ((RiderDriverItem) player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
				}

				IBaublesItemHandler capability = player.getCapability(BaublesCapabilities.CAPABILITY_BAUBLES, null);

				if (capability != null) {
					for (int i = 0; i < capability.getSlots(); i++) {
						ItemStack stackInSlot = capability.getStackInSlot(i);
						IBauble bauble = stackInSlot.getCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null);

						if (bauble != null && bauble.getBaubleType(stackInSlot) == BaubleType.BELT && stackInSlot.getItem() instanceof RiderDriverItem) {
							belt = (RiderDriverItem) stackInSlot.getItem();
							break;
						}
					}
				}

				if (belt != null) {
					if (stack.getItem() == belt.HEAD) {
						armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
						armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;
						armorModel.bigBipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
						armorModel.bigBipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

						armorModel.big2BipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
						armorModel.big2BipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;


					} else {
						armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;

						armorModel.big2BipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.big2BipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;

					}

					if (stack.getItem() == belt.TORSO) {
						armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
						armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;

						armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;
						armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;

						armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
						armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
						armorModel.big2BipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;


					} else {
						armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;

						armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;

						armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.big2BipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
					}

					if (stack.getItem() == belt.LEGS) {
						armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
						armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
						armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
						armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

						armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
						armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

						armorModel.big2BipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;

					} else {
						armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

						armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

						armorModel.big2BipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
					}
				} else {
					armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;

					armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;

					armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

					armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

					armorModel.big2BipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
					armorModel.big2BipedBody2.showModel = slot == EntityEquipmentSlot.FEET;


				}

				armorModel.base = BELTCLASS;
				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}

		}

		return null;
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return ShowaRiderItems.rider_circuit == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this, 0, "inventory");
	}
}