package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.blocks.amazon_cell_extractor;
import Kamen_Rider_Craft_4TH.blocks.amazon_cell_mutator;
import Kamen_Rider_Craft_4TH.item.ItemBaseSword;
import Kamen_Rider_Craft_4TH.item.Item_gun;
import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.item.item_bikes;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import Kamen_Rider_Craft_4TH.item.GoRider.item_GoRiderTyphoon;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityAcrobatter;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_ridoron;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

public class ShowaRiderItems {

	
	
	public static Item blanknoitem = new Item_ore("blanknoitem");
	public static Item blanknoform = new Item_form_change("blanknoform", RiderDriverItem.class,blanknoitem,"","");
	public static Item rider_circuit = new Item_ore("rider_circuit").setCreativeTab(Tabs.tabmisc);
	
	//Kamen Rider
	
	public static Item typhoon_core = new Item_form_change("typhoon_core", RiderDriverItem.class,blanknoitem,"","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabIchigo);


	public static Item original_typhoon_core = new Item_form_change("original_typhoon_core", RiderDriverItem.class,blanknoitem,"_original","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabIchigo);

	public static Item sakurajima_typhoon_core = new Item_form_change("sakurajima_typhoon_core", RiderDriverItem.class,blanknoitem,"_sakurajima","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabIchigo);

	public static Item new_typhoon = new Item_ore("new_typhoon");
	
	public static Item new_typhoon_core = new Item_form_change("new_typhoon_core", RiderDriverItem.class,new_typhoon,"_new","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).Rend2ndLyer("ichigo_new_up").setCreativeTab(Tabs.tabIchigo);

	
	public static Item ichigohead = new item_rider_armor("ichigohead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigotroso = new item_rider_armor("ichigotroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigolegs = new item_rider_armor("ichigolegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_ichigo = new RiderDriverItem("typhoon_ichigo",ArmorMaterial.DIAMOND, 4,"ichigo", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_nigo = new RiderDriverItem("typhoon_nigo",ArmorMaterial.DIAMOND, 4,"nigo", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_sango = new RiderDriverItem("typhoon_sango",ArmorMaterial.DIAMOND, 4,"sango", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_yongo = new RiderDriverItem("typhoon_yongo",ArmorMaterial.DIAMOND, 4,"yongo", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_shocker_rider_1 = new RiderDriverItem("typhoon_shocker_rider_1",ArmorMaterial.DIAMOND, 4,"shocker_rider_1", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_2 = new RiderDriverItem("typhoon_shocker_rider_2",ArmorMaterial.DIAMOND, 4,"shocker_rider_2", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_3 = new RiderDriverItem("typhoon_shocker_rider_3",ArmorMaterial.DIAMOND, 4,"shocker_rider_3", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_4 = new RiderDriverItem("typhoon_shocker_rider_4",ArmorMaterial.DIAMOND, 4,"shocker_rider_4", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_5 = new RiderDriverItem("typhoon_shocker_rider_5",ArmorMaterial.DIAMOND, 4,"shocker_rider_5", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_6 = new RiderDriverItem("typhoon_shocker_rider_6",ArmorMaterial.DIAMOND, 4,"shocker_rider_6", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_7 = new RiderDriverItem("typhoon_shocker_rider_7",ArmorMaterial.DIAMOND, 4,"shocker_rider_7", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_8 = new RiderDriverItem("typhoon_shocker_rider_8",ArmorMaterial.DIAMOND, 4,"shocker_rider_8", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_9 = new RiderDriverItem("typhoon_shocker_rider_9",ArmorMaterial.DIAMOND, 4,"shocker_rider_9", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_10 = new RiderDriverItem("typhoon_shocker_rider_10",ArmorMaterial.DIAMOND, 4,"shocker_rider_10", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_11 = new RiderDriverItem("typhoon_shocker_rider_11",ArmorMaterial.DIAMOND, 4,"shocker_rider_11", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_12 = new RiderDriverItem("typhoon_shocker_rider_12",ArmorMaterial.DIAMOND, 4,"shocker_rider_12", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	
	public static Item nophoon_kamen_norider = new RiderDriverItem("nophoon_kamen_norider",ArmorMaterial.DIAMOND, 4,"kamen_norider", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);



	//V3
	public static Item double_typhoon_core = new Item_form_change("double_typhoon_core", RiderDriverItem.class,blanknoitem,"","v3"
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)
			).setCreativeTab(Tabs.tabv3);
	

	public static Item riderman_belt_core = new Item_form_change("riderman_belt_core", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 0,true,false)
			,new PotionEffect(MobEffects.HASTE,20, 1,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false)
			).setCreativeTab(Tabs.tabv3);

	public static Item v3head = new item_rider_armor("v3head", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item v3troso = new item_rider_armor("v3troso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item v3legs = new item_rider_armor("v3legs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);

	public static Item double_typhoon = new RiderDriverItem("double_typhoon",ArmorMaterial.DIAMOND, 4,"v3", (Item_form_change) double_typhoon_core, v3head, v3troso, v3legs).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item double_typhoon_blue = new RiderDriverItem("double_typhoon_blue",ArmorMaterial.DIAMOND, 4,"blue_v3", (Item_form_change) double_typhoon_core, v3head, v3troso, v3legs).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item riderman_belt = new RiderDriverItem("riderman_belt",ArmorMaterial.DIAMOND, 4,"riderman", (Item_form_change) riderman_belt_core, v3head, v3troso, v3legs).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);


	//X
	public static Item ridol_stick = new ItemBaseSword("ridol_stick",Tabs.ridol_stick, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);

	public static Item ridol_core = new Item_form_change("ridol_core", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabx);

	public static Item xhead = new item_rider_armor("xhead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);
	public static Item xtroso = new item_rider_armor("xtroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);
	public static Item xlegs = new item_rider_armor("xlegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);

	public static Item ridol = new RiderDriverItem("ridol",ArmorMaterial.DIAMOND, 4,"x", (Item_form_change) ridol_core, xhead, xtroso, xlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabx);


	//Amazon
	public static Item condorer_wheel = new Item_form_change("condorer_wheel", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabamazon);

	public static Item amazonhead = new item_rider_armor("amazonhead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);
	public static Item amazontroso = new item_rider_armor("amazontroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);
	public static Item amazonlegs = new item_rider_armor("amazonlegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);

	public static Item condorer = new RiderDriverItem("condorer",ArmorMaterial.DIAMOND, 4,"amazon", (Item_form_change) condorer_wheel, amazonhead, amazontroso, amazonlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);

	public static Item gigi_armlet = new Item_ore("gigi_armlet").setCreativeTab(Tabs.tabamazon);
	public static Item gaga_armlet = new Item_ore("gaga_armlet").setCreativeTab(Tabs.tabamazon);

	//Stronger
	public static Item electrer_core = new Item_form_change("electrer_core", RiderDriverItem.class,blanknoitem,"","stronger"
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabstronger);

	public static Item charge_up = new Item_form_change("charge_up", RiderDriverItem.class,blanknoitem,"_charge_up","stronger"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 2,true,false)).setCreativeTab(Tabs.tabstronger);

	public static Item strongerhead = new item_rider_armor("strongerhead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);
	public static Item strongertroso = new item_rider_armor("strongertroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);
	public static Item strongerlegs = new item_rider_armor("strongerlegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);

	public static Item electrer = new RiderDriverItem("electrer",ArmorMaterial.DIAMOND, 4,"stronger", (Item_form_change) electrer_core, strongerhead, strongertroso, strongerlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);


	//SkyRider
	public static Item tornado_core = new Item_form_change("tornado_core", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION,20, 4,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).setCreativeTab(Tabs.tabskyrider);

	public static Item skyriderhead = new item_rider_armor("skyriderhead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);
	public static Item skyridertroso = new item_rider_armor("skyridertroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);
	public static Item skyriderlegs = new item_rider_armor("skyriderlegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);

	public static Item tornado = new RiderDriverItem("tornado",ArmorMaterial.DIAMOND, 4,"skyrider", (Item_form_change) tornado_core, skyriderhead, skyridertroso, skyriderlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);


	//Super 1
	public static Item cyclode_core = new Item_form_change("cyclode_core", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabsuper_1);

	public static Item super_1head = new item_rider_armor("super_1head", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);
	public static Item super_1troso = new item_rider_armor("super_1troso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);
	public static Item super_1legs = new item_rider_armor("super_1legs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);

	public static Item cyclode = new RiderDriverItem("cyclode",ArmorMaterial.DIAMOND, 4,"super1", (Item_form_change) cyclode_core, super_1head, super_1troso, super_1legs).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);


	//ZX
	public static Item zx_belt_core = new Item_form_change("zx_belt_core", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabzx);
			
	public static Item zx_head = new item_rider_armor("zx_head", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item zx_troso = new item_rider_armor("zx_troso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item zx_legs = new item_rider_armor("zx_legs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);

	public static Item zx_belt = new RiderDriverItem("zx_belt",ArmorMaterial.DIAMOND, 4,"zx", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item susanoo_belt = new RiderDriverItem("susanoo_belt",ArmorMaterial.DIAMOND, 4,"susanoo", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item tsukuyomi_belt = new RiderDriverItem("tsukuyomi_belt",ArmorMaterial.DIAMOND, 4,"tsukuyomi", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item amaterasu_belt = new RiderDriverItem("amaterasu_belt",ArmorMaterial.DIAMOND, 4,"amaterasu", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);


	//Black
	public static Item satan_sabre = new ItemBaseSword("satan_sabre",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item shadow_saber_short = new ItemBaseSword("shadow_saber_short",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	
	public static Item king_stone_core = new Item_form_change("king_stone_core", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.HASTE,20, 1,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack);

	public static Item black_head = new item_rider_armor("black_head", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item black_troso = new item_rider_armor("black_troso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item black_legs = new item_rider_armor("black_legs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);

	public static Item king_stone = new RiderDriverItem("king_stone",ArmorMaterial.DIAMOND, 4,"black", (Item_form_change) king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_green = new RiderDriverItem("king_stone_green",ArmorMaterial.DIAMOND, 4,"black_green", (Item_form_change)king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_shadow_moon = new RiderDriverItem("king_stone_shadow_moon",ArmorMaterial.DIAMOND, 4,"shadow_moon", (Item_form_change) king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_red_shadow_moon = new RiderDriverItem("king_stone_red_shadow_moon",ArmorMaterial.DIAMOND, 4,"red_shadow_moon", (Item_form_change)king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);

	//Black RX
	public static Item revolcane = new ItemBaseSword("revolcane",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item vortech_shooter = new Item_gun("vortech_shooter",Tabs.den_dengu, rider_circuit).setCreativeTab(Tabs.tabblack_rx);
	public static Item bio_blade = new ItemBaseSword("bio_blade",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	
	public static Item sunriser_rr = new Item_ore("sunriser_rr");
	public static Item sunriser_br = new Item_ore("sunriser_br");

	public static Item rx_rider = new Item_form_change("rx_rider", RiderDriverItem.class,blanknoitem,"","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack_rx);

	public static Item bio_rider = new Item_form_change("bio_rider", RiderDriverItem.class,sunriser_br,"_bio_rider","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)).setCreativeTab(Tabs.tabblack_rx);

	public static Item robo_rider = new Item_form_change("robo_rider", RiderDriverItem.class,sunriser_rr,"_robo_rider","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION,20, 1,true,false),
			new PotionEffect(MobEffects.RESISTANCE,20, 2,true,false)).setCreativeTab(Tabs.tabblack_rx);

	public static Item black_rx_head = new item_rider_armor("black_rx_head", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item black_rx_troso = new item_rider_armor("black_rx_troso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item black_rx_legs = new item_rider_armor("black_rx_legs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	public static Item sunriser = new RiderDriverItem("sunriser",ArmorMaterial.DIAMOND, 4,"black_rx", (Item_form_change) rx_rider, black_rx_head, black_rx_troso, black_rx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item moonriser = new RiderDriverItem("moonriser",ArmorMaterial.DIAMOND, 4,"white_rx", (Item_form_change) rx_rider, black_rx_head, black_rx_troso, black_rx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	public static Item king_stone_split = new Item_ore("king_stone_split").setCreativeTab(Tabs.tabblack_rx);

	public static Item acro_batter = new item_bikes("acro_batter",EntityAcrobatter::new).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item ridoron = new item_bikes("ridoron",Entity_ridoron::new).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	//shin

	public static Item shin_stone = new Item_form_change("shin_stone", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
	new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabshin);


	public static Item shinhead = new item_rider_armor("shinhead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);
	public static Item shintroso = new item_rider_armor("shintroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);
	public static Item shinlegs = new item_rider_armor("shinlegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);

	public static Item grasshopper_dna = new RiderDriverItem("grasshopper_dna",ArmorMaterial.DIAMOND, 4,"shin", (Item_form_change) shin_stone, shinhead, shintroso, shinlegs).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);


	//ZO

	public static Item zo_stone = new Item_form_change("zo_stone", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabzo);


	public static Item zohead = new item_rider_armor("zohead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);
	public static Item zotroso = new item_rider_armor("zotroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);
	public static Item zolegs = new item_rider_armor("zolegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);

	public static Item zo_core = new RiderDriverItem("zo_core",ArmorMaterial.DIAMOND, 4,"zo", (Item_form_change) zo_stone, zohead, zotroso, zolegs).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);



	//J

	public static Item j_stone = new Item_form_change("j_stone", RiderDriverItem.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.BIG_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabj);

	public static Item jhead = new item_rider_armor("jhead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);
	public static Item jtroso = new item_rider_armor("jtroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);
	public static Item jlegs = new item_rider_armor("jlegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);

	public static Item j_spirit = new RiderDriverItem("j_spirit",ArmorMaterial.DIAMOND, 4,"j", (Item_form_change) j_stone, jhead, jtroso, jlegs).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabj);



	//Amazons
	
	public static Block amazon_cell_extractor = new amazon_cell_extractor("amazon_cell_extractor",Material.ROCK, 2).setCreativeTab(Tabs.tabamazons);
	public static Block amazon_cell_mutator = new amazon_cell_mutator("amazon_cell_mutator",Material.ROCK, 2).setCreativeTab(Tabs.tabamazons);

	public static Item amazonshead = new item_rider_armor("amazonshead",item_amazonsdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazonstroso = new item_rider_armor("amazonstroso",item_amazonsdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazonslegs = new item_rider_armor("amazonslegs",item_amazonsdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);


	public static Item amazons_driver_omega = new item_amazonsdriver("amazons_driver_omega",ArmorMaterial.DIAMOND, 4, "amazon_omega").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazons_driver_omega = new item_amazonsdriver("neo_amazons_driver_omega",ArmorMaterial.DIAMOND, 4, "amazon_new_omega").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazons_driver_alpha = new item_amazonsdriver("amazons_driver_alpha",ArmorMaterial.DIAMOND, 4, "amazon_alpha").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazons_driver_blind_alpha = new item_amazonsdriver("amazons_driver_blind_alpha",ArmorMaterial.DIAMOND, 4, "amazon_alpha_blind").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazons_driver_sigma = new item_amazonsdriver("amazons_driver_sigma",ArmorMaterial.DIAMOND, 4, "amazon_sigma").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazons_driver_neo = new item_amazonsdriver("neo_amazons_driver_neo",ArmorMaterial.DIAMOND, 4, "amazon_neo").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazons_driver_neo_alpha = new item_amazonsdriver("neo_amazons_driver_neo_alpha",ArmorMaterial.DIAMOND, 4, "amazon_neo_alpha").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);

	public static Item condorer_core_alpha = new Item_ore("condorer_core_alpha").setCreativeTab(Tabs.tabamazons);
	public static Item condorer_core_omega = new Item_ore("condorer_core_omega").setCreativeTab(Tabs.tabamazons);
	public static Item condorer_core_sigma = new Item_ore("condorer_core_sigma").setCreativeTab(Tabs.tabamazons);
	public static Item condorer_core_blind_alpha = new Item_ore("condorer_core_blind_alpha").setCreativeTab(Tabs.tabamazons);

	public static Item amazon_injector_neo = new Item_ore("amazon_injector_neo").setCreativeTab(Tabs.tabamazons);
	public static Item amazon_injector_new_omega = new Item_ore("amazon_injector_new_omega").setCreativeTab(Tabs.tabamazons);
	public static Item amazon_injector_neo_alpha = new Item_ore("amazon_injector_neo_alpha").setCreativeTab(Tabs.tabamazons);
	
	public static Item empty_vial = new Item_ore("empty_vial").setCreativeTab(Tabs.tabamazons);
	public static Item amazon_cell_vial = new Item_ore("amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	
	public static Item omega_amazon_cell_vial = new Item_ore("omega_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	public static Item alpha_amazon_cell_vial = new Item_ore("alpha_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	public static Item sigma_amazon_cell_vial = new Item_ore("sigma_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazon_cell_vial = new Item_ore("neo_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	
	//G
	public static Item goro_wine_bottle = new Item_form_change("goro_wine_bottle", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).keep_item().setCreativeTab(Tabs.tabG);


	public static Item ghead = new item_rider_armor("ghead", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabG);
	public static Item gtroso = new item_rider_armor("gtroso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabG);
	public static Item glegs = new item_rider_armor("glegs", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabG);

	public static Item g_belt = new RiderDriverItem("g_belt",ArmorMaterial.DIAMOND, 4,"kamen_rider_g", (Item_form_change) goro_wine_bottle, ghead, gtroso, glegs).setMaxStackSize(1).setCreativeTab(Tabs.tabG);


	//GoRider
	public static Item akarider_card = new Item_form_change("akarider_card",item_GoRiderTyphoon.class,ShowaRiderItems.blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item aorider_card = new Item_form_change("aorider_card",item_GoRiderTyphoon.class,ShowaRiderItems.blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item kirider_card = new Item_form_change("kirider_card",item_GoRiderTyphoon.class,ShowaRiderItems.blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item momorider_card = new Item_form_change("momorider_card",item_GoRiderTyphoon.class,ShowaRiderItems.blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item midorider_card = new Item_form_change("midorider_card",item_GoRiderTyphoon.class,ShowaRiderItems.blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	
	public static Item akariderhead = new item_rider_armor("akariderhead",item_GoRiderTyphoon.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item akaridertroso = new item_rider_armor("akaridertroso",item_GoRiderTyphoon.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item akariderlegs = new item_rider_armor("akariderlegs",item_GoRiderTyphoon.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);

	public static Item typhoon_akarider = new item_GoRiderTyphoon("typhoon_akarider",ArmorMaterial.DIAMOND, 4,"akarider",(Item_form_change) akarider_card).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_aorider = new item_GoRiderTyphoon("typhoon_aorider",ArmorMaterial.DIAMOND, 4,"aorider",(Item_form_change) aorider_card).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_kirider = new item_GoRiderTyphoon("typhoon_kirider",ArmorMaterial.DIAMOND, 4,"kirider",(Item_form_change) kirider_card).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_momorider = new item_GoRiderTyphoon("typhoon_momorider",ArmorMaterial.DIAMOND, 4,"momorider",(Item_form_change) momorider_card).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_midorider = new item_GoRiderTyphoon("typhoon_midorider",ArmorMaterial.DIAMOND, 4,"midorider",(Item_form_change) midorider_card).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);


	public static void init() {
	}

	//public static void init(){}
}



