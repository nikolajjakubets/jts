package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grave_guard extends warrior_aggressive_casting_ddmagic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 384)) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 384)) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 384)) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(503);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c2 = myself.Pledge_GetLeader(c1);
if (myself.IsNullCreature(c2) == 0) {
if (gg.HaveMemo(c2, 503) == 1 && gg.GetMemoState(c2, 503) < 8511 && gg.GetMemoState(c2, 503) >= 8500 && myself.DistFromMe(c2) <= 1500) {
myself.SetMemoState(c2, 503, gg.GetMemoState(c2, 503) + 1);
if (gg.GetMemoState(c2, 503) >= 8505 && gg.Rand(100) < 50) {
myself.SetMemoState(c2, 503, 8500);
myself.CreateOnePrivate(1027179, "grave_keymaster", 0, 1);

} else if (gg.GetMemoState(c2, 503) >= 8510) {
myself.SetMemoState(c2, 503, 8500);
myself.CreateOnePrivate(1027179, "grave_keymaster", 0, 1);

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
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(384);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 312) {
myself.GiveItem1(target, 5964, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
super;
	}


}