package net.minestom.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.instance.block.TmpBlock.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class BlueBed {
	public static void initStates() {
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1224, "facing=north", "occupied=true", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1225, "facing=north", "occupied=true", "part=foot"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1226, "facing=north", "occupied=false", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1227, "facing=north", "occupied=false", "part=foot"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1228, "facing=south", "occupied=true", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1229, "facing=south", "occupied=true", "part=foot"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1230, "facing=south", "occupied=false", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1231, "facing=south", "occupied=false", "part=foot"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1232, "facing=west", "occupied=true", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1233, "facing=west", "occupied=true", "part=foot"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1234, "facing=west", "occupied=false", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1235, "facing=west", "occupied=false", "part=foot"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1236, "facing=east", "occupied=true", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1237, "facing=east", "occupied=true", "part=foot"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1238, "facing=east", "occupied=false", "part=head"));
		BLUE_BED.addBlockAlternative(new BlockAlternative((short) 1239, "facing=east", "occupied=false", "part=foot"));
	}
}
