package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class phojett extends merchant {
protected Object[][] SellList1 = {
{"hose_of_devotion";10;0.000000;0}, {"tunic_of_devotion";10;0.000000;0}, {"hose_of_magicpower";10;0.000000;0}, {"tunic_of_magicpower";10;0.000000;0}, {"cursed_hose";10;0.000000;0}, {"cursed_tunic";10;0.000000;0}, {"dark_hose";10;0.000000;0}, {"white_tunic";10;0.000000;0}, {"mage's_hose";10;0.000000;0}, {"mage's_tunic";10;0.000000;0}, {"hose_of_knowledge";10;0.000000;0}, {"tunic_of_knowledge";10;0.000000;0}, {"mithril_hose";10;0.000000;0}, {"mithril_tunic";10;0.000000;0}, {"sage's_rag";10;0.000000;0}, {"round_shield";10;0.000000;0}, {"bone_shield";10;0.000000;0}, {"bronze_shield";10;0.000000;0}, {"aspis";10;0.000000;0}, {"hoplon";10;0.000000;0}, {"kite_shield";10;0.000000;0}, {"brigandine_shield";10;0.000000;0}, {"square_shield";10;0.000000;0}, {"plate_shield";10;0.000000;0}, {"leather_gloves";10;0.000000;0}, {"bracer";10;0.000000;0}, {"excellence_leather_gloves";10;0.000000;0}, {"leather_gauntlet";10;0.000000;0}, {"gauntlet";10;0.000000;0}, {"gauntlet_of_repose_of_the_soul";10;0.000000;0}, {"gloves_of_knowledge";10;0.000000;0}, {"elven_mithril_gloves";10;0.000000;0}, {"mithril_glove";10;0.000000;0}, {"ogre_power_gauntlet";10;0.000000;0}, {"sage's_worn_gloves";10;0.000000;0}, {"demon's_gloves";10;0.000000;0}, {"blessed_gloves";10;0.000000;0}, {"low_boots";10;0.000000;0}, {"boots";10;0.000000;0}, {"leather_boots";10;0.000000;0}, {"blue_buckskin_boots";10;0.000000;0}, {"iron_boots";10;0.000000;0}, {"boots_of_power";10;0.000000;0}, {"boots_of_knowledge";10;0.000000;0}, {"elven_mithril_boots";10;0.000000;0}, {"assault_boots";10;0.000000;0}, {"slamander_skin_boots";10;0.000000;0}, {"plate_boots";10;0.000000;0}, {"demon's_boots";10;0.000000;0}, {"leather_helmet";10;0.000000;0}, {"hard_leather_helmet";10;0.000000;0}, {"bone_helmet";10;0.000000;0}, {"bronze_helmet";10;0.000000;0}, {"helmet";10;0.000000;0}, {"brigandine_helmet";10;0.000000;0}, {"plate_helmet";10;0.000000;0}, {"karmian_tunic";10;0.000000;0}, {"karmian_hose";10;0.000000;0}, {"karmian_boots";10;0.000000;0}, {"karmian_gloves";10;0.000000;0}, {"robe_of_seal";10;0.000000;0}, {"demon's_hose";10;0.000000;0}, {"divine_hose";10;0.000000;0}, {"demon's_tunic";10;0.000000;0}, {"divine_tunic";10;0.000000;0}, {"tshirt";10;0.000000;0}, {"cotton_tshirt";10;0.000000;0}, {"pattern_tshirt";10;0.000000;0}, {"pattern_cotton_tshirt";10;0.000000;0}
};
protected Object[][] SellList5 = {
{"cursed_hose_low";10;0.000000;0}, {"cursed_tunic_low";10;0.000000;0}, {"dark_hose_low";10;0.000000;0}, {"white_tunic_low";10;0.000000;0}, {"mage's_hose_low";10;0.000000;0}, {"mage's_tunic_low";10;0.000000;0}, {"hose_of_knowledge_low";10;0.000000;0}, {"tunic_of_knowledge_low";10;0.000000;0}, {"mithril_hose_low";10;0.000000;0}, {"mithril_tunic_low";10;0.000000;0}, {"sage's_rag_low";10;0.000000;0}, {"bronze_shield_low";10;0.000000;0}, {"aspis_low";10;0.000000;0}, {"hoplon_low";10;0.000000;0}, {"kite_shield_low";10;0.000000;0}, {"brigandine_shield_low";10;0.000000;0}, {"square_shield_low";10;0.000000;0}, {"plate_shield_low";10;0.000000;0}, {"excellence_leather_gloves_low";10;0.000000;0}, {"leather_gauntlet_low";10;0.000000;0}, {"gauntlet_low";10;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";10;0.000000;0}, {"gloves_of_knowledge_low";10;0.000000;0}, {"elven_mithril_gloves_low";10;0.000000;0}, {"mithril_glove_low";10;0.000000;0}, {"ogre_power_gauntlet_low";10;0.000000;0}, {"sage's_worn_gloves_low";10;0.000000;0}, {"leather_boots_low";10;0.000000;0}, {"blue_buckskin_boots_low";10;0.000000;0}, {"iron_boots_low";10;0.000000;0}, {"boots_of_power_low";10;0.000000;0}, {"boots_of_knowledge_low";10;0.000000;0}, {"elven_mithril_boots_low";10;0.000000;0}, {"demon's_gloves_low";10;0.000000;0}, {"blessed_gloves_low";10;0.000000;0}, {"assault_boots_low";10;0.000000;0}, {"slamander_skin_boots_low";10;0.000000;0}, {"plate_boots_low";10;0.000000;0}, {"demon's_boots_low";10;0.000000;0}, {"bone_helmet_low";10;0.000000;0}, {"bronze_helmet_low";10;0.000000;0}, {"helmet_low";10;0.000000;0}, {"brigandine_helmet_low";10;0.000000;0}, {"plate_helmet_low";10;0.000000;0}, {"karmian_tunic_low";10;0.000000;0}, {"karmian_hose_low";10;0.000000;0}, {"karmian_boots_low";10;0.000000;0}, {"karmian_gloves_low";10;0.000000;0}, {"robe_of_seal_low";10;0.000000;0}, {"demon's_hose_low";10;0.000000;0}, {"divine_hose_low";10;0.000000;0}, {"demon's_tunic_low";10;0.000000;0}, {"divine_tunic_low";10;0.000000;0}
};

}