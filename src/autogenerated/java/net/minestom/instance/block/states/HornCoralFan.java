package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class HornCoralFan {
	public static void initStates() {
		HORN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9022, "waterlogged=true"));
		HORN_CORAL_FAN.addBlockAlternative(new BlockAlternative((short) 9023, "waterlogged=false"));
	}
}
