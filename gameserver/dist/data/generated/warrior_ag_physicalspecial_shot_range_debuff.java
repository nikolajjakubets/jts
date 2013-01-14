package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_physicalspecial_shot_range_debuff extends warrior_physicalspecial_shot_range_debuff {
	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
if (creature.is_pc != 0 && myself.IsInCategory(12, creature.npc_class_id) != 0 && myself.DistFromMe(creature) > 200) {
if (myself.Skill_GetConsumeMP(LongRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(creature, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}
myself.AddTimerEx(1002, 5000);
super;
	}


}