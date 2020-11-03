package net.dodogang.sizzle.block.config;

import net.dodogang.sizzle.block.helpers.WoodBlocksConfig;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.sapling.OakSaplingGenerator;

public class FungiWoodBlocksConfig extends WoodBlocksConfig {
    public FungiWoodBlocksConfig() {
        id = "fungi";
        log_suffix = "stem";
        wood_suffix = "hyphae";

        planksMaterial = Material.WOOD;
        planksMaterialColor = MaterialColor.WOOD;
        logTopMaterialColor = MaterialColor.WOOD;
        logSideMaterialColor = MaterialColor.WOOD;
        strippedLogTopMaterialColor = MaterialColor.WOOD;
        strippedLogSideMaterialColor = MaterialColor.WOOD;
        woodMaterial = Material.WOOD;
        woodMaterialColor = MaterialColor.WOOD;
        strippedWoodMaterial = Material.WOOD;
        strippedWoodMaterialColor = MaterialColor.WOOD;

        saplingGenerator = new OakSaplingGenerator();

        BOAT = null;
        BOAT_ITEM = null;
    }
}
