package Kamen_Rider_Craft_4TH.util;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author DustW
 **/
public class ProjectileUtils {
    @Nullable
    public static EntityLivingBase rayTraceTarget(EntityLivingBase targeter, double step, int depth, double size){
        Vec3d eyePos = targeter.getPositionEyes(1f);
        Vec3d lookVec = targeter.getLookVec();
        Vec3d checkPos = eyePos;
        double hS = size / 2;
        for (int i = 0 ; i < depth; i++){
            AxisAlignedBB aabb = new AxisAlignedBB(hS,hS,hS,-hS,-hS,-hS).offset(checkPos);
            List<EntityLivingBase> entities = targeter.world.getEntitiesWithinAABB(EntityLivingBase.class, aabb);
            for (EntityLivingBase entity : entities){
                if (entity != targeter) {
                    return entity;
                }
            }
            checkPos = checkPos.add(lookVec.scale(step));
        }
        return null;
    }

    @Nullable
    public static EntityLivingBase rayTraceTargetFixedDistance(EntityLivingBase targeter, double step, int distance, double size){
        return rayTraceTarget(targeter, step, (int)Math.ceil(distance/step), size);
    }
}
