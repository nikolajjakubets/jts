package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_ixia extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3176)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3177) && gg.OwnItemCount(talker, 3178) < 10 || gg.OwnItemCount(talker, 3179) < 10 || gg.OwnItemCount(talker, 3180) < 10 || gg.OwnItemCount(talker, 3181) < 10 || gg.OwnItemCount(talker, 3182) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3177) && gg.OwnItemCount(talker, 3178) >= 10 && gg.OwnItemCount(talker, 3179) >= 10 && gg.OwnItemCount(talker, 3180) >= 10 && gg.OwnItemCount(talker, 3181) >= 10 && gg.OwnItemCount(talker, 3182) >= 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3183)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3184) || gg.OwnItemCount(talker, 3185) || gg.OwnItemCount(talker, 3186) || gg.OwnItemCount(talker, 3187) || gg.OwnItemCount(talker, 3188) || gg.OwnItemCount(talker, 3189)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Fate (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3176)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_ixia_q0219_01.htm");
myself.GiveItem1(talker, 3177, 1);
myself.DeleteItem1(talker, 3176, 1);
myself.SetFlagJournal(talker, 219, 6);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3177) && gg.OwnItemCount(talker, 3178) < 10 || gg.OwnItemCount(talker, 3179) < 10 || gg.OwnItemCount(talker, 3180) < 10 || gg.OwnItemCount(talker, 3181) < 10 || gg.OwnItemCount(talker, 3182) < 10) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_ixia_q0219_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3177) && gg.OwnItemCount(talker, 3178) >= 10 && gg.OwnItemCount(talker, 3179) >= 10 && gg.OwnItemCount(talker, 3180) >= 10 && gg.OwnItemCount(talker, 3181) >= 10 && gg.OwnItemCount(talker, 3182) >= 10) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_ixia_q0219_03.htm");
myself.GiveItem1(talker, 3183, 1);
myself.DeleteItem1(talker, 3177, 1);
myself.DeleteItem1(talker, 3178, gg.OwnItemCount(talker, 3178));
myself.DeleteItem1(talker, 3181, gg.OwnItemCount(talker, 3181));
myself.DeleteItem1(talker, 3179, gg.OwnItemCount(talker, 3179));
myself.DeleteItem1(talker, 3180, gg.OwnItemCount(talker, 3180));
myself.DeleteItem1(talker, 3182, gg.OwnItemCount(talker, 3182));
myself.SetFlagJournal(talker, 219, 8);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3183)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_ixia_q0219_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3184) || gg.OwnItemCount(talker, 3185) || gg.OwnItemCount(talker, 3186) || gg.OwnItemCount(talker, 3187) || gg.OwnItemCount(talker, 3188) || gg.OwnItemCount(talker, 3189)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_ixia_q0219_05.htm");

}
break;

}

}
return;

}
super;
	}


}