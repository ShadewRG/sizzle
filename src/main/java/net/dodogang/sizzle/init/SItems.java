package net.dodogang.sizzle.init;

import java.util.function.Supplier;

import net.dodogang.sizzle.Sizzle;
import net.dodogang.sizzle.block.helpers.WoodBlocks;
import net.dodogang.sizzle.entity.vanilla.SBoatEntity;
import net.dodogang.sizzle.item.vanilla.SBoatItem;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SItems {
    public SItems() {}

    public static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Sizzle.MOD_ID, id), item);
    }
    public static SignItem register(String id, SignBlock standingSign, WallSignBlock wallSign) {
        return (SignItem)register(id + "_sign", new SignItem(new Item.Settings().maxCount(16).group(Sizzle.ITEM_GROUP), standingSign, wallSign));
    };
    public static SBoatItem register(WoodBlocks wood) {
		return (SBoatItem)register(wood.id + "_boat", new SBoatItem(new Supplier<EntityType<SBoatEntity>>(){
            @Override
            public EntityType<SBoatEntity> get() {
                return wood.BOAT;
            }
        }, new Item.Settings().maxCount(1).group(Sizzle.ITEM_GROUP)));
    }
}
