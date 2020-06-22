package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class RedNetherBrickSlab {
	public static void initStates() {
		RED_NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10313, "type=top", "waterlogged=true"));
		RED_NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10314, "type=top", "waterlogged=false"));
		RED_NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10315, "type=bottom", "waterlogged=true"));
		RED_NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10316, "type=bottom", "waterlogged=false"));
		RED_NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10317, "type=double", "waterlogged=true"));
		RED_NETHER_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10318, "type=double", "waterlogged=false"));
	}
}
