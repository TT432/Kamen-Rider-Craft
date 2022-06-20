package Kamen_Rider_Craft_4TH.item.rider_armor_base;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.util.BeltHelp;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.api.cap.BaublesCapabilities;
import baubles.api.cap.IBaublesItemHandler;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber
public class RiderDriverItem extends ItemArmor implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	private Item_form_change Base_Form_Item;
	public String Rider;
	public Item HEAD;
	public Item TORSO;
	public Item LEGS;

	private boolean belt=false;

	public RiderDriverItem(String name, ArmorMaterial par2EnumArmorMaterial, int par3, String rider, Item_form_change baseFormItem, Item head, Item torso, Item legs)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		Base_Form_Item=baseFormItem;
		HEAD=head;
		TORSO=torso;
		LEGS=legs;

	}


	public RiderDriverItem belt(boolean num)
	{
		belt=num;
		return this;
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


	public void extraPotionEffects(World world,EntityPlayer player,ItemStack armor,Item_form_change form) {

	}

	@SubscribeEvent
	public static void onEvent(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;

		boolean canUse = false;
		ItemStack belt = BeltHelp.getBelt(player);
		RiderDriverItem item = null;

		if (!belt.isEmpty()) {
			canUse = true;
			item = (RiderDriverItem) belt.getItem();
		} else {
			Item feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

			if (feet instanceof RiderDriverItem) {
				RiderDriverItem temp = (RiderDriverItem) feet;

				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == temp.LEGS) {
					if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == temp.TORSO) {
						if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == temp.HEAD) {
							if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == temp) {
								canUse = true;
								item = temp;
							}
						}
					}
				}
			}
		}

		World world = player.world;

		if (canUse) {
			List<PotionEffect> potionEffectList = item.get_Form_Item(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1).getPotionEffectList();
			for (PotionEffect potionEffect : potionEffectList) {
				player.addPotionEffect(new PotionEffect(potionEffect.getPotion(), potionEffect.getDuration(), potionEffect.getAmplifier(), true, false));
			}
			item.extraPotionEffects(world, player,
					belt, item.get_Form_Item(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1));
		}
	}

	public  boolean rendModle(Entity entity, int num) {
		if (num==2||num==5||num==7||num==1||num==3||num==6||num==8){
			return true;
		}
		else if (entity instanceof EntityLivingBase) {
			EntityLivingBase player = ((EntityLivingBase) entity);
			ItemStack beltStack = BeltHelp.getBelt(player);

			if (beltStack.isEmpty() && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof RiderDriverItem) {
				beltStack = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
			}

			if (!beltStack.isEmpty()) {
				if (num == 4 || num == 9 || num == 10 || num == 11 || num == 12 || num == 13 || num == 14) {
					return !Objects.equals(RiderDriverItem.get_Form_Item_tex(beltStack, 1).get2ndLyer(), "blank");
				} else {
					return false;
				}
			} else {
				return false;
			}
		}

		return false;
	}
	
	public  String getTexture(Entity entity, int num,String ext) {
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase player = ((EntityLivingBase) entity);
			RiderDriverItem belt = null;
			ItemStack beltStack = ItemStack.EMPTY;

			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof RiderDriverItem) {
				belt = ((RiderDriverItem) player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
				beltStack = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
			}

			IBaublesItemHandler capability = player.getCapability(BaublesCapabilities.CAPABILITY_BAUBLES, null);

			if (capability != null) {
				for (int i = 0; i < capability.getSlots(); i++) {
					ItemStack stackInSlot = capability.getStackInSlot(i);
					IBauble bauble = stackInSlot.getCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null);

					if (bauble != null && bauble.getBaubleType(stackInSlot) == BaubleType.BELT && stackInSlot.getItem() instanceof RiderDriverItem) {
						belt = (RiderDriverItem) stackInSlot.getItem();
						beltStack = stackInSlot;
						break;
					}
				}
			}

			if (belt != null) {
				String rider = belt.Rider;

				if (num == 1) {
					return Refercence.MODID + ":textures/armor/" + rider + RiderDriverItem.get_Form_Item_tex(beltStack, 1).getFormName() + ext;


				} else if (num == 2 || num == 5 || num == 7) {

					return Refercence.MODID + ":textures/armor/" + rider + RiderDriverItem.get_Form_Item_tex(beltStack, 1).getFormName() + ext;

				} else if (num == 3 || num == 6 || num == 8) {

					return Refercence.MODID + ":textures/armor/" + rider + RiderDriverItem.get_Form_Item_tex(beltStack, 1).getFormName() + ext;

				} else if (num == 4 || num == 9 || num == 10 || num == 11 || num == 12 || num == 13 || num == 14) {

					return Refercence.MODID + ":textures/armor/" + RiderDriverItem.get_Form_Item_tex(beltStack, 1).get2ndLyer() + ext;

				} else {
					return Refercence.MODID + ":textures/armor/blank" + ext;

				}
			} else {
				return Refercence.MODID + ":textures/armor/blank" + ext;
			}
		} else {
			return Refercence.MODID + ":textures/armor/blank" + ext;
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

				if(belt == true){
					armorModel.belt=new ItemStack(ShowaRiderItems.blanknoitem);
				}else if (get_Form_Item(stack,1).getBelt()==ShowaRiderItems.blanknoitem ){
					armorModel.belt=stack;
				}else 
				{
					armorModel.belt=new ItemStack(get_Form_Item(stack,1).getBelt());
				}


				armorModel.wings=new ItemStack(get_Form_Item(stack,1).getWing());


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

	public Item_form_change get_Form_Item(ItemStack itemstack,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			return Base_Form_Item;
		}else if (Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT))instanceof Item_form_change){
			return (Item_form_change) Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT));
		}else{
			return Base_Form_Item;
		}
	}

	public static Item_form_change get_Form_Item_tex(ItemStack itemstack,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			return  ((RiderDriverItem)itemstack.getItem()).Base_Form_Item;
		}else if (Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT))instanceof Item_form_change){
			return (Item_form_change) Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT));
		}else{
			return  ((RiderDriverItem)itemstack.getItem()).Base_Form_Item;
		}
	}
	public static void set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("slot"+SLOT, Item.getIdFromItem(ITEM));

	}



	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return ShowaRiderItems.blanknoitem == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}


	@Nullable
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
		return new DriveDriverCapabilityProvider();
	}

	static class DriveDriverCapabilityProvider implements ICapabilityProvider {

		@Override
		public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
			return capability == BaublesCapabilities.CAPABILITY_ITEM_BAUBLE;
		}

		@Nullable
		@Override
		public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
			return capability == BaublesCapabilities.CAPABILITY_ITEM_BAUBLE ? (T) (IBauble) itemStack -> BaubleType.BELT : null;
		}
	}
}