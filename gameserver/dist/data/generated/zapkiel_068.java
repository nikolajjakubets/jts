package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class zapkiel_068 extends warrior_aggressive {
	protected void ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam npc0) {
myself.SetCurrentQuestID(68);
c1 = attacker;
if (c1.master) {
c1 = c1.master;

}
i0 = myself.sm.param3;
if (i0 > 0) {
c0 = myself.Maker_FindNpcByKey(i0);
if (c0) {
myself.AddAttackDesire(c0, 1, 100000);

}

}
if (gg.HaveMemo(c1, 68) == 1 && c1.occupation == 128 || c1.occupation == 129 && gg.GetMemoState(c1, 68) == 13 || gg.GetMemoState(c1, 68) == 14) {
if (c1.is_pc == 1) {
if (c1.dbid == myself.sm.param2) {
myself.i_quest0 = myself.i_quest0 + 1;
if (myself.i_quest0 == 1) {
if (c1.is_pc == 1) {
myself.Say(gg.MakeFString(6867, c1.name, "", "", "", ""));

}

}
if (myself.i_quest0 > 15) {
myself.SetMemoState(c1, 68, 14);
if (c1.is_pc == 1) {
myself.Say(gg.MakeFString(6868, c1.name, "", "", "", ""));

}
c0 = myself.Maker_FindNpcByKey(myself.sm.param3);
npc0 = gg.GetNPCFromID(c0.id);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 1;

}
myself.Despawn();

}

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam i0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(68);
if (timer_id == 99906) {
i0 = myself.sm.param3;
if (i0 > 0) {
c0 = myself.Maker_FindNpcByKey(i0);
if (c0) {
myself.AddAttackDesire(c0, 1, 100000);
myself.Say(gg.MakeFString(6865, "", "", "", "", ""));

} else {
myself.AddTimerEx(99906, 500);

}

}

} else if (timer_id == 99907) {
myself.Say(gg.MakeFString(6866, "", "", "", "", ""));
c0 = myself.Maker_FindNpcByKey(myself.sm.param3);
npc0 = gg.GetNPCFromID(c0.id);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 2;

}
myself.Despawn();

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(68);
myself.AddTimerEx(99906, 500);
myself.AddTimerEx(99907, 1000 * 60 - 1);
super;
	}


}