package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv1_warehouse_chief extends guild_master_lv1 {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -2 && reply == 1) {
if (talker.race == 4) {
myself.ShowPage(talker, fnClassList1);

} else {
myself.ShowPage(talker, fnClassMismatch);

}

}
super;
	}


}