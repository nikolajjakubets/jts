package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class orc_archer extends warrior_passive_use_bow {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.OwnItemCount(target, 1084) && gg.HaveMemo(target, 257)) {
random1_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(257);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 2) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 752, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
myself.GiveItem1(target, 752, 1);
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