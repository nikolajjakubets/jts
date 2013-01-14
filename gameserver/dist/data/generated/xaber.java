package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class xaber extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4322) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4322) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8 && gg.GetMemoStateEx(talker, 65, 1) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8 && gg.GetMemoStateEx(talker, 65, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8 && gg.GetMemoStateEx(talker, 65, 1) == 10) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 9) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Certified Soul Breaker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4322) >= 1) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "xaber_q0364_01.htm");
myself.DeleteItem1(talker, 4322, 1);
if (gg.GetMemoState(talker, 364) == 3) {
myself.SetMemoState(talker, 364, 4);

} else if (gg.GetMemoState(talker, 364) == 2) {
myself.SetMemoState(talker, 364, 3);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4322) == 0) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "xaber_q0364_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8 && gg.GetMemoStateEx(talker, 65, 1) == 0) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoStateEx(talker, 65, 1, 1);
myself.ShowPage(talker, "xaber_q0065_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8 && gg.GetMemoStateEx(talker, 65, 1) == 1) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "xaber_q0065_01a.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8 && gg.GetMemoStateEx(talker, 65, 1) == 10) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 65, 9);
myself.SetMemoStateEx(talker, 65, 1, 0);
myself.ShowPage(talker, "xaber_q0065_02.htm");
myself.SetFlagJournal(talker, 65, 9);
myself.ShowQuestMark(talker, 65);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 9) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "xaber_q0065_03.htm");

}
break;

}

}
return;

}
super;
	}


}