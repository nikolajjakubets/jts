package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_corpse_zombie_ddmagic extends warrior_corpse_zombie_ddmagic {
	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm) && myself.p_state != 3) {
i6 = gg.Rand(100);
if (myself.DistFromMe(creature) > 100 && i6 < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(creature, DDMagic, 0, 1, 1000000);

}

}

}
if (IsTeleport != 0 && myself.GetLifeTime() > 7 && myself.DistFromMe(creature) > 100 && myself.p_state != 3 && gg.Rand(100) < 10 && myself.sm.hp > 0) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z));
if (myself.Skill_GetConsumeMP(IsTeleport) < myself.sm.mp && myself.Skill_GetConsumeHP(IsTeleport) < myself.sm.hp && myself.Skill_InReuseDelay(IsTeleport) == 0) {
myself.AddUseSkillDesire(myself.sm, IsTeleport, 1, 1, 1000000);

}

}
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
super;
	}


}