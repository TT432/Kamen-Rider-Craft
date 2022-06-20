package Kamen_Rider_Craft_4TH.item.kabuto;


import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;

import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_zecter extends Item_form_change 
{

	public Item num;


	public Item_zecter(Item NUM, String name, Class<? extends RiderDriverItem> beltClass, Item belt, String formName, String ridername, PotionEffect... effects)
	{
		super(name,beltClass, belt,formName,ridername,effects);
		num = NUM;
	}



	
	/**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
    	if (!playerIn.inventory.armorInventory.get(1).isEmpty()) {
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem().getClass()==BELTCLASS) {
				 if(((RiderDriverItem) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider.equals(RIDER_NAME)){
					if (RiderDriverItem.get_Form_Item_tex(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1)==this){
						RiderDriverItem.set_Form_Item(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num, 1);
					}else{
						return super.onItemRightClick(worldIn,playerIn,handIn);
					}
				}
			}

    	}
        playerIn.setActiveHand(handIn);

    	return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
	
	
}
