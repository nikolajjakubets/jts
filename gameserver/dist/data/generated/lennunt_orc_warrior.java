package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lennunt_orc_warrior extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.OwnItemCount(target, 937) > 0 && gg.OwnItemCount(target, 741) == 0 || gg.OwnItemCount(target, 740) == 0) {
random1_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(101);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 741) == 0) {
if (gg.Rand(5) == 0) {
myself.GiveItem1(target, 741, 1);
if (gg.OwnItemCount(target, 741) >= 1) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 101, 3);
myself.ShowQuestMark(target, 101);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

} else if (gg.OwnItemCount(target, 740) == 0) {
if (gg.Rand(5) == 0) {
myself.GiveItem1(target, 740, 1);
if (gg.OwnItemCount(target, 741) >= 1) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 101, 3);
myself.ShowQuestMark(target, 101);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

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