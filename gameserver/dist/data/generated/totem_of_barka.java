package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class totem_of_barka extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Magical Power of Water - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Magical Power of Water - Part 2 (In Progress)");

}
if (gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) >= 2 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Magical Power of Water - Part 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) == 1 * 10 + 1) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 610, 1);
myself.ShowPage(talker, "totem_of_barka_q0610_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) == 2 * 10 + 1) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.av_quest0.CompareExchange(1, 0) == 0) {
myself.CreateOnePrivateEx(1025316, "water_spirit_ashutar", 0, 0, 104825, -36926, -1136, 0, myself.sm.id, talker.dbid, 0);
myself.Despawn();
myself.ShowPage(talker, "totem_of_barka_q0610_0201.htm");

} else {
myself.ShowPage(talker, "totem_of_barka_q0610_0202.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 610) == 1 && gg.GetMemoState(talker, 610) >= 2 * 10 + 2) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "totem_of_barka_q0610_0204.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 610) {
myself.SetCurrentQuestID(610);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 610) {
i0 = myself.GetHTMLCookie(talker, 610, 2 - 1);
if (i0 != -1) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 7238) >= 1) {
if (myself.av_quest0.CompareExchange(1, 0) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7238, 1);
myself.ShowPage(talker, "totem_of_barka_q0610_0201.htm");
myself.CreateOnePrivateEx(1025316, "water_spirit_ashutar", 0, 0, 104825, -36926, -1136, 0, myself.sm.id, talker.dbid, 0);
myself.Despawn();
myself.SetMemoState(talker, 610, 2 * 10 + 1);
myself.SetFlagJournal(talker, 610, 2);
myself.ShowQuestMark(talker, 610);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "totem_of_barka_q0610_0202.htm");

}

} else {
myself.ShowPage(talker, "totem_of_barka_q0610_0203.htm");

}

}

}

}
super;
	}


}