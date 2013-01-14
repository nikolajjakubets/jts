package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_heal extends default_npc {
	protected int HealMagic = 263782401;
	protected int step1_action01 = -1;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id) {
if (action_id == step1_action01) {
if (myself.Skill_GetConsumeMP(HealMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(HealMagic) < myself.sm.hp && myself.Skill_InReuseDelay(HealMagic) == 0) {
myself.AddUseSkillDesireEx(myself.master.id, HealMagic, 1, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(HealMagic) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(HealMagic) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(HealMagic) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
	}


}