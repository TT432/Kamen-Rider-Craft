// Date: 25/07/2013 13:56:09
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package Kamen_Rider_Craft_4TH.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class ModelAnkh extends ModelBase
{
  //fields
	public ModelRenderer field_78133_b;
	public ModelRenderer tailend;
	public ModelRenderer tail;
	public ModelRenderer body;
	public ModelRenderer wingl;
	public ModelRenderer wingr;
    
	
	
  
  public ModelAnkh(float par1)
  {
  
    byte b0 = 4;
    this.field_78133_b = new ModelRenderer(this, 16, 16);
    this.field_78133_b.addBox(0F, 0F, 0F, 4, 4, 6);
    this.field_78133_b.setRotationPoint(-2F, 0F, 0F);
    
    this.tailend = new ModelRenderer(this, 0, 11);
    this.tailend.addBox(-1F, -0.5F, 0F, 2, 1, 3);
    this.tailend.setRotationPoint(0F, 2F, 9F);
    this.tailend.setTextureSize(64, 32);


    this.tail = new ModelRenderer(this, 0, 0);
    this.tail.addBox(-0.5F, -1.5F, 0F, 3, 3, 4);
    this.tail.setRotationPoint(-1F, 2F, 5F);
    this.tail.setTextureSize(64, 32);


    this.body = new ModelRenderer(this, 16, 16);
    this.body.addBox(0F, 0F, 0F, 4, 4, 6);
    this.body.setRotationPoint(-2F, 0F, 0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;


    this.wingl = new ModelRenderer(this, 40, 17);
    this.wingl.addBox(-4F, 0F, 0F, 4, 1, 4);
    this.wingl.setRotationPoint(1F, 0F, 2F);
    this.wingl.setTextureSize(64, 32);
    setRotation(wingl, 0F, -0.1570796F, 0.3490659F);


    this.wingr = new ModelRenderer(this, 40, 17);
    this.wingr.addBox(0F, 0F, 0F, 4, 1, 4);
    this.wingr.setRotationPoint(-1F, 0F, 2F);
    this.wingr.setTextureSize(64, 32);
    setRotation(wingr, 0F, 0.1570796F, -0.3490659F);

  }
  
	

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2,par3,par4,par5,par6,par7);
    this.setRotationAngles(par2,par3,par4,par5,par6,par7, par1Entity);
    this.tailend.render(par7);
    this.tail.render(par7);
    this.body.render(par7);
    this.wingl.render(par7);
    this.wingr.render(par7);
  }
  

/**
 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
 * "far" arms and legs can swing at most.
 */  
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      
	  tailend.rotateAngleZ =  (MathHelper.cos(par1 * 0.6662F) * par2);
	  tailend.rotateAngleX =  (MathHelper.cos(par1 * 0.6662F) * par2);
	  tail.rotateAngleZ =  (MathHelper.cos(par1 * 0.6662F) * par2);
	  
			  
  }

}
