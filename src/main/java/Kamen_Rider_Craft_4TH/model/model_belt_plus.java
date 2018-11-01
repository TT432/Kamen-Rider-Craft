// Date: 27/05/2015 23:35:12
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.blade.item_bladedriver;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimdriver;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class model_belt_plus extends ModelBiped
{
	//fields
	

	public ItemStack belt;
	public ItemStack belt2=new ItemStack(RiderItems.blanknoitem);
	public ItemStack belt3=new ItemStack(RiderItems.blanknoitem);
	public ItemStack belt4=new ItemStack(RiderItems.blanknoitem);

	public ItemStack wings=new ItemStack(RiderItems.blanknoitem);

	public model_belt_plus()
	{
		textureWidth = 64;
		textureHeight = 128;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (entity instanceof EntityLivingBase){
			EntityLivingBase living = ((EntityLivingBase)entity);
			ItemStack stack = living.getItemStackFromSlot(EntityEquipmentSlot.FEET);
			
			GL11.glPushMatrix();
			GL11.glPushMatrix();

			if(living.isSneaking()){
				GL11.glRotatef(20, 1, 0, 0);	
			}

		
			GL11.glRotatef(180, 0, 1, 0);

			GL11.glRotatef(180, 0, 0, 1);
			

			GL11.glScaled(3,3,1);
			
			GL11.glTranslatef((float) (0f),-0.05f,-0.2f);
			
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,wings,null);
			GL11.glPopMatrix();
			GL11.glPushMatrix();

			if(living.isSneaking()){
				GL11.glRotatef(20, 1, 0, 0);	
			}

			double dri = 0; 
			GL11.glRotatef(180, 0, 1, 0);

			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.OOOdriver)
			{					
				dri = 0.5; 
				GL11.glRotatef(160, 0, 0, 1);
			}else{

				GL11.glRotatef(180, 0, 0, 1);
			}

			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_bladedriver)
			{					

				GL11.glScaled(0.35, 0.35,0.35);
				GL11.glTranslatef((float) (0f+dri),-2f,0.6f);
			}else{

				GL11.glScaled(0.5, 0.5,0.5);
				GL11.glTranslatef((float) (0f+dri),-1.3f,0.4f);
			}

			//EntityItem entItem= new EntityItemFrame(player.worldObj);
			//RenderEntityItem.doRender(entItem,4,-0.9,0.17,0,0);
			// Minecraft.getMinecraft().getRenderItem().renderItemModel(stack);
			
			

			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_ex_aiddriver)
			{
			if (item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==4||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==5||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==6){

				GL11.glTranslated(0, 0, 0.05);
			}
			}
			
			
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt,null);
			
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt2,null);
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt3,null);
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt4,null);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			
	}

}




private void setRotation(ModelRenderer model, float x, float y, float z)
{
	model.rotateAngleX = x;
	model.rotateAngleY = y;
	model.rotateAngleZ = z;
}




public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
{
	super.setRotationAngles( par1, par2, par3, par4, par5,par6, par7Entity);

}

}
