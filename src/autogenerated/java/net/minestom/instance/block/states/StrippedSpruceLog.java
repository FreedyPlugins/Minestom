package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class StrippedSpruceLog {
	public static void initStates() {
		STRIPPED_SPRUCE_LOG.addBlockAlternative(new BlockAlternative((short) 90, "axis=x"));
		STRIPPED_SPRUCE_LOG.addBlockAlternative(new BlockAlternative((short) 91, "axis=y"));
		STRIPPED_SPRUCE_LOG.addBlockAlternative(new BlockAlternative((short) 92, "axis=z"));
	}
}
