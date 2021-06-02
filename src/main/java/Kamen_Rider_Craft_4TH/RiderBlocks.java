package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.blocks.BlockCustomDoor;
import Kamen_Rider_Craft_4TH.blocks.BlockCustomStaris;
import Kamen_Rider_Craft_4TH.blocks.custom.BlockType;
import Kamen_Rider_Craft_4TH.blocks.custom.CustomBlock;
import Kamen_Rider_Craft_4TH.blocks.custom.Property;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimPlant;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
import Kamen_Rider_Craft_4TH.item.Item_custom_door;
import Kamen_Rider_Craft_4TH.item.Item_ore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class RiderBlocks {

	public static Block HelheimVine = new BlockHelheimVine("helheim_vine");
	public static Block Helheim_plant = new BlockHelheimPlant("helheim_plant").setCreativeTab(Tabs.tabmisc);
	public static Block Helheim_plant_2 = new BlockHelheimPlant("helheim_plant_2").setCreativeTab(Tabs.tabmisc);
	public static Block Helheim_plant_3 = new BlockHelheimPlant("helheim_plant_3").setCreativeTab(Tabs.tabmisc);
	public static Block Helheim_plant_4 = new BlockHelheimPlant("helheim_plant_4").setCreativeTab(Tabs.tabmisc);
	
	public static Block counter_95do = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.DIRECTIONAL).name("counter_95do").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block planks_light_blue = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.BASIC).name("planks_light_blue").setCreativeTabe(Tabs.tabdecor).build();
	public static Block planks_dark_blue = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.BASIC).name("planks_dark_blue").setCreativeTabe(Tabs.tabdecor).build();
	public static Block planks_white = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.BASIC).name("planks_white").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block kamiyama_wall = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.BASIC).name("kamiyama_wall").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block door_kamiyama = new BlockCustomDoor("door_kamiyama").setCreativeTab(Tabs.tabdecor);
	
	public static Block denliner_interior = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_interior").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_interior_darker = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_interior_darker").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_interior_with_line = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_interior_with_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_interior_windo = CustomBlock.builder().property(Property.TRANSPARENT).material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("denliner_interior_windo").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_line = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_side_with_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_start_line = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("denliner_side_with_start_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_line_ikazuchi = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_side_with_line_ikazuchi").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_line_rekkou = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_side_with_line_rekkou").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_roof = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_roof").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block denliner_logo_top = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_logo_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_logo_bottom = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_logo_bottom").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_logo_side = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_logo_side").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_logo_sider = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_logo_sider").setCreativeTabe(Tabs.tabdecor).build();

	public static Block denliner_glass = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_glass").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass2 = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_glass2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass3 = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_glass3").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass_ikazuchi = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_glass_ikazuchi").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass_rekkou = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_glass_rekkou").setCreativeTabe(Tabs.tabdecor).build();
	public static Block nega_denliner_glass = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("nega_denliner_glass").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block denliner_gold = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_gold").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_matel").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_top = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_matel_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_top2 = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_matel_top2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_side = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_matel_side").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block denliner_matel_dark = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("denliner_matel_dark").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_dark_line = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("denliner_matel_dark_line").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block new_denliner_interior = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("new_denliner_interior").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_side_with_line = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("new_denliner_side_with_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_side_with_start_line = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("new_denliner_side_with_start_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_logo_top = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("new_denliner_logo_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_logo_bottom = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("new_denliner_logo_bottom").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_matel_top = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("new_denliner_matel_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_matel_top2 = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("new_denliner_matel_top2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_matel_side = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("new_denliner_matel_side").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block king_liner_red = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("king_liner_red").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_top = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("king_liner_logo_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_bottom = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("king_liner_logo_bottom").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_side = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("king_liner_logo_side").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_sider = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("king_liner_logo_sider").setCreativeTabe(Tabs.tabdecor).build();

	public static Block king_liner__windo = CustomBlock.builder().property(Property.TRANSPARENT).material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("king_liner__windo").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block gaoh_liner_gold = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("gaoh_liner_gold").setCreativeTabe(Tabs.tabdecor).build();
	public static Block gaoh_liner_green = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("gaoh_liner_green").setCreativeTabe(Tabs.tabdecor).build();
	public static Block gaoh_liner_windo = CustomBlock.builder().property(Property.TRANSPARENT).material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("gaoh_liner_windo").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block zero_liner_green = CustomBlock.builder().material(Material.ROCK).blockType(BlockType.BASIC).name("zero_liner_green").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block white_wallplate = CustomBlock.builder().material(Material.IRON).hardness(9.9F).harvestLevel("pickaxe", 2).name("white_wallplate").setCreativeTabe(Tabs.tabdecor).build();

	public static Block ginga_meteor = CustomBlock.builder().material(Material.ROCK).lightLevel(1f).blockType(BlockType.BASIC).name("ginga_meteor").setCreativeTabe(Tabs.tabdecor).build();
	
	
	public static Block  sword_of_logos_stairs = new BlockCustomStaris(Blocks.ACACIA_STAIRS.getDefaultState(), "sword_of_logos_stairs").setCreativeTab(Tabs.tabdecor);
	public static Block sword_of_logos_bookshelf = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.BASIC).name("sword_of_logos_bookshelf").setCreativeTabe(Tabs.tabdecor).build();
	public static Block planks_big_oak_golden_trim = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.BASIC).name("planks_big_oak_golden_trim").setCreativeTabe(Tabs.tabdecor).build();
	
	
public static void init() {
	
}

}