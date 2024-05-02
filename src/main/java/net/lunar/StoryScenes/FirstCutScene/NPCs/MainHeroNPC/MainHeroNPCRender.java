package net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC;

import net.lunar.StoryEntities.ModModelLayers;
import net.lunar.StoryTelling;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MainHeroNPCRender extends MobEntityRenderer<MainHeroNPCEntity, MainHeroNPCModel<MainHeroNPCEntity>> {
    private static final Identifier TEXTURE = new Identifier(StoryTelling.MOD_ID, "textures/entity/main_hero.png");

    public MainHeroNPCRender(EntityRendererFactory.Context context) {
        super(context, new MainHeroNPCModel<>(context.getPart(ModModelLayers.MAIN_HERO_NPC_ENTITY)), 0.5f);
    }

    @Override
    public Identifier getTexture(MainHeroNPCEntity entity) {
        return TEXTURE;
    }
}
