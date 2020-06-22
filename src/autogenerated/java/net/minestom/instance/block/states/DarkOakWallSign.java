package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class DarkOakWallSign {
	public static void initStates() {
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3773, "facing=north", "waterlogged=true"));
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3774, "facing=north", "waterlogged=false"));
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3775, "facing=south", "waterlogged=true"));
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3776, "facing=south", "waterlogged=false"));
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3777, "facing=west", "waterlogged=true"));
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3778, "facing=west", "waterlogged=false"));
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3779, "facing=east", "waterlogged=true"));
		DARK_OAK_WALL_SIGN.addBlockAlternative(new BlockAlternative((short) 3780, "facing=east", "waterlogged=false"));
	}
}
