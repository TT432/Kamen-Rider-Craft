package Kamen_Rider_Craft_4TH.client.overlay;

import Kamen_Rider_Craft_4TH.speffect.FusionCoefficient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @author DustW
 **/
@Mod.EventBusSubscriber(Side.CLIENT)
public class FusionCoefficientRenderer {
    @SubscribeEvent
    public static void onEvent(RenderGameOverlayEvent.Post event) {
        ScaledResolution resolution = event.getResolution();
        Minecraft mc = Minecraft.getMinecraft();

        int value = FusionCoefficient.get(mc.player);

        if (value > 0) {
            mc.fontRenderer.drawString(String.valueOf(value),
                    resolution.getScaledWidth() / 2F + 15, resolution.getScaledHeight() / 2F + 15,
                    0XFFFFFFFF, false);
        }
    }
}
