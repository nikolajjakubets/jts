package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class q_fallen_angel_mon extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
always_list.SetInfo(0, target);
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
always_list.SetInfo(0, target);

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(142);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (gg.IsNull(npc0) == 0) {
if (npc0.i_quest0 == 1) {
if (gg.IsNull(c0) == 0) {
npc0.i_quest0 = 0;
if (gg.HaveMemo(c0, 142) == 1 && gg.GetMemoState(c0, 142) == 8 && myself.GetOneTimeQuestFlag(c0, 142) == 0) {
myself.SetMemoState(c0, 142, 9);
myself.SetFlagJournal(c0, 142, 6);
myself.ShowQuestMark(c0, 142);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.GiveItem1(c0, 10353, 1);

}

}

}

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
code_info.code;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(142);
if (timer_id == 14201) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (gg.IsNull(npc0) == 0) {
if (npc0.i_quest0 == 1) {
if (gg.IsNull(c0) == 0) {
npc0.i_quest0 = 0;

}

}

}
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(142);
myself.AddTimerEx(14201, 1000 * 120);
super;
	}


}