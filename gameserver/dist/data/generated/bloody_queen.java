package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bloody_queen extends warrior_ag_casting_3skill_magical2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.GetMemoState(target, 337) == 21011 || gg.GetMemoState(target, 337) == 21010 || gg.GetMemoState(target, 337) == 21001 || gg.GetMemoState(target, 337) == 21000 || gg.GetMemoState(target, 337) == 20011 || gg.GetMemoState(target, 337) == 20010 || gg.GetMemoState(target, 337) == 20001 || gg.GetMemoState(target, 337) == 20000 && gg.OwnItemCount(target, 3857) == 0 && gg.HaveMemo(target, 337) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.GetMemoState(target, 337) == 21011 || gg.GetMemoState(target, 337) == 21010 || gg.GetMemoState(target, 337) == 21001 || gg.GetMemoState(target, 337) == 21000 || gg.GetMemoState(target, 337) == 20011 || gg.GetMemoState(target, 337) == 20010 || gg.GetMemoState(target, 337) == 20001 || gg.GetMemoState(target, 337) == 20000 && gg.OwnItemCount(target, 3857) == 0 && gg.HaveMemo(target, 337) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.GetMemoState(target, 337) == 21011 || gg.GetMemoState(target, 337) == 21010 || gg.GetMemoState(target, 337) == 21001 || gg.GetMemoState(target, 337) == 21000 || gg.GetMemoState(target, 337) == 20011 || gg.GetMemoState(target, 337) == 20010 || gg.GetMemoState(target, 337) == 20001 || gg.GetMemoState(target, 337) == 20000 && gg.OwnItemCount(target, 3857) == 0 && gg.HaveMemo(target, 337) == 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 662)) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 662)) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 662)) {
random1_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(337);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);
myself.CreateOnePrivate(1027171, "sacrifice_of_sacrificed", 0, 1);

}
break;

}
case 1: {
myself.SetCurrentQuestID(662);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 232) {
myself.GiveItem1(target, 8765, 1);
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