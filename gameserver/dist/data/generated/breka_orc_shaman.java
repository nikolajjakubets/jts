package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class breka_orc_shaman extends wizard_pa_ddmagic2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3125) == 1 && gg.OwnItemCount(target, 3127) == 1 && gg.OwnItemCount(target, 3128) < 30) {
always_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3125) == 1 && gg.OwnItemCount(target, 3127) == 1 && gg.OwnItemCount(target, 3128) < 30) {
always_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3125) == 1 && gg.OwnItemCount(target, 3127) == 1 && gg.OwnItemCount(target, 3128) < 30) {
always_list.SetInfo(3, target);

}

}

}
target = last_attacker;
always_list.SetInfo(4, target);
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3741) && gg.OwnItemCount(target, 3783) < 50) {
random1_list.SetInfo(5, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 64) == 1 && gg.GetMemoState(target, 64) == 2 && gg.OwnItemCount(target, 9754) < 20) {
always_list.SetInfo(6, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(7, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(7, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(7, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(224);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 6 && gg.OwnItemCount(c1, 3299) < 10) {
if (gg.OwnItemCount(c1, 3299) == 9) {
myself.GiveItem1(c1, 3299, 1);
myself.GiveItem1(c1, 3301, 1);
myself.SetMemoState(c1, 224, 7);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 224, 7);
myself.ShowQuestMark(c1, 224);

} else {
myself.GiveItem1(c1, 3299, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3349) && gg.OwnItemCount(c1, 3341) < 30) {
if (gg.OwnItemCount(c1, 3341) >= 28) {
myself.GiveItem1(c1, 3341, 2);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3341, 2);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(232);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 232) == 1 && gg.OwnItemCount(c1, 3391) == 1 && gg.OwnItemCount(c1, 3392) == 1 && gg.OwnItemCount(c1, 3397) == 1 && gg.OwnItemCount(c1, 3400) == 0 && gg.OwnItemCount(c1, 3399) == 0) {
if (gg.OwnItemCount(c1, 3398) < 20 && gg.Rand(100) <= 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3398, 2);
if (gg.OwnItemCount(c1, 3398) >= 18) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(216);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(216);
if (gg.OwnItemCount(target, 3128) >= 29) {
myself.GiveItem1(target, 3128, 1);
myself.DeleteItem1(target, 3127, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 3128, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(214);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 214) && gg.OwnItemCount(c1, 2676) == 1 && gg.OwnItemCount(c1, 2690) == 1 && gg.OwnItemCount(c1, 2694) == 1 && gg.OwnItemCount(c1, 2696) < 5) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2696, 1);
if (gg.OwnItemCount(c1, 2695) >= 5 && gg.OwnItemCount(c1, 2696) >= 4 && gg.OwnItemCount(c1, 2697) >= 2) {
myself.SetFlagJournal(c1, 214, 17);
myself.ShowQuestMark(c1, 214);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(64);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 9754) >= 19) {
myself.GiveItem1(target, 9754, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 64, 3);
myself.ShowQuestMark(target, 64);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 9754, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 5: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 93) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3783, 1);
if (gg.OwnItemCount(target, 3783) >= 50) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 255) {
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