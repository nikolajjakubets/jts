package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kanooth_26_boss extends inzone_raid_26_normal_boss {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 10276) == 1 && gg.GetMemoState(target, 10276) == 1 && gg.OwnItemCount(target, 13831) == 0) {
always_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 10276) == 1 && gg.GetMemoState(target, 10276) == 1 && gg.OwnItemCount(target, 13831) == 0) {
always_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 10276) == 1 && gg.GetMemoState(target, 10276) == 1 && gg.OwnItemCount(target, 13831) == 0) {
always_list.SetInfo(0, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(10276);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(10276);
myself.GiveItem1(target, 13831, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

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