package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class zenkin extends merchant {
protected Object[][] SellList0 = {
{"tights_pants";15;0.000000;0}, {"tights_shirt";15;0.000000;0}, {"bone_breastplate";15;0.000000;0}, {"bone_gaiters";15;0.000000;0}, {"piece_bone_breastplate";15;0.000000;0}, {"bronze_breastplate";15;0.000000;0}, {"hard_leather_gaiters";15;0.000000;0}, {"piece_bone_gaiters";15;0.000000;0}, {"hard_leather_shirt";15;0.000000;0}, {"bronze_gaiters";15;0.000000;0}, {"puma_skin_gaiters";15;0.000000;0}, {"ring_breastplate";15;0.000000;0}, {"iron_plate_gaiters";15;0.000000;0}, {"puma_skin_shirt";15;0.000000;0}, {"lion_skin_gaiters";15;0.000000;0}, {"lion_skin_shirt";15;0.000000;0}, {"mithril_breastplate";15;0.000000;0}, {"mithril_gaiters";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"bone_shield";15;0.000000;0}, {"bronze_shield";15;0.000000;0}, {"aspis";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"bracer";15;0.000000;0}, {"excellence_leather_gloves";15;0.000000;0}, {"leather_gauntlet";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"boots";15;0.000000;0}, {"leather_boots";15;0.000000;0}, {"blue_buckskin_boots";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"hard_leather_helmet";15;0.000000;0}, {"bone_helmet";15;0.000000;0}, {"bronze_helmet";15;0.000000;0}, {"mithril_banded_gaiters";15;0.000000;0}, {"mithril_banded_mail";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"cotton_tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}, {"pattern_cotton_tshirt";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose_of_devotion";15;0.000000;0}, {"tunic_of_devotion";15;0.000000;0}, {"hose_of_magicpower";15;0.000000;0}, {"tunic_of_magicpower";15;0.000000;0}, {"cursed_hose";15;0.000000;0}, {"cursed_tunic";15;0.000000;0}, {"dark_hose";15;0.000000;0}, {"white_tunic";15;0.000000;0}, {"mage's_hose";15;0.000000;0}, {"mage's_tunic";15;0.000000;0}, {"hose_of_knowledge";15;0.000000;0}, {"tunic_of_knowledge";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"bone_shield";15;0.000000;0}, {"bronze_shield";15;0.000000;0}, {"aspis";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"bracer";15;0.000000;0}, {"excellence_leather_gloves";15;0.000000;0}, {"leather_gauntlet";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"boots";15;0.000000;0}, {"leather_boots";15;0.000000;0}, {"blue_buckskin_boots";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"hard_leather_helmet";15;0.000000;0}, {"bone_helmet";15;0.000000;0}, {"bronze_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"cotton_tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}, {"pattern_cotton_tshirt";15;0.000000;0}
};
protected Object[][] SellList4 = {
{"puma_skin_gaiters_low";15;0.000000;0}, {"ring_breastplate_low";15;0.000000;0}, {"iron_plate_gaiters_low";15;0.000000;0}, {"puma_skin_shirt_low";15;0.000000;0}, {"lion_skin_gaiters_low";15;0.000000;0}, {"lion_skin_shirt_low";15;0.000000;0}, {"mithril_breastplate_low";15;0.000000;0}, {"mithril_gaiters_low";15;0.000000;0}, {"bronze_shield_low";15;0.000000;0}, {"aspis_low";15;0.000000;0}, {"excellence_leather_gloves_low";15;0.000000;0}, {"leather_gauntlet_low";15;0.000000;0}, {"leather_boots_low";15;0.000000;0}, {"blue_buckskin_boots_low";15;0.000000;0}, {"bone_helmet_low";15;0.000000;0}, {"bronze_helmet_low";15;0.000000;0}, {"mithril_banded_gaiters_low";15;0.000000;0}, {"mithril_banded_mail_low";15;0.000000;0}
};
protected Object[][] SellList5 = {
{"cursed_hose_low";15;0.000000;0}, {"cursed_tunic_low";15;0.000000;0}, {"dark_hose_low";15;0.000000;0}, {"white_tunic_low";15;0.000000;0}, {"mage's_hose_low";15;0.000000;0}, {"mage's_tunic_low";15;0.000000;0}, {"hose_of_knowledge_low";15;0.000000;0}, {"tunic_of_knowledge_low";15;0.000000;0}, {"bronze_shield_low";15;0.000000;0}, {"aspis_low";15;0.000000;0}, {"excellence_leather_gloves_low";15;0.000000;0}, {"leather_gauntlet_low";15;0.000000;0}, {"leather_boots_low";15;0.000000;0}, {"blue_buckskin_boots_low";15;0.000000;0}, {"bone_helmet_low";15;0.000000;0}, {"bronze_helmet_low";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 6) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 7) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) >= 8) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Fate's Whisper (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 6) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "zenkin_q0234_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 7) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "zenkin_q0234_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) >= 8) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "zenkin_q0234_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 234) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 234) {
if (reply == 1) {
myself.SetMemoState(talker, 234, 7);
myself.ShowPage(talker, "zenkin_q0234_02.htm");
myself.SetFlagJournal(talker, 234, 6);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}