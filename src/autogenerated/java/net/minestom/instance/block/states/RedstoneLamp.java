package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class RedstoneLamp {
	public static void initStates() {
		REDSTONE_LAMP.addBlockAlternative(new BlockAlternative((short) 5140, "lit=true"));
		REDSTONE_LAMP.addBlockAlternative(new BlockAlternative((short) 5141, "lit=false"));
	}
}
