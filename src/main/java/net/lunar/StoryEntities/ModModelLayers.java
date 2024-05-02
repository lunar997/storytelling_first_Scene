package net.lunar.StoryEntities;

import net.lunar.StoryTelling;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer WIDE_NPC_MODEL =
            new EntityModelLayer(new Identifier(StoryTelling.MOD_ID, "wide_npc"), "main");
    public static final EntityModelLayer MAIN_HERO_NPC_ENTITY =
            new EntityModelLayer(new Identifier(StoryTelling.MOD_ID, "main_hero_npc"), "main");
    public static final EntityModelLayer SHONE_NPC_MODEL =
            new EntityModelLayer(new Identifier(StoryTelling.MOD_ID, "shone_npc"), "main");
}
