package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class GrayGlazedTerracotta {
	public static void initStates() {
		GRAY_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8866, "facing=north"));
		GRAY_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8867, "facing=south"));
		GRAY_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8868, "facing=west"));
		GRAY_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8869, "facing=east"));
	}
}
