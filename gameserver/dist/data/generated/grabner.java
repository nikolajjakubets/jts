package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grabner extends merchant {
protected Object[][] SellList0 = {
{"long_sword";10;0.000000;0}, {"throw_knife";10;0.000000;0}, {"bow_of_forest";10;0.000000;0}, {"short_spear";10;0.000000;0}, {"falchion";10;0.000000;0}, {"sword_breaker";10;0.000000;0}, {"composition_bow";10;0.000000;0}, {"buzdygan";10;0.000000;0}, {"iron_hammer";10;0.000000;0}, {"long_spear";10;0.000000;0}, {"saber";10;0.000000;0}, {"iron_sword";10;0.000000;0}, {"handiwork_dagger";10;0.000000;0}, {"assassin_knife";10;0.000000;0}, {"strengthening_bow";10;0.000000;0}, {"hand_axe";10;0.000000;0}, {"heavy_mace";10;0.000000;0}, {"work_hammer";10;0.000000;0}, {"trident";10;0.000000;0}, {"bastard_sword";10;0.000000;0}, {"artisan's_sword";10;0.000000;0}, {"poniard_dagger";10;0.000000;0}, {"long_bow";10;0.000000;0}, {"elven_bow";10;0.000000;0}, {"dark_elven_bow";10;0.000000;0}, {"tomahawk";10;0.000000;0}, {"pike";10;0.000000;0}, {"dwarven_trident";10;0.000000;0}, {"two-handed_sword";10;0.000000;0}, {"crimson_sword";10;0.000000;0}, {"elven_sword";10;0.000000;0}, {"kukuri";10;0.000000;0}, {"gastraphetes";10;0.000000;0}, {"spike_club";10;0.000000;0}, {"war_hammer";10;0.000000;0}, {"dwarven_pike";10;0.000000;0}, {"sword_of_revolution";10;0.000000;0}, {"maingauche";10;0.000000;0}, {"cursed_maingauche";10;0.000000;0}, {"strengthening_long_bow";10;0.000000;0}, {"tarbar";10;0.000000;0}, {"giants_sword";10;0.000000;0}, {"giants_hammer";10;0.000000;0}, {"heavy_bone_club";10;0.000000;0}, {"hammer_in_flames";10;0.000000;0}, {"morning_star";10;0.000000;0}, {"winged_spear";10;0.000000;0}, {"cestus";10;0.000000;0}, {"viper's_canine";10;0.000000;0}, {"bagh-nakh";10;0.000000;0}, {"single-edged_jamadhr";10;0.000000;0}, {"triple-edged_jamadhr";10;0.000000;0}, {"bich'hwa";10;0.000000;0}, {"claymore";10;0.000000;0}, {"bonebreaker";10;0.000000;0}, {"mithril_dagger";10;0.000000;0}, {"scallop_jamadhr";10;0.000000;0}, {"cyclone_bow";10;0.000000;0}, {"glaive";10;0.000000;0}, {"elven_long_sword";10;0.000000;0}, {"zweihander";10;0.000000;0}, {"heavy_sword";10;0.000000;0}, {"darkelven_dagger";10;0.000000;0}, {"chakram";10;0.000000;0}, {"crystallized_ice_bow";10;0.000000;0}, {"orcish_glaive";10;0.000000;0}, {"body_slasher";10;0.000000;0}, {"shamshir";10;0.000000;0}, {"katana";10;0.000000;0}, {"spirits_sword";10;0.000000;0}, {"raid_sword";10;0.000000;0}, {"stiletto";10;0.000000;0}, {"dwarven_warhammer";10;0.000000;0}, {"bech_de_corbin";10;0.000000;0}, {"elemental_bow";10;0.000000;0}, {"noble_elven_bow";10;0.000000;0}, {"knuckle_dust";10;0.000000;0}, {"caliburs";10;0.000000;0}, {"sword_of_delusion";10;0.000000;0}, {"tsurugi";10;0.000000;0}, {"sword_of_limit";10;0.000000;0}, {"sword_of_nightmare";10;0.000000;0}, {"war_axe";10;0.000000;0}, {"grace_dagger";10;0.000000;0}, {"dark_screamer";10;0.000000;0}, {"poleaxe";10;0.000000;0}, {"fist_blade";10;0.000000;0}, {"akat_long_bow";10;0.000000;0}, {"sword_of_paagrio";10;0.000000;0}, {"horn_of_karik";10;0.000000;0}, {"scorpion";10;0.000000;0}, {"widow_maker";10;0.000000;0}, {"samurai_longsword";10;0.000000;0}, {"crystal_dagger";10;0.000000;0}, {"yaksa_mace";10;0.000000;0}, {"great_pata";10;0.000000;0}, {"eminence_bow";10;0.000000;0}, {"orcish_poleaxe";10;0.000000;0}, {"berserker_blade";10;0.000000;0}, {"dwarven_hammer";10;0.000000;0}
};
protected Object[][] SellList4 = {
{"saber_low";10;0.000000;0}, {"iron_sword_low";10;0.000000;0}, {"handiwork_dagger_low";10;0.000000;0}, {"assassin_knife_low";10;0.000000;0}, {"strengthening_bow_low";10;0.000000;0}, {"hand_axe_low";10;0.000000;0}, {"heavy_mace_low";10;0.000000;0}, {"work_hammer_low";10;0.000000;0}, {"trident_low";10;0.000000;0}, {"bastard_sword_low";10;0.000000;0}, {"artisan's_sword_low";10;0.000000;0}, {"poniard_dagger_low";10;0.000000;0}, {"long_bow_low";10;0.000000;0}, {"elven_bow_low";10;0.000000;0}, {"dark_elven_bow_low";10;0.000000;0}, {"tomahawk_low";10;0.000000;0}, {"pike_low";10;0.000000;0}, {"dwarven_trident_low";10;0.000000;0}, {"two-handed_sword_low";10;0.000000;0}, {"crimson_sword_low";10;0.000000;0}, {"elven_sword_low";10;0.000000;0}, {"kukuri_low";10;0.000000;0}, {"gastraphetes_low";10;0.000000;0}, {"spike_club_low";10;0.000000;0}, {"war_hammer_low";10;0.000000;0}, {"dwarven_pike_low";10;0.000000;0}, {"sword_of_revolution_low";10;0.000000;0}, {"maingauche_low";10;0.000000;0}, {"cursed_maingauche_low";10;0.000000;0}, {"strengthening_long_bow_low";10;0.000000;0}, {"tarbar_low";10;0.000000;0}, {"giants_sword_low";10;0.000000;0}, {"giants_hammer_low";10;0.000000;0}, {"heavy_bone_club_low";10;0.000000;0}, {"hammer_in_flames_low";10;0.000000;0}, {"morning_star_low";10;0.000000;0}, {"winged_spear_low";10;0.000000;0}, {"bagh-nakh_low";10;0.000000;0}, {"single-edged_jamadhr_low";10;0.000000;0}, {"triple-edged_jamadhr_low";10;0.000000;0}, {"bich'hwa_low";10;0.000000;0}, {"heavy_sword_low";10;0.000000;0}, {"claymore_low";10;0.000000;0}, {"bonebreaker_low";10;0.000000;0}, {"mithril_dagger_low";10;0.000000;0}, {"scallop_jamadhr_low";10;0.000000;0}, {"cyclone_bow_low";10;0.000000;0}, {"glaive_low";10;0.000000;0}, {"elven_long_sword_low";10;0.000000;0}, {"darkelven_dagger_low";10;0.000000;0}, {"chakram_low";10;0.000000;0}, {"crystallized_ice_bow_low";10;0.000000;0}, {"orcish_glaive_low";10;0.000000;0}, {"body_slasher_low";10;0.000000;0}, {"shamshir_low";10;0.000000;0}, {"katana_low";10;0.000000;0}, {"spirits_sword_low";10;0.000000;0}, {"raid_sword_low";10;0.000000;0}, {"stiletto_low";10;0.000000;0}, {"dwarven_warhammer_low";10;0.000000;0}, {"bech_de_corbin_low";10;0.000000;0}, {"elemental_bow_low";10;0.000000;0}, {"noble_elven_bow_low";10;0.000000;0}, {"knuckle_dust_low";10;0.000000;0}, {"caliburs_low";10;0.000000;0}, {"sword_of_delusion_low";10;0.000000;0}, {"tsurugi_low";10;0.000000;0}, {"sword_of_limit_low";10;0.000000;0}, {"sword_of_nightmare_low";10;0.000000;0}, {"war_axe_low";10;0.000000;0}, {"grace_dagger_low";10;0.000000;0}, {"dark_screamer_low";10;0.000000;0}, {"poleaxe_low";10;0.000000;0}, {"fist_blade_low";10;0.000000;0}, {"akat_long_bow_low";10;0.000000;0}, {"sword_of_paagrio_low";10;0.000000;0}, {"horn_of_karik_low";10;0.000000;0}, {"scorpion_low";10;0.000000;0}, {"widow_maker_low";10;0.000000;0}, {"samurai_longsword_low";10;0.000000;0}, {"crystal_dagger_low";10;0.000000;0}, {"yaksa_mace_low";10;0.000000;0}, {"great_pata_low";10;0.000000;0}, {"eminence_bow_low";10;0.000000;0}, {"orcish_poleaxe_low";10;0.000000;0}, {"berserker_blade_low";10;0.000000;0}, {"dwarven_hammer_low";10;0.000000;0}
};

}