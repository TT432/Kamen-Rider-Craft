package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

public class kikaiderItems {

	public static Item kikaider_circuit = new Item_ore("kikaider_circuit").setCreativeTab(Tabs.tab_kikaider);
	
	public static Item kikaider_head = new item_rider_armor("kikaider_head", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, kikaider_circuit).setCreativeTab(Tabs.tab_kikaider);
	public static Item kikaider_troso = new item_rider_armor("kikaider_troso", RiderDriverItem.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, kikaider_circuit).setCreativeTab(Tabs.tab_kikaider);
	public static Item kikaider_legs = new item_rider_armor("kikaider_legs", RiderDriverItem.class, ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, kikaider_circuit).setCreativeTab(Tabs.tab_kikaider);

	public static Item kikaider_core= new Item_form_change("kikaider_core", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","",
			new PotionEffect(MobEffects.SPEED, 20, 0,true,false),
			new PotionEffect(MobEffects.STRENGTH, 20, 0,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 2,true,false),
			new PotionEffect(PotionCore.FLY_POTION, 20, 2,true,false)).setCreativeTab(Tabs.tab_kikaider);

	public static Item kikaider_belt = new RiderDriverItem("kikaider_belt",ArmorMaterial.DIAMOND,4,"kikaider",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);

	public static Item kikaider_01_belt = new RiderDriverItem("kikaider_01_belt",ArmorMaterial.DIAMOND,4,"kikaider_01",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);

	public static Item bijinder_belt = new RiderDriverItem("bijinder_belt",ArmorMaterial.DIAMOND,4,"bijinder",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);

	public static Item kikaider_00_belt = new RiderDriverItem("kikaider_00_belt",ArmorMaterial.DIAMOND,4,"kikaider_00",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);

	public static Item shadow_01_belt = new RiderDriverItem("shadow_01_belt",ArmorMaterial.DIAMOND,4,"shadow_01",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);

	public static Item shadow_bijinder_belt = new RiderDriverItem("shadow_bijinder_belt",ArmorMaterial.DIAMOND,4,"shadow_bijinder",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);
	
	public static Item hakaider_belt = new RiderDriverItem("hakaider_belt",ArmorMaterial.DIAMOND,4,"hakaider",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);
	
	public static Item gill_hakaider_belt = new RiderDriverItem("gill_hakaider_belt",ArmorMaterial.DIAMOND,4,"gill_hakaider",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);
	
	public static Item red_hakaider_belt = new RiderDriverItem("red_hakaider_belt",ArmorMaterial.DIAMOND,4,"red_hakaider",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);
	
	public static Item silver_hakaider_belt = new RiderDriverItem("silver_hakaider_belt",ArmorMaterial.DIAMOND,4,"silver_hakaider",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);
	
	public static Item blue_hakaider_belt = new RiderDriverItem("blue_hakaider_belt",ArmorMaterial.DIAMOND,4,"blue_hakaider",
			(Item_form_change)kikaider_core,kikaider_head,kikaider_troso,kikaider_legs).setCreativeTab(Tabs.tab_kikaider);

	
	public static void init() {
	}

	//public static void init(){}
}



