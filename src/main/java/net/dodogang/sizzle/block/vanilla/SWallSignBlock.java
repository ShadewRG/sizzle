package net.dodogang.sizzle.block.vanilla;

import net.dodogang.sizzle.util.SSign;
import net.minecraft.block.WallSignBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

public class SWallSignBlock extends WallSignBlock implements SSign {
    private final Identifier texture;

    public SWallSignBlock(Identifier texture, Settings settings) {
        super(settings, SignType.OAK);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
