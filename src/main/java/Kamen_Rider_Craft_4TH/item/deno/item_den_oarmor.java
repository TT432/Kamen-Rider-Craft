package Kamen_Rider_Craft_4TH.item.deno;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;

public class item_den_oarmor extends ItemArmor implements IHasModel
{

	public static final String[] CoreName= new String[] {"_plat","_sword","_rod","_ax","_gun","_wing","_climax","_climax","_liner"};
	public static final String[] CoreNamezeronos= new String[] {"_plat_","_altair_","_vega_","_zero_"};
	public static final String[] CoreNamenewdeno= new String[] {"_plat","_strike","_vega"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_den_oarmor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_den_odriver){

					if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.den_odriver){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"deno"+CoreName[item_den_odriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_form_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"deno"+ CoreName[item_den_odriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_form_1.png";
						}

					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.zeronosbelt){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"zeronos"+CoreNamezeronos[item_den_odriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_form_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"zeronos"+ CoreNamezeronos[item_den_odriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_form_1.png";
						}

					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.newden_obelt){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"newdeno"+CoreNamenewdeno[item_den_odriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_form_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"newdeno"+ CoreNamenewdeno[item_den_odriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_form_1.png";
						}
					
					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.nega_den_odriver){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"nega_deno_nega_form_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"nega_deno_nega_form_1.png";
						}

					}	


					else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.gaohbelt){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"gaoh_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"gaoh_1.png";
						}
					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.pretty_den_odriver){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"pretty_deno_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"pretty_deno_1.png";
						}
					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.yuukibelt_hijack){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"yuuki-hijack_form_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"yuuki-hijack_form_1.png";
						}
					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.yuukibelt_skull){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"yuuki-skull_form_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"yuuki-skull_form_1.png";
						}
					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.newden_obelt){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"newdeno_strike_form_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"newdeno_strike_form_1.png";
						}
					}else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.gden_odriver){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"gdeno_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"gdeno_1.png";
						}
					}
				

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
	return RiderItems.imaginsand == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
}


}