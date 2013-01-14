package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class exclusive_despawn_normal extends default_maker {
	protected int unique_npc = 0;
	protected String maker_name1 = "exclusive_despawn_normal_default1";
	protected String maker_name2 = "exclusive_despawn_normal_default2";
	protected int despawn_count = 0;

	protected void ON_START(HandlerParam i0, HandlerParam def0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
super;
	}

	protected void ON_NPC_CREATED(HandlerParam created_def, HandlerParam created_npc, HandlerParam maker0, HandlerParam maker1) {
if (created_npc.sm.class_id == unique_npc) {
myself.i_ai0 = 1;
maker0 = gg.GetNpcMaker(maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 1, 0);

}
maker1 = gg.GetNpcMaker(maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker1, 1001, 1, 0);

}

} else if (myself.i_ai0 == 0) {
created_def.Despawn();

}
	}

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam deleted_npc, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam maker1, HandlerParam reply) {
if (deleted_npc.sm.class_id == unique_npc) {
myself.i_ai0 = 0;
maker0 = gg.GetNpcMaker(maker_name1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker1 = gg.GetNpcMaker(maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker1, 10025, 0, 0);

}
super;

} else if (myself.i_ai0 == 1) {
if (myself.AtomicIncreaseTotal(deleted_def, 1, 1)) {
deleted_def.Spawn2(1, deleted_def.respawn_time, deleted_def.respawn_rand);

}

}
	}

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (script_event_arg1 == 10025) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 == despawn_count) {
maker0 = gg.GetNpcMaker(maker_name2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
myself.i_ai0 = script_event_arg2;
myself.i_ai1 = 0;

}

}

} else {
myself.i_ai0 = script_event_arg2;

}
super;
	}


}