package net.minestom.server.registry;

import java.util.HashMap;
import net.minestom.server.utils.NamespaceID;
import net.minestom.server.instance.block.Block;
import net.minestom.server.item.Material;
import net.minestom.server.instance.Biome;
import net.minestom.server.item.Enchantment;
import net.minestom.server.entity.EntityType;
import net.minestom.server.particle.Particle;
import net.minestom.server.potion.PotionType;
import net.minestom.server.sound.Sound;
import net.minestom.server.stat.StatisticType;

// AUTOGENERATED
public class Registries {
	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, Block> blocks = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, Material> materials = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, Biome> biomes = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, Enchantment> enchantments = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, EntityType> entityTypes = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, Particle> particles = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, PotionType> potionTypes = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, Sound> sounds = new HashMap<>();

	/** Should only be used for internal code, please use the get* methods. */
	@Deprecated
	public static final HashMap<NamespaceID, StatisticType> statisticTypes = new HashMap<>();


	/** Returns the corresponding Block matching the given id. Returns 'AIR' if none match. */
	public static Block getBlock(String id) {
		return getBlock(NamespaceID.from(id));
	}

	/** Returns the corresponding Block matching the given id. Returns 'AIR' if none match. */
	public static Block getBlock(NamespaceID id) {
		return blocks.getOrDefault(id, Block.AIR);
	}

	/** Returns the corresponding Material matching the given id. Returns 'AIR' if none match. */
	public static Material getMaterial(String id) {
		return getMaterial(NamespaceID.from(id));
	}

	/** Returns the corresponding Material matching the given id. Returns 'AIR' if none match. */
	public static Material getMaterial(NamespaceID id) {
		return materials.getOrDefault(id, Material.AIR);
	}

	/** Returns the corresponding Biome matching the given id. Returns null if none match. */
	public static Biome getBiome(String id) {
		return getBiome(NamespaceID.from(id));
	}

	/** Returns the corresponding Biome matching the given id. Returns null if none match. */
	public static Biome getBiome(NamespaceID id) {
		return biomes.get(id);
	}

	/** Returns the corresponding Enchantment matching the given id. Returns null if none match. */
	public static Enchantment getEnchantment(String id) {
		return getEnchantment(NamespaceID.from(id));
	}

	/** Returns the corresponding Enchantment matching the given id. Returns null if none match. */
	public static Enchantment getEnchantment(NamespaceID id) {
		return enchantments.get(id);
	}

	/** Returns the corresponding EntityType matching the given id. Returns 'PIG' if none match. */
	public static EntityType getEntityType(String id) {
		return getEntityType(NamespaceID.from(id));
	}

	/** Returns the corresponding EntityType matching the given id. Returns 'PIG' if none match. */
	public static EntityType getEntityType(NamespaceID id) {
		return entityTypes.getOrDefault(id, EntityType.PIG);
	}

	/** Returns the corresponding Particle matching the given id. Returns null if none match. */
	public static Particle getParticle(String id) {
		return getParticle(NamespaceID.from(id));
	}

	/** Returns the corresponding Particle matching the given id. Returns null if none match. */
	public static Particle getParticle(NamespaceID id) {
		return particles.get(id);
	}

	/** Returns the corresponding PotionType matching the given id. Returns null if none match. */
	public static PotionType getPotionType(String id) {
		return getPotionType(NamespaceID.from(id));
	}

	/** Returns the corresponding PotionType matching the given id. Returns null if none match. */
	public static PotionType getPotionType(NamespaceID id) {
		return potionTypes.get(id);
	}

	/** Returns the corresponding Sound matching the given id. Returns null if none match. */
	public static Sound getSound(String id) {
		return getSound(NamespaceID.from(id));
	}

	/** Returns the corresponding Sound matching the given id. Returns null if none match. */
	public static Sound getSound(NamespaceID id) {
		return sounds.get(id);
	}

	/** Returns the corresponding StatisticType matching the given id. Returns null if none match. */
	public static StatisticType getStatisticType(String id) {
		return getStatisticType(NamespaceID.from(id));
	}

	/** Returns the corresponding StatisticType matching the given id. Returns null if none match. */
	public static StatisticType getStatisticType(NamespaceID id) {
		return statisticTypes.get(id);
	}


}
