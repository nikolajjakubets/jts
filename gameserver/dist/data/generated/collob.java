package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class collob extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1 || gg.OwnItemCount(talker, 3814) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Coins of Magic (In Progress)");

}
if (gg.HaveMemo(talker, 365) == 1 && gg.GetMemoState(talker, 365) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Devil's Legacy (In Progress)");

}
if (gg.HaveMemo(talker, 365) == 1 && gg.GetMemoState(talker, 365) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Devil's Legacy (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3813) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
talker.weight_point = 0;
talker.param1 = 0;
talker.param2 = 0;
talker.param3 = 0;
talker.flag = 0;
myself.ShowPage(talker, "collob_q0336_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 336) == 1 && gg.OwnItemCount(talker, 3815) == 1 || gg.OwnItemCount(talker, 3814) == 1) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collob_q0336_54.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 365) == 1 && gg.GetMemoState(talker, 365) == 0) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collob_q0365_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 365) == 1 && gg.GetMemoState(talker, 365) == 1) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collob_q0365_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam reply, HandlerParam talker) {
if (ask == 336) {
myself.SetCurrentQuestID(336);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
if (ask == 336) {
if (reply == 1) {
myself.ShowPage(talker, "collob_q0336_02.htm");
talker.param2 = 11;

} else if (reply == 2) {
myself.ShowPage(talker, "collob_q0336_03.htm");
talker.param2 = 21;

} else if (reply == 3) {
myself.ShowPage(talker, "collob_q0336_04.htm");
talker.param2 = 31;

} else if (reply == 4) {
myself.ShowPage(talker, "collob_q0336_05.htm");
talker.param2 = 42;

} else if (reply == 5) {
myself.ShowPage(talker, "collob_q0336_06.htm");

} else if (reply == 6) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3486) >= 4 && gg.OwnItemCount(talker, 3484) >= 4) {
talker.flag = 1;
myself.DeleteItem1(talker, 3486, 4);
myself.DeleteItem1(talker, 3484, 4);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3486) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3486, 4 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3495) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3495, 4 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3476) >= 4 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3476, 4 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 1;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

}

} else if (reply == 7) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3486) >= 8 && gg.OwnItemCount(talker, 3484) >= 8) {
talker.flag = 1;
myself.DeleteItem1(talker, 3486, 8);
myself.DeleteItem1(talker, 3484, 8);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3486) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3486, 8 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3495) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3495, 8 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3476) >= 8 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3476, 8 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 2;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

}

} else if (reply == 8) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3486) >= 9 && gg.OwnItemCount(talker, 3484) >= 9) {
talker.flag = 1;
myself.DeleteItem1(talker, 3486, 9);
myself.DeleteItem1(talker, 3484, 9);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3486) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3486, 9 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3495) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3495, 9 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3476) >= 9 * 1) {
talker.flag = 1;
myself.DeleteItem1(talker, 3476, 9 * 1);
myself.ShowPage(talker, "collob_q0336_11.htm");
talker.weight_point = 3;
talker.param1 = gg.Rand(3) + 1;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 4;
talker.param1 = talker.param1 + gg.Rand(3) + 1 * 16;

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

}

} else if (reply == 9) {
myself.ShowPage(talker, "collob_q0336_53.htm");

} else if (reply == 10) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 2 && gg.OwnItemCount(talker, 3486) >= 5 * 2) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 2);
myself.DeleteItem1(talker, 3486, 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3487, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 1 && gg.OwnItemCount(talker, 3486) >= 5 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 1);
myself.DeleteItem1(talker, 3486, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3481, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 1 && gg.OwnItemCount(talker, 3495) >= 5 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3492, 5 * 1);
myself.DeleteItem1(talker, 3495, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3493, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 5 * 1 && gg.OwnItemCount(talker, 3476) >= 5 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3474, 5 * 1);
myself.DeleteItem1(talker, 3476, 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3477, 1);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

}

} else if (reply == 11) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 5 * 2 && gg.OwnItemCount(talker, 3486) >= 5 * 5 * 2) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 5 * 2);
myself.DeleteItem1(talker, 3486, 5 * 5 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3487, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3486) >= 5 * 5 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 5 * 1);
myself.DeleteItem1(talker, 3486, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3481, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3495) >= 5 * 5 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3492, 5 * 5 * 1);
myself.DeleteItem1(talker, 3495, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3493, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 5 * 5 * 1 && gg.OwnItemCount(talker, 3476) >= 5 * 5 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3474, 5 * 5 * 1);
myself.DeleteItem1(talker, 3476, 5 * 5 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3477, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

}

} else if (reply == 12) {
if (talker.param2 == 42) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 10 * 2 && gg.OwnItemCount(talker, 3486) >= 5 * 10 * 2) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 10 * 2);
myself.DeleteItem1(talker, 3486, 5 * 10 * 2);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3487, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 31) {
if (gg.OwnItemCount(talker, 3484) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3486) >= 5 * 10 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3484, 5 * 10 * 1);
myself.DeleteItem1(talker, 3486, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3481, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 21) {
if (gg.OwnItemCount(talker, 3492) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3495) >= 5 * 10 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3492, 5 * 10 * 1);
myself.DeleteItem1(talker, 3495, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3493, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

} else if (talker.param2 == 11) {
if (gg.OwnItemCount(talker, 3474) >= 5 * 10 * 1 && gg.OwnItemCount(talker, 3476) >= 5 * 10 * 1) {
myself.ShowPage(talker, "collob_q0336_07.htm");
myself.DeleteItem1(talker, 3474, 5 * 10 * 1);
myself.DeleteItem1(talker, 3476, 5 * 10 * 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3477, 10);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "collob_q0336_10.htm");

}

}

} else if (reply == 13 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "collob_q0336_14.htm");
talker.flag = talker.flag + 4 * 4 * 1;

} else if (reply == 14 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "collob_q0336_15.htm");
talker.flag = talker.flag + 4 * 4 * 2;

} else if (reply == 15 && talker.flag == 1) {
talker.flag = 0;
myself.ShowPage(talker, "collob_q0336_16.htm");
talker.flag = talker.flag + 4 * 4 * 3;

} else if (reply == 16) {
myself.ShowPage(talker, "collob_q0336_17.htm");
talker.flag = talker.flag + 4 * 1 * 1;

} else if (reply == 17) {
myself.ShowPage(talker, "collob_q0336_18.htm");
talker.flag = talker.flag + 4 * 1 * 2;

} else if (reply == 18) {
myself.ShowPage(talker, "collob_q0336_19.htm");
talker.flag = talker.flag + 4 * 1 * 3;

} else if (reply == 19) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 1;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "collob_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3487, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3481, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3493, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3477, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "collob_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "collob_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "collob_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "collob_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "collob_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "collob_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "collob_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "collob_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "collob_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "collob_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "collob_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "collob_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "collob_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "collob_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "collob_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "collob_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "collob_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "collob_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "collob_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "collob_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "collob_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "collob_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "collob_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "collob_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "collob_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "collob_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "collob_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "collob_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "collob_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "collob_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 20) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 2;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "collob_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3487, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3481, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3493, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3477, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "collob_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "collob_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "collob_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "collob_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "collob_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "collob_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "collob_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "collob_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "collob_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "collob_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "collob_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "collob_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "collob_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "collob_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "collob_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "collob_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "collob_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "collob_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "collob_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "collob_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "collob_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "collob_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "collob_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "collob_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "collob_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "collob_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "collob_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "collob_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "collob_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "collob_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 21) {
talker.param3 = 0;
talker.flag = talker.flag + 1 * 3;
if (talker.param1 == talker.flag && talker.weight_point >= 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
talker.weight_point = 0;
myself.ShowPage(talker, "collob_q0336_20.htm");
if (talker.param2 == 42) {
myself.GiveItem1(talker, 3487, 1);

} else if (talker.param2 == 31) {
myself.GiveItem1(talker, 3481, 1);

} else if (talker.param2 == 21) {
myself.GiveItem1(talker, 3493, 1);

} else if (talker.param2 == 11) {
myself.GiveItem1(talker, 3477, 1);

}
talker.param1 = 0;

}

} else if (talker.weight_point == 0) {
if (talker.param1 == 21) {
myself.ShowPage(talker, "collob_q0336_23.htm");

} else if (talker.param1 == 25) {
myself.ShowPage(talker, "collob_q0336_24.htm");

} else if (talker.param1 == 37) {
myself.ShowPage(talker, "collob_q0336_25.htm");

} else if (talker.param1 == 41) {
myself.ShowPage(talker, "collob_q0336_26.htm");

} else if (talker.param1 == 61) {
myself.ShowPage(talker, "collob_q0336_27.htm");

} else if (talker.param1 == 29) {
myself.ShowPage(talker, "collob_q0336_28.htm");

} else if (talker.param1 == 45) {
myself.ShowPage(talker, "collob_q0336_29.htm");

} else if (talker.param1 == 53) {
myself.ShowPage(talker, "collob_q0336_30.htm");

} else if (talker.param1 == 57) {
myself.ShowPage(talker, "collob_q0336_31.htm");

} else if (talker.param1 == 22) {
myself.ShowPage(talker, "collob_q0336_32.htm");

} else if (talker.param1 == 26) {
myself.ShowPage(talker, "collob_q0336_33.htm");

} else if (talker.param1 == 38) {
myself.ShowPage(talker, "collob_q0336_34.htm");

} else if (talker.param1 == 42) {
myself.ShowPage(talker, "collob_q0336_35.htm");

} else if (talker.param1 == 62) {
myself.ShowPage(talker, "collob_q0336_36.htm");

} else if (talker.param1 == 30) {
myself.ShowPage(talker, "collob_q0336_37.htm");

} else if (talker.param1 == 46) {
myself.ShowPage(talker, "collob_q0336_38.htm");

} else if (talker.param1 == 54) {
myself.ShowPage(talker, "collob_q0336_39.htm");

} else if (talker.param1 == 58) {
myself.ShowPage(talker, "collob_q0336_40.htm");

} else if (talker.param1 == 23) {
myself.ShowPage(talker, "collob_q0336_41.htm");

} else if (talker.param1 == 27) {
myself.ShowPage(talker, "collob_q0336_42.htm");

} else if (talker.param1 == 39) {
myself.ShowPage(talker, "collob_q0336_43.htm");

} else if (talker.param1 == 43) {
myself.ShowPage(talker, "collob_q0336_44.htm");

} else if (talker.param1 == 63) {
myself.ShowPage(talker, "collob_q0336_45.htm");

} else if (talker.param1 == 31) {
myself.ShowPage(talker, "collob_q0336_46.htm");

} else if (talker.param1 == 47) {
myself.ShowPage(talker, "collob_q0336_47.htm");

} else if (talker.param1 == 55) {
myself.ShowPage(talker, "collob_q0336_48.htm");

} else if (talker.param1 == 59) {
myself.ShowPage(talker, "collob_q0336_49.htm");

}
talker.param1 = 0;

} else {
i0 = talker.param1 % 4;
i1 = talker.param1 / 4;
i2 = i1 / 4;
i1 = i1 % 4;
talker.flag = talker.flag * 1;
i3 = talker.flag % 4;
i4 = talker.flag / 4;
i5 = i4 / 4;
i4 = i4 % 4;
if (i0 == i3) {
talker.param3 = talker.param3 + 1;

}
if (i1 == i4) {
talker.param3 = talker.param3 + 1;

}
if (i2 == i5) {
talker.param3 = talker.param3 + 1;

}
if (talker.param3 == 1) {
myself.ShowPage(talker, "collob_q0336_50.htm");

} else if (talker.param3 == 2) {
myself.ShowPage(talker, "collob_q0336_51.htm");

} else if (talker.param3 == 0) {
myself.ShowPage(talker, "collob_q0336_52.htm");

}
talker.flag = 1;
talker.weight_point = talker.weight_point - 1;

}

} else if (reply == 22) {
myself.ShowPage(talker, "collob_q0336_01.htm");

}

}
if (ask == 365) {
myself.SetCurrentQuestID(365);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 365) {
if (reply == 23) {
if (gg.OwnItemCount(talker, 5873) < 1) {
myself.ShowPage(talker, "collob_q0365_03.htm");

} else if (gg.OwnItemCount(talker, 57) < 600) {
myself.ShowPage(talker, "collob_q0365_04.htm");

} else if (gg.GetMemoState(talker, 365) == 1) {
myself.ShowPage(talker, "collob_q0365_05.htm");

} else if (gg.OwnItemCount(talker, 5873) >= 1 && gg.OwnItemCount(talker, 57) >= 600 && gg.GetMemoState(talker, 365) == 0) {
if (gg.Rand(100) < 80) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 1) {
myself.GiveItem1(talker, 955, 1);

} else if (i0 < 4) {
myself.GiveItem1(talker, 956, 1);

} else if (i0 < 36) {
myself.GiveItem1(talker, 1868, 1);

} else if (i0 < 68) {
myself.GiveItem1(talker, 1884, 1);

} else {
myself.GiveItem1(talker, 1872, 1);

}
gg.AddLog(3, talker, 365);
myself.DeleteItem1(talker, 5873, 1);
myself.DeleteItem1(talker, 57, 600);
myself.ShowPage(talker, "collob_q0365_06.htm");

}

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(1000);
if (i0 < 10) {
myself.GiveItem1(talker, 951, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 952, 1);

} else if (i0 < 60) {
myself.GiveItem1(talker, 955, 1);

} else if (i0 < 260) {
myself.GiveItem1(talker, 956, 1);

} else if (i0 < 445) {
myself.GiveItem1(talker, 1879, 1);

} else if (i0 < 630) {
myself.GiveItem1(talker, 1880, 1);

} else if (i0 < 815) {
myself.GiveItem1(talker, 1882, 1);

} else {
myself.GiveItem1(talker, 1881, 1);

}
gg.AddLog(3, talker, 365);
myself.AddUseSkillDesire(talker, 264437762, 0, 0, 1000000);
myself.DeleteItem1(talker, 5873, 1);
myself.DeleteItem1(talker, 57, 600);
myself.SetMemoState(talker, 365, 1);
myself.ShowPage(talker, "collob_q0365_07.htm");

}

}

}

}
super;
	}


}