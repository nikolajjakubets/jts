package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class denkus extends merchant {
protected Object[][] SellList0 = {
{"necklace_of_wisdom";10;0.000000;0}, {"blue_diamond_necklace";10;0.000000;0}, {"necklace_of_devotion";10;0.000000;0}, {"enchanted_necklace";10;0.000000;0}, {"near_forest_necklace";10;0.000000;0}, {"elven_necklace";10;0.000000;0}, {"cat'seye_earing";10;0.000000;0}, {"coral_earing";10;0.000000;0}, {"red_cresent_earing";10;0.000000;0}, {"enchanted_earing";10;0.000000;0}, {"tiger'seye_earing";10;0.000000;0}, {"elven_earing";10;0.000000;0}, {"ring_of_wisdom";10;0.000000;0}, {"blue_coral_ring";10;0.000000;0}, {"ring_of_devotion";10;0.000000;0}, {"enchanted_ring";10;0.000000;0}, {"black_pearl_ring";10;0.000000;0}, {"elven_ring";10;0.000000;0}, {"onyxbeast'seye_earing";10;0.000000;0}, {"mithril_ring";10;0.000000;0}, {"necklace_of_darkness";10;0.000000;0}
};
protected Object[][] SellList1 = {
{"sb_adv_defence_power1";10;0.000000;0}, {"sb_advanced_attack_power1";10;0.000000;0}, {"sb_might1";10;0.000000;0}, {"sb_battle_heal1";10;0.000000;0}, {"sb_vampiric_touch1";10;0.000000;0}, {"sb_ice_bolt1";10;0.000000;0}, {"sb_heal1";10;0.000000;0}, {"sb_group_heal1";10;0.000000;0}, {"sb_shield1";10;0.000000;0}, {"sb_breeze1";10;0.000000;0}, {"sb_wind_walk1";10;0.000000;0}, {"sb_curse:weakness";10;0.000000;0}, {"sb_curse:poison1";10;0.000000;0}, {"sb_cure_poison1";10;0.000000;0}, {"sb_flame_strike1";10;0.000000;0}, {"sb_drain_energy1";10;0.000000;0}, {"sb_elemental_heal1";10;0.000000;0}, {"sb_disrupt_undead1";10;0.000000;0}, {"sb_resurrection1";10;0.000000;0}, {"sb_blaze1";10;0.000000;0}, {"sb_summon_shadow1";10;0.000000;0}, {"sb_summon_silhouette1";10;0.000000;0}, {"sb_summon_unicorn_boxer1";10;0.000000;0}, {"sb_summon_blackcat1";10;0.000000;0}, {"sb_servitor_heal1";10;0.000000;0}, {"sb_aqua_swirl1";10;0.000000;0}, {"sb_arcane_acumen1";10;0.000000;0}, {"sb_energy_bolt1";10;0.000000;0}, {"sb_aura_burn1";10;0.000000;0}, {"sb_charm11";10;0.000000;0}, {"sb_concentration1";10;0.000000;0}, {"sb_water_breathing";10;0.000000;0}, {"sb_twister1";10;0.000000;0}, {"sb_poison1";10;0.000000;0}, {"sb_poison_recovery1";10;0.000000;0}, {"sb_confusion1";10;0.000000;0}, {"sb_cure_bleeding1";10;0.000000;0}, {"sb_dryad_root1";10;0.000000;0}, {"sb_mental_shield1";10;0.000000;0}, {"sb_body_to_mind1";10;0.000000;0}, {"sb_shadow_spark1";10;0.000000;0}, {"sb_surrender_to_earth1";10;0.000000;0}, {"sb_surrender_to_fire1";10;0.000000;0}, {"sb_surrender_to_poison1";10;0.000000;0}, {"sb_summon_cuti_cat1";10;0.000000;0}, {"sb_summon_unicorn_mirage1";10;0.000000;0}, {"sb_servitor_mana_charge1";10;0.000000;0}, {"sb_solar_spark1";10;0.000000;0}, {"sb_agility1";10;0.000000;0}, {"sb_empower1";10;0.000000;0}, {"sb_poison_cloud1";10;0.000000;0}, {"sb_focus1";10;0.000000;0}, {"sb_holy_weapon1";10;0.000000;0}, {"sb_touch_of_god1";10;0.000000;0}, {"sb_fire_resist1";10;0.000000;0}, {"sb_recharge1";10;0.000000;0}, {"sb_vampiric_rage1";10;0.000000;0}, {"sb_sleep1";10;0.000000;0}, {"sb_corpse_life_drain1";10;0.000000;0}, {"sb_decrease_weight1";10;0.000000;0}, {"sb_auqa_resist1";10;0.000000;0}, {"sb_wind_resist1";10;0.000000;0}, {"sb_resist_poison1";10;0.000000;0}, {"sb_regeneration1";10;0.000000;0}, {"sb_mighty_servitor1";10;0.000000;0}, {"sb_berserker_spirit1";10;0.000000;0}, {"sb_bright_servitor1";10;0.000000;0}, {"sb_slow1";10;0.000000;0}, {"sb_curse_bleary1";10;0.000000;0}, {"sb_fast_servitor1";10;0.000000;0}, {"sb_erase_hostility1";10;0.000000;0}, {"sb_speed_walk1";10;0.000000;0}, {"sb_zero_g1";10;0.000000;0}, {"sb_power_break1";10;0.000000;0}, {"sb_freezing_strike1";10;0.000000;0}, {"sb_night_murmur1";10;0.000000;0}, {"sb_blood_lust1";10;0.000000;0}, {"sb_pain_thorn1";10;0.000000;0}, {"sb_devotioin_of_shine1";10;0.000000;0}, {"sb_chill_flame1";10;0.000000;0}, {"sb_mass_frenzy1";10;0.000000;0}, {"sb_external_fear1";10;0.000000;0}, {"sb_entice_madness1";10;0.000000;0}, {"sb_pain_edge1";10;0.000000;0}, {"sb_inspire_life_force1";10;0.000000;0}, {"sb_fallen_arrow1";10;0.000000;0}, {"sb_fallen_attack1";10;0.000000;0}, {"sb_rapid_attack1";10;0.000000;0}, {"sb_increase_power1";10;0.000000;0}, {"sb_detect_trap1";10;0.000000;0}, {"sb_defuse_trap1";10;0.000000;0}, {"sb_dark_strike1";10;0.000000;0}, {"sb_double_thrust1";10;0.000000;0}, {"sb_abyssal_blaze1";10;0.000000;0}, {"sb_penetrate_short1";10;0.000000;0}, {"sb_erase_mark1";10;0.000000;0}, {"sb_change_weapon1";10;0.000000;0}, {"sb_furious_soul1";10;0.000000;0}, {"sb_dark_explosion1";10;0.000000;0}, {"sb_death_mark1";10;0.000000;0}, {"sb_fire_trap1";10;0.000000;0}, {"sb_fast_shot1";10;0.000000;0}, {"sb_surrender_to_unholy1";10;0.000000;0}, {"sb_rush1";10;0.000000;0}, {"sb_warf1";10;0.000000;0}, {"sb_soul_shock1";10;0.000000;0}, {"sb_sword_shield1";10;0.000000;0}, {"sb_courage1";10;0.000000;0}, {"sb_disarm1";10;0.000000;0}
};
protected Object[][] SellList4 = {
{"necklace_of_devotion_low";10;0.000000;0}, {"enchanted_necklace_low";10;0.000000;0}, {"near_forest_necklace_low";10;0.000000;0}, {"elven_necklace_low";10;0.000000;0}, {"red_cresent_earing_low";10;0.000000;0}, {"enchanted_earing_low";10;0.000000;0}, {"tiger'seye_earing_low";10;0.000000;0}, {"elven_earing_low";10;0.000000;0}, {"ring_of_devotion_low";10;0.000000;0}, {"enchanted_ring_low";10;0.000000;0}, {"black_pearl_ring_low";10;0.000000;0}, {"elven_ring_low";10;0.000000;0}, {"onyxbeast'seye_earing_low";10;0.000000;0}, {"mithril_ring_low";10;0.000000;0}, {"necklace_of_darkness_low";10;0.000000;0}
};

}