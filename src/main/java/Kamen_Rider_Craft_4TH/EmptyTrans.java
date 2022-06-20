package Kamen_Rider_Craft_4TH;

import net.minecraft.launchwrapper.IClassTransformer;

/**
 * @author DustW
 **/
public class EmptyTrans implements IClassTransformer {
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        return basicClass;//特别注意需要返回basicClass
    }
}
