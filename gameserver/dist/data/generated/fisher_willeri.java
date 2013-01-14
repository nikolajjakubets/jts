package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fisher_willeri extends fisher {
protected Object[][] SellList0 = {
{"green_lure_easy";20;0.000000;0}, {"violet_lure_easy";20;0.000000;0}, {"yellow_lure_easy";20;0.000000;0}, {"green_lure_average";20;0.000000;0}, {"violet_lure_average";20;0.000000;0}, {"yellow_lure_average";20;0.000000;0}, {"green_night_lure_average";20;0.000000;0}, {"violet_night_lure_average";20;0.000000;0}, {"yellow_night_lure_average";20;0.000000;0}, {"big_fish_lure_normal";20;0.000000;0}, {"big_fish_lure_night";20;0.000000;0}, {"big_fish_lure_easy";20;0.000000;0}, {"fp_babyduck_rod";20;0.000000;0}, {"fp_albatros_rod";20;0.000000;0}, {"fp_pelican_rod";20;0.000000;0}, {"fp_kingfisher_rod";20;0.000000;0}, {"fp_cygnus_pole";20;0.000000;0}, {"fp_triton_pole";20;0.000000;0}, {"fishing_manual";20;0.000000;0}, {"oblivion_green";20;0.000000;0}, {"oblivion_jade";20;0.000000;0}, {"oblivion_blue";20;0.000000;0}, {"oblivion_yellow";20;0.000000;0}, {"oblivion_orange";20;0.000000;0}, {"oblivion_violet";20;0.000000;0}, {"oblivion_red";20;0.000000;0}, {"oblivion_white";20;0.000000;0}, {"oblivion_recovery";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 48 && gg.HaveMemo(talker, 29) == 0 && myself.GetOneTimeQuestFlag(talker, 29) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Chest caught with a Bait of Earth");

}
if (talker.level < 48 && gg.HaveMemo(talker, 29) == 0 && myself.GetOneTimeQuestFlag(talker, 29) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Chest caught with a Bait of Earth");

}
if (gg.HaveMemo(talker, 29) == 0 && myself.GetOneTimeQuestFlag(talker, 29) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Chest caught with a Bait of Earth (Done)");

}
if (gg.HaveMemo(talker, 29) == 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0 && gg.GetMemoState(talker, 29) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Chest caught with a Bait of Earth (In Progress)");

}
if (gg.HaveMemo(talker, 29) == 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0 && gg.GetMemoState(talker, 29) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Chest caught with a Bait of Earth (In Progress)");

}
if (talker.level >= 48 && gg.HaveMemo(talker, 52) == 0 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Willie's Special Bait");

}
if (talker.level < 48 && gg.HaveMemo(talker, 52) == 0 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Willie's Special Bait");

}
if (gg.HaveMemo(talker, 52) == 0 && myself.GetOneTimeQuestFlag(talker, 52) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Willie's Special Bait (Done)");

}
if (gg.HaveMemo(talker, 52) == 1 && gg.GetMemoState(talker, 52) >= 1 * 10 + 1 && gg.GetMemoState(talker, 52) <= 1 * 10 + 2 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Willie's Special Bait (In Progress)");

}
if (gg.HaveMemo(talker, 426) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Quest for Fishing shot");

}
if (gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Quest for Fishing shot (In Progress)");

}
if (gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) >= 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Quest for Fishing shot (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 48 && gg.HaveMemo(talker, 29) == 0 && myself.GetOneTimeQuestFlag(talker, 29) == 0) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetOneTimeQuestFlag(talker, 52) == 1) {
myself.FHTML_SetFileName(fhtml0, "fisher_willeri_q0029_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 29);
myself.ShowQuestFHTML(talker, fhtml0, 29);

} else {
myself.ShowQuestPage(talker, "fisher_willeri_q0029_0102.htm", 29);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 48 && gg.HaveMemo(talker, 29) == 0 && myself.GetOneTimeQuestFlag(talker, 29) == 0) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fisher_willeri_q0029_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 29) == 0 && myself.GetOneTimeQuestFlag(talker, 29) == 1) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 29) == 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0 && gg.GetMemoState(talker, 29) == 1 * 10 + 1) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 6507) >= 1) {
myself.SetHTMLCookie(talker, 29, 1);
myself.ShowPage(talker, "fisher_willeri_q0029_0105.htm");

} else {
myself.ShowPage(talker, "fisher_willeri_q0029_0106.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 29) == 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0 && gg.GetMemoState(talker, 29) == 2 * 10 + 1) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fisher_willeri_q0029_0203.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || talker.level >= 48 && gg.HaveMemo(talker, 52) == 0 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
myself.SetCurrentQuestID(52);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "fisher_willeri_q0052_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 52);
myself.ShowQuestFHTML(talker, fhtml0, 52);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || talker.level < 48 && gg.HaveMemo(talker, 52) == 0 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
myself.SetCurrentQuestID(52);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fisher_willeri_q0052_0103.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 52) == 0 && myself.GetOneTimeQuestFlag(talker, 52) == 1) {
myself.SetCurrentQuestID(52);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 52) == 1 && gg.GetMemoState(talker, 52) >= 1 * 10 + 1 && gg.GetMemoState(talker, 52) <= 1 * 10 + 2 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
myself.SetCurrentQuestID(52);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 52) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7623) >= 100) {
myself.SetHTMLCookie(talker, 52, 1);
myself.ShowPage(talker, "fisher_willeri_q0052_0105.htm");

} else {
myself.ShowPage(talker, "fisher_willeri_q0052_0106.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 426) == 0) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "fisher_berix_q0426_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 426);
myself.ShowQuestFHTML(talker, fhtml0, 426);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) == 0) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fisher_berix_q0426_04.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 426) == 1 && gg.OwnItemCount(talker, 7586) >= 1) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "fisher_berix_q0426_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 29) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 29);
myself.ShowQuestMark(talker, 29);
myself.SetMemoState(talker, 29, 1 * 10 + 1);
gg.AddLog(1, talker, 29);
myself.SetFlagJournal(talker, 29, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "fisher_willeri_q0029_0104.htm", 29);

}
return;

}
if (quest_id == 52) {
myself.SetCurrentQuestID(52);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 52);
myself.ShowQuestMark(talker, 52);
myself.SetMemoState(talker, 52, 1 * 10 + 1);
gg.AddLog(1, talker, 52);
myself.SetFlagJournal(talker, 52, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "fisher_willeri_q0052_0104.htm", 52);

}
return;

}
if (quest_id == 426) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "fisher_berix_q0426_03.htm", 426);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 29) {
myself.SetCurrentQuestID(29);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 29) {
i0 = myself.GetHTMLCookie(talker, 29, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 29) == 1 && myself.GetOneTimeQuestFlag(talker, 29) == 0) {
if (gg.OwnItemCount(talker, 6507) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6507, 1);
myself.GiveItem1(talker, 7627, 1);
myself.ShowPage(talker, "fisher_willeri_q0029_0201.htm");
myself.SetMemoState(talker, 29, 2 * 10 + 1);
myself.SetFlagJournal(talker, 29, 2);
myself.ShowQuestMark(talker, 29);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "fisher_willeri_q0029_0202.htm");

}

}

}

}
if (ask == 52) {
myself.SetCurrentQuestID(52);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 52 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
i0 = myself.GetHTMLCookie(talker, 52, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 52) == 1 && myself.GetOneTimeQuestFlag(talker, 52) == 0) {
if (gg.OwnItemCount(talker, 7623) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7623, gg.OwnItemCount(talker, 7623));
myself.GiveItem1(talker, 7612, 4);

}
gg.AddLog(2, talker, 52);
myself.RemoveMemo(talker, 52);
myself.SetOneTimeQuestFlag(talker, 52, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "fisher_willeri_q0052_0201.htm");

} else {
myself.ShowPage(talker, "fisher_willeri_q0052_0202.htm");

}

}

}

}
if (ask == 426) {
myself.SetCurrentQuestID(426);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 426) {
if (reply == 1) {
myself.ShowPage(talker, "fisher_berix_q0426_06.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "fisher_berix_q0426_07.htm");

}
if (reply == 3) {
myself.RemoveMemo(talker, 426);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "fisher_berix_q0426_08.htm");

}

}
super;
	}


}