package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maker_beastfarm_pet extends default_maker {
	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam def0) {
super;
if (script_event_arg1 == 21150002) {
def0.SendScriptEvent(21150002, script_event_arg2, script_event_arg3);

}
	}


}