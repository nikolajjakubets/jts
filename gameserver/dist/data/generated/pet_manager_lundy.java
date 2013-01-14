package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_manager_lundy extends pet_manager {
protected Object[][] SellList0 = {
{"iron_canine";20;0.000000;0}, {"shining_canine";20;0.000000;0}, {"ghost_canine";20;0.000000;0}, {"mithril_canine";20;0.000000;0}, {"sylvan_canine";20;0.000000;0}, {"orikarukon_canine";20;0.000000;0}, {"fang_of_saltydog";20;0.000000;0}, {"wolve's_leather_mail";20;0.000000;0}, {"wolves_hide_armor";20;0.000000;0}, {"wolves_hard_leather_mail";20;0.000000;0}, {"wolves_wooden_armor";20;0.000000;0}, {"wolves_ring_mail";20;0.000000;0}, {"wolves_bone_armor";20;0.000000;0}, {"wolves_scale_mail";20;0.000000;0}, {"food_for_wolves";20;0.000000;0}, {"greater_food_of_pet";20;0.000000;0}, {"viperbite";20;0.000000;0}, {"shadow_fang";20;0.000000;0}, {"alya_fang";20;0.000000;0}, {"torturer";20;0.000000;0}, {"serpentine_grinder";20;0.000000;0}, {"fang_of_dahak";20;0.000000;0}, {"hatchlings_scale_mail";20;0.000000;0}, {"hatchlings_brigandine";20;0.000000;0}, {"hatchlings_bronze_coat";20;0.000000;0}, {"hatchlings_steel_coat";20;0.000000;0}, {"hatchlings_gorgon_coat";20;0.000000;0}, {"hatchlings_ophidian_plate";20;0.000000;0}, {"food_for_hatchling";20;0.000000;0}, {"serpentine_spike";20;0.000000;0}, {"drake_horn";20;0.000000;0}, {"assault_alicorn";20;0.000000;0}, {"mithril_panzer_coat";20;0.000000;0}, {"brigandine_panzer_coat";20;0.000000;0}, {"draconic_panzer_coat";20;0.000000;0}, {"food_for_strider";20;0.000000;0}, {"beast_soul_shot";20;0.000000;0}, {"beast_spirit_shot";20;0.000000;0}, {"blessed_beast_spirit_shot";20;0.000000;0}, {"pet_food_baby_spice";20;0.000000;0}, {"pet_armor_little_harness";20;0.000000;0}, {"enchanted_wolf_canine";20;0.000000;0}, {"enchanted_coyote_canine";20;0.000000;0}, {"revolution_salty_dog_canine";20;0.000000;0}, {"black_mane_wolf_scale_armor";20;0.000000;0}, {"black_mane_wolf_bronze_armor";20;0.000000;0}, {"black_mane_wolf_plate_armor";20;0.000000;0}, {"revolution_wolf_food";20;0.000000;0}, {"beast_soul_shot_capsule";20;0.000000;0}, {"beast_spirit_shot_capsule";20;0.000000;0}, {"blessed_beast_spirit_shot_capsule";20;0.000000;0}, {"food_for_upgrade_baby_pet";20;0.000000;0}, {"baby_pet_scale_armor";20;0.000000;0}, {"baby_pet_bronze_armor";20;0.000000;0}, {"baby_pet_plate_armor";20;0.000000;0}, {"baby_pet_mithril_armor";20;0.000000;0}, {"baby_pet_oriharukon_armor";20;0.000000;0}, {"baby_pet_oricalcum_armor";20;0.000000;0}, {"pet_crystal_pandent";20;0.000000;0}, {"pet_rubi_pendant";20;0.000000;0}, {"pet_sapphire_pendant";20;0.000000;0}, {"pet_diamond_pendant";20;0.000000;0}, {"pet_enria_pendant";20;0.000000;0}, {"pet_thons_pendant";20;0.000000;0}, {"pet_asofe_pendant";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 24 && gg.HaveMemo(talker, 44) == 0 && myself.GetOneTimeQuestFlag(talker, 44) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Help the Son!");

}
if (talker.level < 24 && gg.HaveMemo(talker, 44) == 0 && myself.GetOneTimeQuestFlag(talker, 44) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Help the Son!");

}
if (gg.HaveMemo(talker, 44) == 0 && myself.GetOneTimeQuestFlag(talker, 44) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Help the Son! (Done)");

}
if (gg.HaveMemo(talker, 44) == 1 && myself.GetOneTimeQuestFlag(talker, 44) == 0 && gg.GetMemoState(talker, 44) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Help the Son! (In Progress)");

}
if (gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) <= 2 * 10 + 2 && gg.GetMemoState(talker, 44) >= 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Help the Son! (In Progress)");

}
if (gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Help the Son! (In Progress)");

}
if (gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Help the Son! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 24 && gg.HaveMemo(talker, 44) == 0 && myself.GetOneTimeQuestFlag(talker, 44) == 0) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "pet_manager_lundy_q0044_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 44);
myself.ShowQuestFHTML(talker, fhtml0, 44);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 24 && gg.HaveMemo(talker, 44) == 0 && myself.GetOneTimeQuestFlag(talker, 44) == 0) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_lundy_q0044_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 44) == 0 && myself.GetOneTimeQuestFlag(talker, 44) == 1) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 44) == 1 && myself.GetOneTimeQuestFlag(talker, 44) == 0 && gg.GetMemoState(talker, 44) == 1 * 10 + 1) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 168) >= 1) {
myself.SetHTMLCookie(talker, 44, 1);
myself.ShowPage(talker, "pet_manager_lundy_q0044_0105.htm");

} else {
myself.ShowPage(talker, "pet_manager_lundy_q0044_0106.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) <= 2 * 10 + 2 && gg.GetMemoState(talker, 44) >= 2 * 10 + 1) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 44) == 2 * 10 + 2 && gg.OwnItemCount(talker, 7552) >= 30) {
myself.SetHTMLCookie(talker, 44, 2);
myself.ShowPage(talker, "pet_manager_lundy_q0044_0203.htm");

} else {
myself.ShowPage(talker, "pet_manager_lundy_q0044_0204.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) == 3 * 10 + 1) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pet_manager_lundy_q0044_0303.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 44) == 1 && gg.GetMemoState(talker, 44) == 4 * 10 + 1) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 44, 4);
myself.ShowPage(talker, "pet_manager_lundy_q0044_0401.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 44) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 44);
myself.ShowQuestMark(talker, 44);
myself.SetMemoState(talker, 44, 1 * 10 + 1);
gg.AddLog(1, talker, 44);
myself.SetFlagJournal(talker, 44, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "pet_manager_lundy_q0044_0104.htm", 44);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 44) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 44) {
i0 = myself.GetHTMLCookie(talker, 44, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 44) == 1) {
if (gg.OwnItemCount(talker, 168) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 168, 1);
myself.ShowPage(talker, "pet_manager_lundy_q0044_0201.htm");
myself.SetMemoState(talker, 44, 2 * 10 + 1);
myself.SetFlagJournal(talker, 44, 2);
myself.ShowQuestMark(talker, 44);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pet_manager_lundy_q0044_0202.htm");

}

}

}

}
if (ask == 44) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 44) {
i0 = myself.GetHTMLCookie(talker, 44, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 44) == 1) {
if (gg.OwnItemCount(talker, 7552) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7552, 30);
myself.GiveItem1(talker, 7553, 1);
myself.ShowPage(talker, "pet_manager_lundy_q0044_0301.htm");
myself.SetMemoState(talker, 44, 3 * 10 + 1);
myself.SetFlagJournal(talker, 44, 4);
myself.ShowQuestMark(talker, 44);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "pet_manager_lundy_q0044_0302.htm");

}

}

}

}
if (ask == 44) {
myself.SetCurrentQuestID(44);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 44 && myself.GetOneTimeQuestFlag(talker, 44) == 0) {
i0 = myself.GetHTMLCookie(talker, 44, 5 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 44) == 1 && myself.GetOneTimeQuestFlag(talker, 44) == 0) {
if (gg.OwnItemCount(talker, 0) >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7585, 1);

}
gg.AddLog(2, talker, 44);
myself.RemoveMemo(talker, 44);
myself.SetOneTimeQuestFlag(talker, 44, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "pet_manager_lundy_q0044_0501.htm");

} else {
myself.ShowPage(talker, "pet_manager_lundy_q0044_0502.htm");

}

}

}

}
super;
	}


}