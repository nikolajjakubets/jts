package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guardian_ejekiel2 extends lv3_ranger {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(83);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target.is_pc == 1) {
if (gg.HaveMemo(target, 83) == 1 && target.occupation == 24 && gg.GetMemoState(target, 83) == 7 && gg.OwnItemCount(target, 7343) == 0 && target.dbid == myself.sm.param2) {
myself.Say(gg.MakeFString(8352, "", "", "", "", ""));
myself.GiveItem1(target, 7343, 1);
myself.SetFlagJournal(target, 83, 9);
myself.ShowQuestMark(target, 83);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

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

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(83);
if (timer_id == 99901) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(8350, c0.name, "", "", "", ""));

}

}

} else if (timer_id == 99902) {
myself.Say(gg.MakeFString(8351, "", "", "", "", ""));
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(83);
myself.AddTimerEx(99901, 500);
myself.AddTimerEx(99902, 1000 * 300);
super;
	}


}