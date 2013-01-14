package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class argos_boss_17 extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 86) == 1 && target.occupation == 17 && gg.GetMemoState(target, 86) == 12 && gg.OwnItemCount(target, 7408) == 0) {
always_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(86);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target.is_pc == 1) {
if (target.dbid == myself.sm.param2) {
myself.GiveItem1(target, 7408, 1);
myself.SetFlagJournal(target, 86, 16);
myself.ShowQuestMark(target, 86);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 7501, gg.OwnItemCount(target, 7501));
myself.Say(gg.MakeFString(8654, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(8655, "", "", "", "", ""));

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

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam i0, HandlerParam timer_id) {
myself.SetCurrentQuestID(86);
if (timer_id == 99908) {
myself.Say(gg.MakeFString(8656, "", "", "", "", ""));
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0) {
myself.SetCurrentQuestID(86);
myself.AddTimerEx(99908, 1000 * 600);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (c0.is_pc == 1) {
myself.AddAttackDesire(c0, 1, 10000);

}
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(8653, c0.name, "", "", "", ""));

}

}
super;
	}


}