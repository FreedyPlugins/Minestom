package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class DeadBubbleCoralFan {
	public static void initStates() {
		DEAD_BUBBLE_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9008, "waterlogged=true"));
		DEAD_BUBBLE_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9009, "waterlogged=false"));
	}
}
