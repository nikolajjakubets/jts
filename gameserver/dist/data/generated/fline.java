package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fline extends warrior_passive_casting_ddmagic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 420) == 1 && gg.OwnItemCount(target, 3817) == 1) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3754) && gg.OwnItemCount(target, 3796) < 40) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(420);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 30) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(target, 3817, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 420, 10);
myself.Say(gg.MakeFString(42048, "", "", "", "", ""));

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
target.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(100) < 59) {
myself.GiveItem1(target, 3796, 1);
if (gg.OwnItemCount(target, 3796) >= 40) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
if (gg.Rand(20) < 2) {
myself.CreateOnePrivate(1027149, "gremlin_filcher", 0, 1);
myself.Say(gg.MakeFString(33512, "", "", "", "", ""));

}

}
break;

}

}

}
super;
	}


}