package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chest_of_bifrons extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 5) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Subjugation of Lizardmen (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 5) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "chest_of_bifrons_q0340_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(340);
if (timer_id == 3401) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(340);
myself.AddTimerEx(3401, 30 * 1000);
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 340) {
myself.SetCurrentQuestID(340);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 340) {
if (reply == 1) {
if (gg.HaveMemo(talker, 340) == 1 && gg.GetMemoState(talker, 340) == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 340, 6);
myself.SetFlagJournal(talker, 340, 6);
myself.ShowQuestMark(talker, 340);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "chest_of_bifrons_q0340_02.htm");
myself.GiveItem1(talker, 4258, 1);

}

} else {
myself.ShowPage(talker, "chest_of_bifrons_q0340_03.htm");

}

}

}
super;
	}


}