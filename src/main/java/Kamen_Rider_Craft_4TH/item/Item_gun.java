package Kamen_Rider_Craft_4TH.item;



import java.util.Vector;

import com.google.common.collect.Multimap;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Item_gun extends ItemBow  implements IHasModel
{
	 private final float attackDamage;
	    private final Item.ToolMaterial material;
		private final Item base;   

	
	public Item_gun(String name,ToolMaterial par2EnumToolMaterial, Item item)
	{
		super();
		this.material = par2EnumToolMaterial;
		 this.attackDamage = 3.0F + material.getAttackDamage();
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
        base = item;
	}
	

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.BOW;
	}

	

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		boolean flag = true;

		ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
		if (ret != null) return ret;

		if (!playerIn.capabilities.isCreativeMode && !flag)
		{
			return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
		}
		else
		{
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
	}

	
	/**
	 * Called when the player stops using an Item (stops holding the right mouse button).
	 */
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
	{
		if (entityLiving instanceof EntityPlayer)
		{
			 EntityPlayer playerIn = (EntityPlayer)entityLiving;

			if (!worldIn.isRemote) {
				shoot(worldIn, playerIn, stack);
			}

			playerIn.addStat(StatList.getObjectUseStats(this));
		}
	}

	protected void shoot(World worldIn, EntityPlayer playerIn, ItemStack stack) {
		EntityArrow fireball = getArrowEntity(worldIn, playerIn);

		int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);

		if (j > 0) {
			fireball.setDamage(fireball.getDamage() + (double) j * 0.5D + 0.5D);
		}

		int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);

		if (k > 0) {
			fireball.setKnockbackStrength(k);
		}

		if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0) {
			fireball.setFire(100);
		}

		worldIn.spawnEntity(fireball);
	}

	protected void damage(double damage, ItemStack stack, EntityPlayer player, EntityLivingBase target) {
		double result = damage;

		int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);

		if (j > 0) {
			result += (double) j * 0.5D + 0.5D;
		}

		int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);

		if (k > 0) {
			target.addVelocity(1 * k * 0.6000000238418579D / 1.41, 0.1D, 1 * k * 0.6000000238418579D / 1.41);
		}

		if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0) {
			target.setFire(100);
		}

		target.attackEntityFrom(DamageSource.causePlayerDamage(player),
				getFinalDamage((float) result, stack, player, target));
	}

	protected float getFinalDamage(float damage, ItemStack stack, EntityPlayer player, EntityLivingBase target) {
		return damage;
	}

	protected EntityArrow getArrowEntity(World worldIn, EntityPlayer playerIn) {
		Vec3d look = playerIn.getLookVec();
		ItemArrow itemarrow = (ItemArrow) Items.ARROW;
		EntityArrow fireball = itemarrow.createArrow(worldIn, new ItemStack(Items.ARROW), playerIn);
		fireball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 1.0F);
		fireball.motionX = look.x * 3;
		fireball.motionY = look.y * 3;
		fireball.motionZ = look.z * 3;
		fireball.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
		return fireball;
	}

    /**
     * Returns the amount of damage this item will deal. One heart of damage is equal to 2 damage points.
     */
    public float getAttackDamage()
    {
        return this.material.getAttackDamage();
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();

        if (block == Blocks.WEB)
        {
            return 15.0F;
        }
        else
        {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.VINE && material != Material.CORAL && material != Material.LEAVES && material != Material.GOURD ? 1.0F : 1.5F;
        }
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }

    /**
     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
     */
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
        if ((double)state.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(2, entityLiving);
        }

        return true;
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        return blockIn.getBlock() == Blocks.WEB;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return this.material.getEnchantability();
    }

    /**
     * Return the name for this tool's material.
     */
    public String getToolMaterialName()
    {
        return this.material.toString();
    }

    /**
     * Return whether this item is repairable in an anvil.
     *  
     * @param toRepair the {@code ItemStack} being repaired
     * @param repair the {@code ItemStack} being used to perform the repair
     */
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return base == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
        }

        return multimap;
    }

}