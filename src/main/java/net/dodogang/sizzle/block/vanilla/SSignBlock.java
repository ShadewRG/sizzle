package net.dodogang.sizzle.block.vanilla;

import net.dodogang.sizzle.util.SSign;
import net.minecraft.block.SignBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

public class SSignBlock extends SignBlock implements SSign {
    private final Identifier texture;

    public SSignBlock(Identifier texture, Settings settings) {
        super(settings, SignType.OAK);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
