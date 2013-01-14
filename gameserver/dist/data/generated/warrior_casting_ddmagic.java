package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_ddmagic extends warrior {
	protected int DDMagic = 262209537;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (myself.i_ai1 == 1) {
if (myself.top_desire_target == attacker) {
myself.i_ai2 = 1;

}

} else {
myself.AddTimerEx(2001, 5000);
myself.i_ai1 = 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i6 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && i6 < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
i6 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 100 && i6 < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.i_ai1 = 0;
myself.i_ai2 = 0;

} else {
if (myself.i_ai2 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && gg.Rand(100) < 50) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(DDMagic)) <= 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagic, 0, 1, 1000000);

}

}

}

}
myself.AddTimerEx(2001, 5000);
myself.i_ai2 = 0;

}

}
super;
	}


}