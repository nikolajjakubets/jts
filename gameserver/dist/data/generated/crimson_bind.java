package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crimson_bind extends warrior_passive_casting_enchant_self {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3733) && gg.OwnItemCount(target, 3775) < 50) {
random1_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 51) == 1 && myself.GetOneTimeQuestFlag(target, 51) == 0 && gg.GetMemoState(target, 51) == 1 * 10 + 1) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 51) == 1 && myself.GetOneTimeQuestFlag(target, 51) == 0 && gg.GetMemoState(target, 51) == 1 * 10 + 1) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 51) == 1 && myself.GetOneTimeQuestFlag(target, 51) == 0 && gg.GetMemoState(target, 51) == 1 * 10 + 1) {
random1_list.SetInfo(4, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(5, target);

}
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(5, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(5, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3349) && gg.OwnItemCount(c1, 3342) < 30) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3342) >= 24) {
myself.GiveItem1(c1, 3342, 6);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3342, 6);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(222);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 222) && gg.OwnItemCount(c1, 2765) > 0 && gg.OwnItemCount(c1, 2773) < 10 && gg.GetMemoState(c1, 222) == 1) {
i0 = gg.GetMemoStateEx(c1, 222, 1);
myself.SetMemoStateEx(c1, 222, 1, i0 + 1);
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2773, 1);
if (gg.OwnItemCount(c1, 2773) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (i0 >= 9) {
myself.SetFlagJournal(c1, 222, 3);
myself.SetMemoStateEx(c1, 222, 1, 0);

}

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(214);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 214) && gg.OwnItemCount(c1, 2705) == 1 && gg.OwnItemCount(c1, 2711) == 1 && gg.OwnItemCount(c1, 2715) == 1 && gg.OwnItemCount(c1, 2718) < 5) {
myself.GiveItem1(c1, 2718, 1);
if (gg.OwnItemCount(c1, 2718) >= 5) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
case 3: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3775, 1);
if (gg.OwnItemCount(target, 3775) >= 50) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(51);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000 && 1000 != 0) {
if (gg.OwnItemCount(target, 7622) + 1 >= 100) {
if (gg.OwnItemCount(target, 7622) < 100) {
myself.GiveItem1(target, 7622, 100 - gg.OwnItemCount(target, 7622));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 51, 2);
myself.ShowQuestMark(target, 51);

}
myself.SetMemoState(target, 51, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 7622, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(138);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 100) {
if (gg.OwnItemCount(target, 10342) >= 9) {
myself.GiveItem1(target, 10342, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 10342, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 65) {
myself.GiveItem1(target, 7586, 1);
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