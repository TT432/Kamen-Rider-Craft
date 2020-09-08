package Kamen_Rider_Craft_4TH.item.saber;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.model.model_belt_w;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_saberdriver extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	
	public String Rider;
	public int BOOK_L;
	public int BOOK_M;
	public int BOOK_R;

	public static String[] book_l= new String[] {"base_l","brave_dragon","","","","","","","","",""};
	public static String[] book_m= new String[] {"base_m","lion_senki","needle_hedgehog","","","","","","","",""};
	public static String[] book_r= new String[] {"base_r","peter","jackun","","","","","","","",""};



	
	public item_saberdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider,int book_l,int book_m, int book_r)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		BOOK_L = book_l;
		BOOK_M = book_m;
		BOOK_R = book_r;
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
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";

	}



	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.saberlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.sabertroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.saberhead){
									ItemStack ItemStack = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);


								}
							}
						}
					}
				}
			}
		}
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

				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}


	public static String get_core(ItemStack itemstack,String slot)
	{
		String form = "base";

		if (slot == "l") {
			if (itemstack.hasTagCompound()) {
				form=book_l[itemstack.getTagCompound().getInteger("core"+slot)];
			}else {
				form=book_l[((item_saberdriver)itemstack.getItem()).BOOK_L];
			}
			if (form == "base_l") {
				form = ((item_saberdriver)itemstack.getItem()).Rider+"_base_l";
			}
		}else if (slot == "r"){
			if (itemstack.hasTagCompound()) {
				form=book_r[itemstack.getTagCompound().getInteger("core"+slot)];
			}else {
				form=book_r[((item_saberdriver)itemstack.getItem()).BOOK_R];
			}
			if (form == "base_r") {
				form = ((item_saberdriver)itemstack.getItem()).Rider+"_base_r";
			}
			
		}else {
			if (itemstack.hasTagCompound()) {
				form=((item_saberdriver)itemstack.getItem()).Rider+"_"+book_m[itemstack.getTagCompound().getInteger("core"+slot)];
			}else {
				form=((item_saberdriver)itemstack.getItem()).Rider+"_"+book_m[((item_saberdriver)itemstack.getItem()).BOOK_M];
			}
		}

		return form;
	}

	public static void set_core(ItemStack itemstack, int flag,String slot)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
			itemstack.getTagCompound().setInteger("corel", ((item_saberdriver)itemstack.getItem()).BOOK_L);
			itemstack.getTagCompound().setInteger("corem", ((item_saberdriver)itemstack.getItem()).BOOK_M);
			itemstack.getTagCompound().setInteger("corer", ((item_saberdriver)itemstack.getItem()).BOOK_R);
			
		}
		itemstack.getTagCompound().setInteger("core"+slot, flag);
	}
	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}
}