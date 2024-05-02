package net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC;

import net.lunar.StoryEntities.ModModelLayers;
import net.lunar.StoryTelling;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ShoneNPCRender extends MobEntityRenderer<ShoneNPCEntity, ShoneNPCModel<ShoneNPCEntity>> {
    private static final Identifier TEXTURE = new Identifier(StoryTelling.MOD_ID, "textures/entity/shone.png");

    public ShoneNPCRender(EntityRendererFactory.Context context) {
        super(context, new ShoneNPCModel<>(context.getPart(ModModelLayers.SHONE_NPC_MODEL)), 0.5f);
    }

    @Override
    public Identifier getTexture(ShoneNPCEntity entity) {
        return TEXTURE;
    }


}
