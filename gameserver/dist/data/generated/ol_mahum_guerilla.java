package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ol_mahum_guerilla extends warrior_passive_run_away_to_clan {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(333);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 333) == 1 && gg.OwnItemCount(c1, 3672) >= 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(2) == 0) {
myself.GiveItem1(c1, 3849, 1);

}
if (gg.Rand(100) < 9) {
myself.GiveItem1(c1, 3441, 1);

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(709);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) <= 1500 && gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) / 10 == 2) {
i0 = c0.param1;
if (i0 >= 0) {
i1 = gg.Rand(100);
if (i1 < c0.param1) {
myself.CreateOnePrivateEx(1027392, "q_bloody_senior", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, myself.sm.id);

} else {
c0.param1 = i0 + 1;

}

} else {
c0.param1 = 1;

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


}