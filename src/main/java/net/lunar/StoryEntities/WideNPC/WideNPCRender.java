package net.lunar.StoryEntities.WideNPC;

import net.lunar.StoryEntities.ModModelLayers;
import net.lunar.StoryTelling;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class WideNPCRender extends MobEntityRenderer<WideNPCEntity, WideNPCModel<WideNPCEntity>> {
    private static final Identifier TEXTURE = new Identifier(StoryTelling.MOD_ID, "textures/entity/wide_npc.png");

    public WideNPCRender(EntityRendererFactory.Context context) {
        super(context, new WideNPCModel<>(context.getPart(ModModelLayers.WIDE_NPC_MODEL)), 0.5f);
    }

    @Override
    public Identifier getTexture(WideNPCEntity entity) {
        return TEXTURE;
    }
}
