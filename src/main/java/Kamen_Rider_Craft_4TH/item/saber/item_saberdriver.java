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

	public static String[] book_l= new String[] {"base_l","brave_dragon","genbu_shinwa","jaaku_dragon","tenkuu_no_pegasus","tri_cerberus","eternal_phoenix"
			,"","","","",""};

	public static String[] book_m= new String[] {"base_m","lion_senki","needle_hedgehog","storm_eagle","","","","","","",""};

	public static String[] book_r= new String[] {"base_r","peter","jackun","lamp_do_alngina","kobuta_3_kyouda","sarutobi_ninjaden","king_of_arthur",
			"kirin_no_ongaeshi","sarukani_wars","bakusou_usagi_to_kame","saiyuu_journey","hanselnuts_to_grete","bremen_no_rock_band","hoshin_kamen_engi",
			"tsuki_no_hime_kaguyan","osha_jizou_san","issun_bushi","saber_televi_kun","daishougun_momoichirou","daikengou_urashimajirou","daiyokozuna_kinzaburou"};

	public static String[] book_mode= new String[] {"","_jaou_dragon","_dragonic_knight","_emotional_dragon","_ghost","_x_swordman","_x_swordman_wonderful"
			,"_x_swordman_powerful","_king_lion","_primitive_dragon","_elemental_primitive_dragon","_tategami_hyoujuu_senki","_xross"};



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

									if (Rider == "buster"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}else if (Rider == "kenzan"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (Rider == "slash"){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (Rider == "falchion"){
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}else if (Rider == "saikou_shadow"){
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
									}

									if (get_core_for_forms(ItemStack,"l")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==4){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==5){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==6){
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}


									if (get_core_for_forms(ItemStack,"m")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"m")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"m")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}

									if (get_core_for_forms(ItemStack,"r")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==4){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==5){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==6){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==7){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==8){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==9){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==10){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==11){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==12){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==13){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==14){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==15){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==16){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==17){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==18){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==19){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==20){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}

									if (get_core_for_forms(ItemStack,"f")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==4){
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==5){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==6){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==7){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==8){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==9){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==10){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
									}

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

				if (stack.getItem()==RiderItems.sword_of_logos_buckle_buster){
					if(living.getHeldItemMainhand().getItem()!= RiderItems.dogouken_gekido&living.getHeldItemOffhand().getItem()!= RiderItems.dogouken_gekido){
						armorModel.wings= new ItemStack(RiderItems.dogouken_gekido_back);
					}
				}
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

	public static int  get_core_for_forms(ItemStack itemstack,String slot)
	{
		int form = 0;

		if (slot == "f"){

			if (itemstack.hasTagCompound()) {
				if (itemstack.getTagCompound().getInteger("core"+"f")!=0){
					form = itemstack.getTagCompound().getInteger("core"+"f");
				}else{
					form = 0;
				}
			}
		}else if (slot == "l") {

			if (itemstack.hasTagCompound()) {
				form=itemstack.getTagCompound().getInteger("core"+slot);
			}else {
				form=((item_saberdriver)itemstack.getItem()).BOOK_L;
			}
		}else if (slot == "r"){
			if (itemstack.hasTagCompound()) {
				form=itemstack.getTagCompound().getInteger("core"+slot);
			}else {
				form=((item_saberdriver)itemstack.getItem()).BOOK_R;
			}
		}else {
			if (itemstack.hasTagCompound()) {
				form=itemstack.getTagCompound().getInteger("core"+slot);
			}else {
				form=((item_saberdriver)itemstack.getItem()).BOOK_M;
			}
		}

		return form;
	}



	public static String get_core(ItemStack itemstack,String slot)
	{
		String form = "base";
		String rider;
		String riderName=((item_saberdriver)itemstack.getItem()).Rider;
		boolean is_form = false;

		if (itemstack.hasTagCompound()) {
			rider=((item_saberdriver)itemstack.getItem()).Rider+book_mode[itemstack.getTagCompound().getInteger("core"+"f")];
			if (itemstack.getTagCompound().getInteger("core"+"f")!=0){
				is_form = true;
			}
		}else {
			rider=((item_saberdriver)itemstack.getItem()).Rider;
		}

		if (slot == "f"){


			if (itemstack.hasTagCompound()) {
				if (itemstack.getTagCompound().getInteger("core"+"f")!=0){
					form = book_mode[itemstack.getTagCompound().getInteger("core"+"f")];
				}else{
					form = "base";
				}
			}else{
				form = "base";
			}
		}else if (slot == "l") {

			if (itemstack.hasTagCompound()) {
				if (is_form){
					form=rider+"_"+book_l[itemstack.getTagCompound().getInteger("core"+slot)];
				}else{
					form=book_l[itemstack.getTagCompound().getInteger("core"+slot)];
				}
			}else {
				form=book_l[((item_saberdriver)itemstack.getItem()).BOOK_L];
			}
			if (form == "base_l") {
				form = rider+"_base_l";
			}
		}else if (slot == "r"){
			if (itemstack.hasTagCompound()) {
				if (riderName == "buster"||riderName=="kenzan"||riderName=="slash"){
					form=rider+"_"+book_r[itemstack.getTagCompound().getInteger("core"+slot)];
				}else{
					if (is_form){
						form=rider+"_"+book_r[itemstack.getTagCompound().getInteger("core"+slot)];
					}else{
					form=book_r[itemstack.getTagCompound().getInteger("core"+slot)];
					}
				}
			}else {
				form=book_r[((item_saberdriver)itemstack.getItem()).BOOK_R];
			}
			if (form == "base_r") {
				form = rider+"_base_r";
			}

		}else {
			if (itemstack.hasTagCompound()) {
				form=rider+"_"+book_m[itemstack.getTagCompound().getInteger("core"+slot)];
			}else {
				form=rider+"_"+book_m[((item_saberdriver)itemstack.getItem()).BOOK_M];
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
			itemstack.getTagCompound().setInteger("coref",0);

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
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.blank_wonder_ride_book == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}