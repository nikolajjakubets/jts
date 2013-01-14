package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit02_vampire_archer_agit extends wizard {
	protected int W_FiendArcher = 272039937;

	protected void CREATED() {
myself.AddDoNothingDesire(5, 5);
super;
	}

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(creature, W_FiendArcher, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_FiendArcher, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(creature)) {
myself.AddAttackDesire(creature, 0, 1000);

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam skill_name_id) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100 + 300), 0, 1, 1);

} else {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * 100), 0, 1, 1);

}

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature == attacker) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

} else if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
myself.RemoveAllHateInfoIF(1, 0);
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_FiendArcher, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(attacker)) {
myself.AddAttackDesire(attacker, 0, 1000);

}

}

}
super;
	}

	protected void STATIC_OBJECT_CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.npc_class_id == 1014737) {
myself.AddAttackDesire(attacker.master, 0, 5000.000000);
myself.AddAttackDesire(attacker, 0, 1000.000000);

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 50);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_FiendArcher) < myself.sm.mp && myself.Skill_GetConsumeHP(W_FiendArcher) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_FiendArcher) == 0) {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 0, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_FiendArcher, 0, 0, 1000000);

}

} else {
myself.i_ai0 = 1;
if (myself.CanAttack(h0.creature)) {
myself.AddAttackDesire(h0.creature, 0, 1000);

}

}

}
super;
	}


}