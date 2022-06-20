package Kamen_Rider_Craft_4TH.util;

import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.api.cap.BaublesCapabilities;
import baubles.api.cap.IBaublesItemHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * @author DustW
 **/
public class BeltHelp {
    public static ItemStack getBelt(EntityLivingBase player) {
        IBaublesItemHandler capability = player.getCapability(BaublesCapabilities.CAPABILITY_BAUBLES, null);

        if (capability != null) {
            for (int i = 0; i < capability.getSlots(); i++) {
                ItemStack stackInSlot = capability.getStackInSlot(i);
                IBauble bauble = stackInSlot.getCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null);

                if (bauble != null && bauble.getBaubleType(stackInSlot) == BaubleType.BELT && stackInSlot.getItem() instanceof RiderDriverItem) {
                    return stackInSlot;
                }
            }
        }

        return ItemStack.EMPTY;
    }
}
