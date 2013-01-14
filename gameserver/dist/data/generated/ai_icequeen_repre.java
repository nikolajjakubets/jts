package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_repre extends citizen {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1) {
if (ask == 10284) {
if (reply == 1) {
myself.InstantZone_Enter(talker, 140, 0);

}

} else if (ask == 10285) {
if (reply == 1) {
myself.InstantZone_Enter(talker, 141, 0);

}

} else if (ask == 10286) {
if (reply == 1) {
myself.InstantZone_Enter(talker, 145, 0);

}

} else if (ask == 10287) {
if (reply == 1) {
myself.InstantZone_Enter(talker, 146, 0);

}

} else if (ask == -2317) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 16025) > 0) {
myself.ShowPage(talker, "repre004.htm");

} else {
myself.ShowPage(talker, "repre006.htm");

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 16027) > 0) {
myself.ShowPage(talker, "repre008.htm");

} else {
myself.ShowPage(talker, "repre007.htm");

}

} else if (reply == 3) {
if (gg.OwnItemCount(talker, 16025) > 0 && gg.OwnItemCount(talker, 16027) > 0) {
myself.DeleteItem1(talker, 16025, 1);
myself.DeleteItem1(talker, 16027, 1);
myself.GiveItem1(talker, 16026, 1);
myself.ShowPage(talker, "repre009.htm");

} else {
myself.ShowPage(talker, "repre011.htm");

}

}

}
super;
	}

	protected void INSTANT_ZONE_ENTER_RETURNED(HandlerParam talker, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam i2) {
if (reply == 0) {
if (gg.HaveMemo(talker, 10284) == 1 && gg.GetMemoState(talker, 10284) == 1) {
myself.ShowPage(talker, "repre_q10284_08.htm");

} else if (gg.HaveMemo(talker, 10285) == 1 && gg.GetMemoState(talker, 10285) == 1) {
myself.ShowPage(talker, "repre_q10285_08.htm");

} else if (gg.HaveMemo(talker, 10286) == 1 && gg.GetMemoState(talker, 10286) == 1) {
myself.ShowPage(talker, "repre_q10286_08.htm");

} else if (gg.HaveMemo(talker, 10287) == 1 && gg.GetMemoState(talker, 10287) == 1) {
myself.ShowPage(talker, "repre_q10287_08.htm");

}

} else if (reply == 1) {
if (gg.HaveMemo(talker, 10284) == 1 && gg.GetMemoState(talker, 10284) == 1) {
myself.SetFlagJournal(talker, 10284, 2);
myself.ShowQuestMark(talker, 10284);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveMemo(talker, 10285) == 1 && gg.GetMemoState(talker, 10285) == 1) {
myself.SetFlagJournal(talker, 10285, 2);
myself.ShowQuestMark(talker, 10285);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveMemo(talker, 10286) == 1 && gg.GetMemoState(talker, 10286) == 1) {
myself.SetFlagJournal(talker, 10286, 2);
myself.ShowQuestMark(talker, 10286);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveMemo(talker, 10287) == 1 && gg.GetMemoState(talker, 10287) == 1) {
myself.SetFlagJournal(talker, 10287, 2);
myself.ShowQuestMark(talker, 10287);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
gg.SendUIEvent(creature, 1, 0, 0, "0", "1", "0", gg.MakeFString(1801110, "", "", "", "", ""), "0", "0");
	}


}