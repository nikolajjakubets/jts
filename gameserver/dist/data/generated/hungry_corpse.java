package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hungry_corpse extends party_private_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 386)) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 386)) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 386)) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 663) == 1 && gg.GetMemoState(target, 663) >= 1 && gg.GetMemoState(target, 663) <= 4) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 663) == 1 && gg.GetMemoState(target, 663) >= 1 && gg.GetMemoState(target, 663) <= 4) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 663) == 1 && gg.GetMemoState(target, 663) >= 1 && gg.GetMemoState(target, 663) <= 4) {
random1_list.SetInfo(2, target);

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
myself.SetCurrentQuestID(336);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 100) {
myself.GiveItem1(target, 3490, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(386);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 184) {
myself.GiveItem1(target, 6363, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(663);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 460) {
myself.GiveItem1(target, 8766, 1);
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