package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class DarkOakLog {
	public static void initStates() {
		DARK_OAK_LOG.addBlockAlternative(new BlockAlternative((short) 87, "axis=x"));
		DARK_OAK_LOG.addBlockAlternative(new BlockAlternative((short) 88, "axis=y"));
		DARK_OAK_LOG.addBlockAlternative(new BlockAlternative((short) 89, "axis=z"));
	}
}
