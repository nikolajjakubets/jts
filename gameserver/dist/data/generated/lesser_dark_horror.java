package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lesser_dark_horror extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 169) == 1) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 419) == 1 && gg.OwnItemCount(target, 3420) == 1 && gg.OwnItemCount(target, 3425) < 50) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(169);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) > 7 && gg.OwnItemCount(target, 1031) == 0) {
myself.GiveItem1(target, 1031, 1);
myself.SetFlagJournal(target, 169, 2);
myself.ShowQuestMark(target, 169);
myself.SoundEffect(target, "ItemSound.quest_middle");

}
if (gg.Rand(10) > 4) {
myself.GiveItem1(target, 1030, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
myself.GiveItem1(target, 3425, 1);
if (gg.OwnItemCount(target, 3425) >= 50) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}

}

}
super;
	}


}