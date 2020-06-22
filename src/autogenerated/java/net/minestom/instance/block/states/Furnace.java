package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class Furnace {
	public static void initStates() {
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3371, "facing=north", "lit=true"));
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3372, "facing=north", "lit=false"));
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3373, "facing=south", "lit=true"));
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3374, "facing=south", "lit=false"));
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3375, "facing=west", "lit=true"));
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3376, "facing=west", "lit=false"));
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3377, "facing=east", "lit=true"));
		FURNACE.addBlockAlternative(new BlockAlternative((short) 3378, "facing=east", "lit=false"));
	}
}
