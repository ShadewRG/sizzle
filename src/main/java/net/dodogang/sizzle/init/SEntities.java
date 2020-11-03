package net.dodogang.sizzle.init;

import net.dodogang.sizzle.Sizzle;
import net.dodogang.sizzle.block.helpers.WoodBlocks;
import net.dodogang.sizzle.entity.vanilla.SBoatEntity;
import net.dodogang.sizzle.util.SBoat;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SEntities {
    public SEntities() {}

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> entityType, int[] spawnEggColors) {
        EntityType<T> builtEntityType = entityType.build(id);

        if (spawnEggColors[0] != 0)
            SItems.register(id + "_spawn_egg", new SpawnEggItem(builtEntityType, spawnEggColors[0], spawnEggColors[1], new Item.Settings().maxCount(64).group(Sizzle.ITEM_GROUP)));

        return Registry.register(Registry.ENTITY_TYPE, new Identifier(Sizzle.MOD_ID, id), builtEntityType);
    }
    @SuppressWarnings("unused")
    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> entityType) {
        return register(id, entityType, new int[]{ 0, 0 });
    }

    public static EntityType<SBoatEntity> register(WoodBlocks wood, BoatEntity.Type vanilla) {
        return Registry.register(Registry.ENTITY_TYPE, new Identifier(Sizzle.MOD_ID, wood.id + "_boat"),
                FabricEntityTypeBuilder.<SBoatEntity>create(SpawnGroup.MISC, (entity, world) -> new SBoatEntity(entity, world, new SBoat(wood.BOAT_ITEM, wood.PLANKS.asItem(), new Identifier(Sizzle.MOD_ID, "textures/entity/boat/" + wood.id + ".png"), vanilla))).dimensions(EntityDimensions.fixed(1.375F, 0.5625F)).build());
    }
}
