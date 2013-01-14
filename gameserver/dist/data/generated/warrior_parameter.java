package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_parameter extends monster_parameter {
	protected void CREATED(HandlerParam c0) {
if (IsVs == 1) {
myself.c_ai0 = myself.sm;

}
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, 305594369, 0, 1, 10000);
myself.AddAttackDesire(c0, 1, 500);

}

}
super;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1) {
if (AttackLowLevel == 1) {
myself.LookNeighbor(300);

}

}
if (timer_id == 2) {
if (IsVs == 1) {
myself.c_ai0 = myself.sm;

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_id, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i10, HandlerParam i11) {
if (CreviceOfDiminsion != 0) {
if (myself.InMyTerritory(attacker) == 0) {
myself.RemoveAttackDesire(attacker.id);
return;

}

}
if (myself.sm.in_peacezone != 1) {
if (SSQLoserTeleport != 0) {
if (attacker.builder_level == 0) {
if (SSQLoserTeleport != 1 && SSQLoserTeleport != 2) {
myself.Say("버그:SSQLoserTeleport에 잘못된 값이 들어갔습니다. 값 = " + SSQLoserTeleport);

} else if (myself.GetSSQStatus() == 3) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (attacker.is_pc == 1) {
if (i0 == 0 && gg.GetSSQPart(attacker) == 0) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(attacker) != 1) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(attacker) != 2) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (i0 == 0 && gg.GetSSQPart(attacker.master) == 0) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(attacker.master) != 1) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(attacker.master) != 2) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

} else if (myself.GetSSQStatus() == 1) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (attacker.is_pc == 1) {
if (gg.GetSSQPart(attacker) == 0) {
myself.RemoveAttackDesire(attacker.id);
myself.InstantTeleport(attacker, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (gg.GetSSQPart(attacker.master) == 0) {
myself.RemoveAttackDesire(attacker.master.id);
myself.InstantTeleport(attacker.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

}

}

}

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= 20) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (SetCurse != 0 && gg.Rand(100) < 3 && myself.top_desire_target == attacker) {
myself.Say(gg.MakeFString(1000452, "", "", "", "", ""));
if (myself.Skill_GetConsumeMP(SetCurse) < myself.sm.mp && myself.Skill_GetConsumeHP(SetCurse) < myself.sm.hp && myself.Skill_InReuseDelay(SetCurse) == 0) {
myself.AddUseSkillDesire(attacker, SetCurse, 0, 1, 1000000);

}

}

}

}
if (SoulShot != 0) {
i0 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6553601));
i1 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(269811713));
if (i0 <= 0 && i1 <= 0) {
if (gg.Rand(100) < SoulShotRate) {
myself.UseSoulShot(SoulShot);

}

}

}
if (SpiritShot != 0) {
i0 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6553601));
if (i0 <= 0) {
i0 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(269811713));
if (gg.Rand(100) < SpiritShotRate && i0 <= 0) {
myself.UseSpiritShot(SpiritShot, SpeedBonus, HealBonus);

}

}

}
i11 = gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(330563587));
if (LongRangeGuardRate == -1 || skill_id == 28 || skill_id == 680 || skill_id == 51 || skill_id == 511 || skill_id == 15 || skill_id == 254 || skill_id == 1069 || skill_id == 1097 || skill_id == 1042 || skill_id == 1072 || skill_id == 1170 || skill_id == 352 || skill_id == 358 || skill_id == 1394 || skill_id == 695 || skill_id == 115 || skill_id == 1083 || skill_id == 1160 || skill_id == 1164 || skill_id == 1201 || skill_id == 1206 || skill_id == 1222 || skill_id == 1223 || skill_id == 1224 || skill_id == 1092 || skill_id == 65 || skill_id == 106 || skill_id == 122 || skill_id == 127 || skill_id == 1049 || skill_id == 1064 || skill_id == 1071 || skill_id == 1074 || skill_id == 1169 || skill_id == 1263 || skill_id == 1269 || skill_id == 352 || skill_id == 353 || skill_id == 1336 || skill_id == 1337 || skill_id == 1338 || skill_id == 1358 || skill_id == 1359 || skill_id == 402 || skill_id == 403 || skill_id == 412 || skill_id == 1386 || skill_id == 1394 || skill_id == 1396 || skill_id == 485 || skill_id == 501 || skill_id == 1445 || skill_id == 1446 || skill_id == 1447 || skill_id == 522 || skill_id == 531 || skill_id == 1481 || skill_id == 1482 || skill_id == 1483 || skill_id == 1484 || skill_id == 1485 || skill_id == 1486 || skill_id == 695 || skill_id == 696 || skill_id == 716 || skill_id == 775 || skill_id == 1511 || skill_id == 792 || skill_id == 1524 || skill_id == 1529) {

} else if (LongRangeGuardRate > 0) {
if (myself.DistFromMe(attacker) > 150) {
if (i11 <= 0 && gg.Rand(100) < LongRangeGuardRate) {
myself.AddUseSkillDesire(myself.sm, 330563587, 1, 1, 10000000000);

}

} else if (i11 <= 0) {

} else {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(330563587));

}

}
if (AttackLowLevel == 1 && myself.p_state != 3 && myself.p_state != 10) {
myself.AddTimerEx(1, 7000);

}
if (AttackLowHP == 1 && gg.FloatToInt(attacker.hp / attacker.max_hp * 100) < 30 && gg.Rand(100) < 10) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target != attacker) {
myself.RemoveAllAttackDesire();
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, 1 * 100);

}
switch (gg.Rand(3)) {
case 0: {
myself.Say(gg.MakeFString(1000307, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000427, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000428, "", "", "", "", ""));
break;

}

}

}

}

}
if (IsVs == 1) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && myself.c_ai0 == myself.sm) {
if (attacker != myself.top_desire_target && attacker.is_pc == 1) {
switch (gg.Rand(5)) {
case 0: {
myself.Say(gg.MakeFString(1000288, attacker.name, "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000388, attacker.name, "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000389, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000390, "", "", "", "", ""));
break;

}
case 4: {
myself.Say(gg.MakeFString(1000391, "", "", "", "", ""));
break;

}

}
myself.c_ai0 = attacker;
myself.AddTimerEx(2, 20000);
myself.BroadcastScriptEvent(10001, gg.GetIndexFromCreature(attacker), 600);

}

}

}
if (SpecialSkill != 0 && SpecialSkill != 458752001) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 30 && gg.Rand(100) < 10) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SpecialSkill)) <= 0) {
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1000290, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000395, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000396, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000397, "", "", "", "", ""));
break;

}

}
if (myself.Skill_GetConsumeMP(SpecialSkill) < myself.sm.mp && myself.Skill_GetConsumeHP(SpecialSkill) < myself.sm.hp && myself.Skill_InReuseDelay(SpecialSkill) == 0) {
myself.AddUseSkillDesire(myself.sm, SpecialSkill, 1, 1, 1000000);

}

}

}

}
if (HelpHeroSilhouette != 0) {
if (gg.FloatToInt(attacker.hp / attacker.max_hp * 100) < 20 && gg.Rand(100) < 3 && attacker.is_pc == 1) {
myself.CreateOnePrivateEx(HelpHeroSilhouette, HelpHeroAI, 0, 0, gg.FloatToInt(myself.sm.x) + 80, gg.FloatToInt(myself.sm.y) + 80, gg.FloatToInt(myself.sm.z), 0, 0, 0, gg.GetIndexFromCreature(myself.sm));

}

}
if (DungeonType != 0) {
for (i1 = 0; i1 < DungeonType; i1 = i1 + 1) {
myself.CreateOnePrivateEx(DungeonTypeAI, DungeonTypePrivate, 0, 0, gg.FloatToInt(myself.sm.x + i1 * 20), gg.FloatToInt(myself.sm.y + i1 * 20), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);

}
myself.Despawn();

}
if (gg.Rand(100) < 5 && myself.IsNullCreature(myself.top_desire_target) == 0 && ShoutTarget != 0) {
if (myself.top_desire_target == attacker) {
myself.BroadcastScriptEvent(10016, gg.GetIndexFromCreature(attacker), 300);

}

}
if (gg.Rand(100) < 5 && SelfExplosion != 0) {
i0 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100);
if (i0 < 50) {
i0 = 10 - gg.FloatToInt(i0 / 10);
if (i0 > gg.Rand(100)) {
if (myself.Skill_GetConsumeMP(SelfExplosion) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfExplosion) < myself.sm.hp && myself.Skill_InReuseDelay(SelfExplosion) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfExplosion, 0, 1, 1000000);

}

}

}

}
if (IsTransform > 0) {
switch (myself.sm.param3) {
case 0: {
if (myself.sm.param3 < IsTransform && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 70 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50 && gg.Rand(100) < 30) {
myself.c_ai0 = attacker;
switch (gg.Rand(3)) {
case 0: {
myself.Say(gg.MakeFString(1000406, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000407, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000408, "", "", "", "", ""));
break;

}

}
i0 = myself.GetDirection(myself.sm);
myself.CreateOnePrivateEx(step1, myself.sm.ai, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, 1000, gg.GetIndexFromCreature(myself.c_ai0), 1);
myself.Despawn();

}
break;

}
case 1: {
if (myself.sm.param3 < IsTransform && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 30 && gg.Rand(100) < 20) {
myself.c_ai0 = attacker;
switch (gg.Rand(3)) {
case 0: {
myself.Say(gg.MakeFString(1000409, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000410, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000411, "", "", "", "", ""));
break;

}

}
i0 = myself.GetDirection(myself.sm);
myself.CreateOnePrivateEx(step2, myself.sm.ai, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, 1000, gg.GetIndexFromCreature(myself.c_ai0), 2);
myself.Despawn();

}
break;

}
case 2: {
if (myself.sm.param3 < IsTransform && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 30 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 5 && gg.Rand(100) < 10) {
myself.c_ai0 = attacker;
switch (gg.Rand(3)) {
case 0: {
myself.Say(gg.MakeFString(1000412, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000413, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000414, "", "", "", "", ""));
break;

}

}
i0 = myself.GetDirection(myself.sm);
myself.CreateOnePrivateEx(step3, myself.sm.ai, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), i0 * 182, 1000, gg.GetIndexFromCreature(myself.c_ai0), 3);
myself.Despawn();

}
break;

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (AttackLowHP == 1 && gg.FloatToInt(attacker.hp / attacker.max_hp * 100) < 30 && gg.Rand(100) < 3) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target != attacker) {
myself.RemoveAllAttackDesire();
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, 1 * 100);

}

}

}

}
if (AttackLowLevel == 1 && myself.p_state != 3 && myself.p_state != 10) {
myself.AddTimerEx(1, 7000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.sm.alive == 0) {
return;

}
if (myself.sm.in_peacezone != 1) {
if (SSQLoserTeleport != 0) {
if (creature.builder_level == 0) {
if (SSQLoserTeleport != 1 && SSQLoserTeleport != 2) {
myself.Say("버그:SSQLoserTeleport에 잘못된 값이 들어갔습니다. 값 = " + SSQLoserTeleport);

} else if (myself.GetSSQStatus() == 3) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (creature.is_pc == 1) {
if (i0 == 0 && gg.GetSSQPart(creature) == 0) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(creature) != 1) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(creature) != 2) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (i0 == 0 && gg.GetSSQPart(creature.master) == 0) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(creature.master) != 1) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(creature.master) != 2) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

} else if (myself.GetSSQStatus() == 1) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (creature.is_pc == 1) {
if (gg.GetSSQPart(creature) == 0) {
myself.RemoveAttackDesire(creature.id);
myself.InstantTeleport(creature, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (gg.GetSSQPart(creature.master) == 0) {
myself.RemoveAttackDesire(creature.master.id);
myself.InstantTeleport(creature.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

}

}

}

}
if (HalfAggressive == 1) {
if (myself.GetTimeHour() >= 5) {
if (myself.p_state != 3 && myself.p_state != 10) {
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

}

}
return;

} else if (HalfAggressive == 2) {
if (myself.GetTimeHour() < 5) {
if (myself.p_state != 3 && myself.p_state != 10) {
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

}

}
return;

} else {
if (RandomAggressive > 0) {
if (gg.Rand(100) < RandomAggressive && creature.is_pc == 1) {
if (myself.p_state != 3 && myself.p_state != 10) {
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

}
return;

} else if (myself.p_state != 3 && myself.p_state != 10) {
myself.RemoveAllAttackDesire();

}

}
if (AttackLowLevel == 1) {
if (myself.p_state == 3 || myself.p_state == 10 && myself.DistFromMe(creature) < 300) {
if (creature.level + 15 < myself.sm.level) {
myself.RemoveAllAttackDesire();
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.AddAttackDesire(creature, 1, 7 * 100);

}

}
myself.AddTimerEx(1, 7000);

}

}
if (IsVs == 1) {
if (creature.is_pc == 1) {
if (creature.level > myself.sm.level - 2 && creature.level < myself.sm.level + 2 && myself.p_state != 3 && myself.p_state != 10) {
switch (gg.Rand(5)) {
case 0: {
myself.Say(gg.MakeFString(1000287, creature.name, "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000384, creature.name, "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000385, creature.name, "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000386, creature.name, "", "", "", ""));
break;

}
case 4: {
myself.Say(gg.MakeFString(1000387, creature.name, "", "", "", ""));
break;

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

}

}

}
if (DaggerBackAttack == 1) {
if (creature.is_pc == 1 && gg.Rand(100) < 50 && myself.p_state != 3 && myself.p_state != 10) {
i0 = myself.GetAngleFromTarget(creature);
if (myself.DistFromMe(creature) < 100 && i0 > 36864 && i0 < 61440) {
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1000286, creature.name, "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000381, creature.name, "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000382, "", "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1000383, "", "", "", "", ""));
break;

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

}

}

}
super;

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0, HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.sm.in_peacezone != 1) {
if (SSQLoserTeleport != 0) {
if (speller.builder_level == 0) {
if (SSQLoserTeleport != 1 && SSQLoserTeleport != 2) {
myself.Say("버그:SSQLoserTeleport에 잘못된 값이 들어갔습니다. 값 = " + SSQLoserTeleport);

} else if (myself.GetSSQStatus() == 3) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (speller.is_pc == 1) {
if (i0 == 0 && gg.GetSSQPart(speller) == 0) {
myself.RemoveAttackDesire(speller.id);
myself.InstantTeleport(speller, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(speller) != 1) {
myself.RemoveAttackDesire(speller.id);
myself.InstantTeleport(speller, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(speller) != 2) {
myself.RemoveAttackDesire(speller.id);
myself.InstantTeleport(speller, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, speller.npc_class_id) == 1) {
if (i0 == 0 && gg.GetSSQPart(speller.master) == 0) {
myself.RemoveAttackDesire(speller.master.id);
myself.InstantTeleport(speller.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 1 && gg.GetSSQPart(speller.master) != 1) {
myself.RemoveAttackDesire(speller.master.id);
myself.InstantTeleport(speller.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

} else if (i0 == 2 && gg.GetSSQPart(speller.master) != 2) {
myself.RemoveAttackDesire(speller.master.id);
myself.InstantTeleport(speller.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

} else if (myself.GetSSQStatus() == 1) {
i0 = myself.GetSSQSealOwner(SSQLoserTeleport);
if (speller.is_pc == 1) {
if (gg.GetSSQPart(speller) == 0) {
myself.RemoveAttackDesire(speller.id);
myself.InstantTeleport(speller, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

} else if (myself.IsInCategory(12, speller.npc_class_id) == 1) {
if (gg.GetSSQPart(speller.master) == 0) {
myself.RemoveAttackDesire(speller.master.id);
myself.InstantTeleport(speller.master, SSQTelPosX, SSQTelPosY, SSQTelPosZ);
return;

}

}

}

}

}

}
if (speller.level + 15 < myself.sm.level) {
myself.RemoveAllAttackDesire();
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == target) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, speller.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (speller.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == speller.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * i0 / myself.sm.level + 7 + f0 / 100 * 1.000000 * i0 / myself.sm.level + 7;
myself.AddAttackDesire(speller, 1, f0 * 150);

}

}
if (myself.GetPathfindFailCount() > 10 && speller == myself.top_desire_target && gg.FloatToInt(myself.sm.hp) != gg.FloatToInt(myself.sm.max_hp)) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(speller.x), gg.FloatToInt(speller.y), gg.FloatToInt(speller.z));

}

}
if (SwapPosition != 0) {
if (myself.p_state == 3 && gg.Rand(100) < SwapPosition) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.IsInCategory(0, myself.top_desire_target.occupation) == 1) {
if (myself.IsInCategory(0, myself.top_desire_target.occupation) == 1 || myself.IsInCategory(3, myself.top_desire_target.occupation) == 1) {
if (myself.DistFromMe(myself.top_desire_target) < myself.DistFromMe(speller)) {
if (myself.DistFromMe(speller) < 900) {
x = gg.FloatToInt(speller.x);
y = gg.FloatToInt(speller.y);
z = gg.FloatToInt(speller.z);
myself.InstantTeleport(speller, gg.FloatToInt(myself.top_desire_target.x), gg.FloatToInt(myself.top_desire_target.y), gg.FloatToInt(myself.top_desire_target.z));
myself.InstantTeleport(myself.top_desire_target, x, y, z);
myself.AddAttackDesire(speller, 1, 1000);

}

}

}

}

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 10001 && myself.p_state != 3) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm.alive == 0) {
return;

}
if (myself.c_ai0 != c0) {
switch (gg.Rand(3)) {
case 0: {
myself.Say(gg.MakeFString(1000392, "", "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1000393, "", "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1000394, "", "", "", "", ""));
break;

}

}
myself.AddAttackDesire(c0, 1, 1000000);

}

}

}
if (script_event_arg1 == 10016 && gg.Rand(100) < 50) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm.alive == 0) {
return;

}
myself.RemoveAllAttackDesire();
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 100);

}

}

}
if (script_event_arg1 == 10020) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm.alive == 0) {
return;

}
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 1 * 100);

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (SelfExplosion != 0) {
if (skill_name_id == SelfExplosion) {
myself.Suicide();

}

}
	}


}