package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class darkwing_bat extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(275);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 275) && gg.OwnItemCount(c1, 1478) < 70) {
if (gg.OwnItemCount(c1, 1478) < 69) {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 275, 2);
myself.ShowQuestMark(c1, 275);

}
myself.GiveItem1(c1, 1478, 1);
i0 = gg.Rand(100);
if (gg.OwnItemCount(c1, 1478) > 10 && gg.OwnItemCount(c1, 1478) < 66 && i0 < 10) {
myself.CreateOnePrivate(1027043, "varangkas_tracker", 0, 1);
myself.GiveItem1(c1, 1479, 1);

}

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