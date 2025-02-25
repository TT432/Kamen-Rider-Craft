package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.item.*;
import Kamen_Rider_Craft_4TH.item.agito.item_agitodriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.RiderDriverItem;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class miscellaneousRiderItems {


	//Card Warrior Kamen Rider
	public static Item card_warrior_kamen_rider_manga  = new Item_ore("card_warrior_kamen_rider_manga").keep_item().setCreativeTab(Tabs.tabmisc);
	
	public static Item grand_gouram_rod = new ItemBaseSword("grand_gouram_rod",Tabs.den_denso, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
	
	public static Item herculespader_sword= new ItemBaseSword("herculespader_sword",Tabs.ridol_stick, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
	
	public static Item darkwing_sword = new ItemBaseSword("darkwing_sword",Tabs.denkamen_sword, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
	
	public static Item flaresalamander_sword = new ItemBaseSword("flaresalamander_sword",Tabs.ridol_stick, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
		
	public static Item ryuki_dragreder_wings = new Item_ore("ryuki_dragreder_wings");
	public static Item dragreder = new Item_form_change("dragreder", RiderDriverItem.class,RiderItems.v_buckle_ryuki_survive,"_dragreder","ryuki"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(ryuki_dragreder_wings).Rend2ndLyer("dragreder").setCreativeTab(Tabs.tabmisc);

	public static Item agito_stagtornador_wings = new Item_ore("agito_stagtornador_wings");
	public static Item stagtornador = new Item_form_change("stagtornador",item_agitodriver.class,RiderItems.alter_ring_gr,"","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(agito_stagtornador_wings).Rend2ndLyer("agito_stagtornador").setCreativeTab(Tabs.tabmisc);

	public static Item herculespader_wings = new Item_ore("herculespader_wings");
	public static Item herculespader = new Item_form_change("herculespader", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","blade"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(herculespader_wings).Rend2ndLyer("herculespader").setCreativeTab(Tabs.tabmisc);

	public static Item knight_darkwing_wings = new Item_ore("knight_darkwing_wings");
	public static Item darkwing = new Item_form_change("darkwing", RiderDriverItem.class,RiderItems.v_buckle_knight_survive,"_darkwing","knight"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(knight_darkwing_wings).Rend2ndLyer("darkwing").setCreativeTab(Tabs.tabmisc);

	public static Item greywolch = new Item_form_change("greywolch", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","faiz"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 1,true,false)).Rend2ndLyer("faiz_greywolch").setCreativeTab(Tabs.tabmisc);

	public static Item grand_gouram_wings = new Item_ore("grand_gouram_wings");
	public static Item grand_gouram = new Item_form_change("grand_gouram", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"_grand_gouram","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false)).Rend2ndLyer("grand_gouram").addWing(grand_gouram_wings).setCreativeTab(Tabs.tabmisc);

	public static Item exbeeter_wings = new Item_ore("exbeeter_wings");
	public static Item exbeeter = new Item_form_change("exbeeter", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","kabuto"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 4,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false)).Rend2ndLyer("exbeeter").addWing(exbeeter_wings).setCreativeTab(Tabs.tabmisc);

	
	public static Item chaosdile = new Item_form_change("chaosdile", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","kaixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 1,true,false)).Rend2ndLyer("chaosdile").setCreativeTab(Tabs.tabmisc);

	public static Item leatheraider = new Item_form_change("leatheraider",item_agitodriver.class,ShowaRiderItems.blanknoitem,"_leatheraider","gills"
			,new PotionEffect(MobEffects.SPEED, 5, 4,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)).Rend2ndLyer("leatheraider").setCreativeTab(Tabs.tabmisc);
	
	public static Item v3_flaresalamander_wings = new Item_ore("v3_flaresalamander_wings");
	public static Item flaresalamander = new Item_form_change("flaresalamander", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","v3"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).addWing(v3_flaresalamander_wings).Rend2ndLyer("v3_flaresalamander").setCreativeTab(Tabs.tabmisc);

	public static Item ryuki_dragranzer_wings = new Item_ore("ryuki_dragranzer_wings");
	public static Item dragranzer = new Item_form_change("dragranzer", RiderDriverItem.class,RiderItems.v_buckle_ryuki_survive,"_dragranzer","ryuki"
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).addWing(ryuki_dragranzer_wings).Rend2ndLyer("dragranzer").setCreativeTab(Tabs.tabmisc);

	public static Item scissorbeeter_wings = new Item_ore("scissorbeeter_wings");
	public static Item scissorbeeter = new Item_form_change("scissorbeeter", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","gatack"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 4,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false)).Rend2ndLyer("scissorbeeter").addWing(scissorbeeter_wings).setCreativeTab(Tabs.tabmisc);

	
	public static Item akanetaka_wings = new Item_ore("akanetaka_wings");
	public static Item akanetaka = new Item_form_change("akanetaka", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","hibiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(akanetaka_wings).Rend2ndLyer("akanetaka").setCreativeTab(Tabs.tabmisc);

	public static Item shadowmantis_wings = new Item_ore("shadowmantis_wings");
	public static Item shadowmantis = new Item_form_change("shadowmantis", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","chalice"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(shadowmantis_wings).Rend2ndLyer("shadowmantis").setCreativeTab(Tabs.tabmisc);

	
	public static Item cyclonehopper_wings = new Item_ore("cyclonehopper_wings");
	public static Item cyclonehopper = new Item_form_change("cyclonehopper", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"_cyclonehopper","ichigo"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).addWing(cyclonehopper_wings).Rend2ndLyer("cyclonehopper").setCreativeTab(Tabs.tabmisc);

	
	public static Item jinrai_no_senshi_wings = new Item_ore("jinrai_no_senshi_wings");
	
	public static Item kuuga_jinrai_no_senshi = new Item_form_change("kuuga_jinrai_no_senshi", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"_rising_mighty_jinrai_no_senshi","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false)).addWing(jinrai_no_senshi_wings).Rend2ndLyer("kuuga_jinrai_no_senshi");

	public static Item blade_jinrai_no_senshi = new Item_form_change("blade_jinrai_no_senshi", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"_jack","blade"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).Rend2ndLyer("blade_jinrai_no_senshi").addWing(jinrai_no_senshi_wings);

	public static Item dark_kabuto_jinrai_no_senshi = new Item_form_change("dark_kabuto_jinrai_no_senshi", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"","dark_kabuto"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).Rend2ndLyer("dark_kabuto_jinrai_no_senshi").addWing(jinrai_no_senshi_wings)
			.addAlternative((Item_form_change) blade_jinrai_no_senshi).addAlternative((Item_form_change) kuuga_jinrai_no_senshi).setCreativeTab(Tabs.tabmisc);

	public static Item bakuen_no_senshi_wings = new Item_ore("bakuen_no_senshi_wings");
	public static Item bakuen_no_senshi_hibiki_wings = new Item_ore("bakuen_no_senshi_hibiki_wings");
	
	public static Item bakuen_no_senshi_ryuga = new Item_form_change("bakuen_no_senshi_ryuga", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"_bakuen_no_senshi","ryuga"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).Rend2ndLyer("bakuen_no_senshi_ryuga").addWing(bakuen_no_senshi_wings);

	public static Item bakuen_no_senshi_faiz = new Item_form_change("bakuen_no_senshi_faiz", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"_blaster","faiz"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).Rend2ndLyer("bakuen_no_senshi_faiz").addWing(bakuen_no_senshi_hibiki_wings);

	public static Item bakuen_no_senshi_hibiki = new Item_form_change("bakuen_no_senshi_hibiki", RiderDriverItem.class,ShowaRiderItems.blanknoitem,"_kurenai","hibiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false)).Rend2ndLyer("bakuen_no_senshi_hibiki").addWing(bakuen_no_senshi_wings)
			.addAlternative((Item_form_change) bakuen_no_senshi_faiz).addAlternative((Item_form_change) bakuen_no_senshi_ryuga).setCreativeTab(Tabs.tabmisc);	

	public static void init() {
		
	}
}



