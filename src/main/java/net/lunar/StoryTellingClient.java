package net.lunar;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lunar.StoryEntities.ModModelLayers;
import net.lunar.StoryEntities.ModStoryEntities;
import net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC.MainHeroNPCModel;
import net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC.MainHeroNPCRender;
import net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC.ShoneNPCModel;
import net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC.ShoneNPCRender;


public class StoryTellingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MAIN_HERO_NPC_ENTITY, MainHeroNPCModel::getTexturedModelData);
        EntityRendererRegistry.register(ModStoryEntities.MAIN_HERO_NPC_ENTITY, MainHeroNPCRender::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SHONE_NPC_MODEL, ShoneNPCModel::getTexturedModelData);
        EntityRendererRegistry.register(ModStoryEntities.SHONE_NPC_ENTITY, ShoneNPCRender::new);
    }
}
