package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class LimeGlazedTerracotta {
	public static void initStates() {
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8858, "facing=north"));
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8859, "facing=south"));
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8860, "facing=west"));
		LIME_GLAZED_TERRACOTTA.addBlockAlternative(new BlockAlternative((short) 8861, "facing=east"));
	}
}
