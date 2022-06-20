package Kamen_Rider_Craft_4TH.item.kuuga;



import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Item_kuuga_mode_change_sword_im extends ItemSword implements IHasModel
{
  
//private Item Imcharge;

    public Item_kuuga_mode_change_sword_im(String name,ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
      
       // Imcharge=charge; 
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {

            	 if (entityIn == null)
	                {
	                    return 0.0F;
	                }else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

					if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof RiderDriverItem){
						if (RiderDriverItem.get_Form_Item_tex(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getBelt()==RiderItems.arcle_u|| RiderDriverItem.get_Form_Item_tex(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getBelt()==RiderItems.arcle_ru)
							 return 1;
					}else{
						return 0;
					}
					return 0;
				}
				return 0;
            }
        });
    }

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.kuuga_growing == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}