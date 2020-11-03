package net.dodogang.sizzle;

import net.dodogang.sizzle.init.SBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class SizzleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap INSTANCE = BlockRenderLayerMap.INSTANCE;
        INSTANCE.putBlocks(RenderLayer.getCutout(), SBlocks.FUNGI.DOOR, SBlocks.FUNGI.DOOR);
    }
}
