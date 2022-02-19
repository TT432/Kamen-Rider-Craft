package Kamen_Rider_Craft_4TH.item.revice;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.Tabs;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.model.Model_breaking_mammoth;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_revicedriver extends ItemArmor  implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;



	public item_revicedriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int driver)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		DRIVER = driver;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return !true;
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{

				model_belt_plus armorModel = new model_belt_plus();

				armorModel.belt=stack;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;

				armorModel.swingProgress = living.swingProgress;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}

	public static int get_eftTime(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("eftTime") : 100;
	}

	public static void set_eftTime(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("eftTime", flag);
	}

	public static int get_core(ItemStack itemstack,String slot)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core"+slot) : 0;
	}

	public static void set_core(ItemStack itemstack, int flag,String slot)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core"+slot, flag);
	}


	public static String get_lockbase(ItemStack itemstack)
	{	

		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed")!=0? Item_Vistamps.ARMS[itemstack.getTagCompound().getInteger("seed")]: "base" : "base";
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ReiwaRiderItems.revicelegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ReiwaRiderItems.revicetroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ReiwaRiderItems.revicehead){	

									String form = Item_Vistamps.ARMS[DRIVER];
									int base = item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1");
									
									if (item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="base") {
										form = item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
									}
									
									if (form=="eagle"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if (form=="mammoth"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,0,true,false));
									}else if (form=="megalodon"){
										if (player.isInWater()){
											if (player.isSneaking()){
											Vec3d look = player.getLookVec();
											player.motionX=look.x/2;
											player.motionY=look.y/2;
											player.motionZ=look.z/2;
										}}
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
									}else if (form=="ptera"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,1,true,false));
									}else if (form=="lion"){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if (form=="jackal"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (form=="kong"){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,0,true,false));
									}else if (form=="kamakiri"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}else if (form=="brachio"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}else if (form=="neo_batta"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
									}else if (form=="condor"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 250,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 250,3,true,false));
									}else if (form=="kangaroo"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
									}else if (form=="quetzalcoatlus"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 250,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 250,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 250,3,true,false));
									}else if (form=="white_leo"){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 7,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5,3,true,false));
									}
									
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.revice_driver){
										if (base==0){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 250,0,true,false));
										}else if (base==1){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
											
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.two_sidriver_evil){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.two_sidriver_live){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.demons_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.POISON, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.libera_driver){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}
										
									
								}
							}
						}
					}
				}
			}
		}
	}


	public static int get_lock(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed")!=0? itemstack.getTagCompound().getInteger("seed"): 0 : 0;
	}
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed", flag);
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return ReiwaRiderItems.hiden_metal == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}








