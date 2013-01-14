package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class vuku_chief_driko extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3230) == 0 && gg.OwnItemCount(talker, 3233) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3230) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3233) && gg.OwnItemCount(talker, 3234) < 30) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3233) && gg.OwnItemCount(talker, 3234) >= 30) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Glory (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3230) == 0 && gg.OwnItemCount(talker, 3233) == 0) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vuku_chief_driko_q0220_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3230) == 1) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vuku_chief_driko_q0220_02.htm");
myself.DeleteRadar(talker, -2150, 124443, -3724, 1);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3233) && gg.OwnItemCount(talker, 3234) < 30) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vuku_chief_driko_q0220_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3233) && gg.OwnItemCount(talker, 3234) >= 30) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "vuku_chief_driko_q0220_05.htm");
myself.GiveItem1(talker, 3213, 1);
myself.DeleteItem1(talker, 3234, gg.OwnItemCount(talker, 3234));
myself.DeleteItem1(talker, 3233, gg.OwnItemCount(talker, 3233));
if (gg.OwnItemCount(talker, 3214) >= 1 && gg.OwnItemCount(talker, 3212) >= 1 && gg.OwnItemCount(talker, 3211) >= 1 && gg.OwnItemCount(talker, 3215) >= 1) {
myself.SetFlagJournal(talker, 220, 5);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3213)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vuku_chief_driko_q0220_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vuku_chief_driko_q0220_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 220) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 220) {
if (reply == 1 && gg.OwnItemCount(talker, 3230) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "vuku_chief_driko_q0220_03.htm");
myself.GiveItem1(talker, 3233, 1);
myself.DeleteItem1(talker, 3230, 1);

}

}

}
super;
	}


}