package Kamen_Rider_Craft_4TH.item.zero_one;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghost_armor3;
import Kamen_Rider_Craft_4TH.model.BipedLockseed;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_zero_onearmor extends ItemArmor implements IHasModel
{

	public static final String[] CoreName= new String[] {"","_shining","_assault","_metalcluster","_zero_two","_rampage","_one","_red","_japanese","","_hell"};


	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_zero_onearmor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;

		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}



	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_zero_onedriver){

					String rider = ((item_zero_onedriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

 String form;
					if (item_zero_onedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="base"){
						form = item_zero_onedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
					}else{
						form = Item_progrise_keys.ARMS[((item_zero_onedriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).DRIVER];
					}

						return Refercence.MODID+":textures/armor/"+rider+CoreName[item_zero_onedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+"_" +form+"_1.png";
					

				}
				return Refercence.MODID+":textures/armor/blank.png";


			}
		}
		else
		{
			return Refercence.MODID+":textures/armor/blank.png";



		}

		return Refercence.MODID+":textures/armor/blank.png";

	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_zero_onearmor)
			{
				BipedLockseed armorModel = new BipedLockseed();
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;		
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;

				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;

				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;


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



	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.hiden_metal == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}


}