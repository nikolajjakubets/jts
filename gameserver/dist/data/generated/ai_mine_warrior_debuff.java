package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_warrior_debuff extends warrior_use_skill {
	protected int DeBuff = 458752001;
	protected int DeBuffProb = 2000;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (gg.Rand(10000) < DeBuffProb) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 1, 1, 1000000);

}

}
	}


}