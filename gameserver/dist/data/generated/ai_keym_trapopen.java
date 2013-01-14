package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_keym_trapopen extends warrior_basic {
	protected int trap_npc = 1018617;
	protected int FireDeBuff = 378339329;
	protected String trap_ai = "adiantum_trap";

	protected void CREATED() {
myself.AddTimerEx(1000, 10);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.c_ai0 = creature;
if (gg.GetMemoState(myself.c_ai0, 128) <= 6) {
myself.SetVisible(0);

} else {
myself.i_ai0 = 1;
myself.SetVisible(1);
myself.AddTimerEx(2000, 1000);
myself.AddTimerEx(6000, 1000);

}

}
super;
	}

	protected void ATTACKED() {
myself.LookNeighbor(2000);
if (myself.i_ai0 == 0) {
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
if (timer_id == 1000) {
myself.LookNeighbor(3000);
myself.AddTimerEx(1000, 10 * 1000);

}
if (timer_id == 2000) {
if (gg.Rand(2) < 1) {
c0 = myself.c_ai0;
myself.Say(gg.MakeFString(1800209, "", "", "", "", ""));
if (myself.InMyTerritory(c0)) {
myself.CreateOnePrivateEx(trap_npc, trap_ai, 0, 0, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 0, 0, 0, 0);

}

}
myself.AddTimerEx(2000, 15 * 1000);

}
if (timer_id == 6000) {
if (myself.Skill_GetConsumeMP(FireDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(FireDeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(FireDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, FireDeBuff, 0, 1, 1000000);

}
myself.AddTimerEx(6000, 60000);

}
	}


}