package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_malignant_overseer_wiz extends wizard_basic {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 78010015) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddHateInfo(c0, 1000, 0, 1, 1);

}

}
super;
	}


}