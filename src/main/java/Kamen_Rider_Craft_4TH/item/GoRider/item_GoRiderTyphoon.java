package Kamen_Rider_Craft_4TH.item.GoRider;

import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.item.ItemStack;

public class item_GoRiderTyphoon extends RiderDriverItem implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_GoRiderTyphoon (String name, ArmorMaterial par2EnumArmorMaterial, int par3, String rider, Item_form_change baseFormItem) {
		super(name, par2EnumArmorMaterial, par3, rider,baseFormItem, ShowaRiderItems.akariderhead, ShowaRiderItems.akaridertroso, ShowaRiderItems.akariderlegs);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
    {
    	return ShowaRiderItems.rider_circuit == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
}