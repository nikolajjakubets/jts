package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kirunak extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(164);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(c1, 164) == 1 && gg.OwnItemCount(c1, 1044) == 0) {
myself.Say(gg.MakeFString(16405, "", "", "", "", ""));
myself.GiveItem1(c1, 1044, 1);
myself.SetFlagJournal(c1, 164, 2);
myself.ShowQuestMark(c1, 164);
myself.SoundEffect(c1, "ItemSound.quest_middle");

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(164);
switch (myself.i_quest0) {
case 0: {
myself.Say(gg.MakeFString(16404, "", "", "", "", ""));
myself.i_quest0 = 1;
break;

}
case 1: {
break;

}

}
super;
	}


}