package net.lunar.StoryEntities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

import net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC.MainHeroNPCEntity;
import net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC.ShoneNPCEntity;
import net.lunar.StoryTelling;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStoryEntities {
    public static final EntityType<MainHeroNPCEntity> MAIN_HERO_NPC_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(StoryTelling.MOD_ID, "main_hero_npc"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MainHeroNPCEntity::new)
                    .dimensions(EntityDimensions.fixed(1,2))
                    .build());
    public static final EntityType<ShoneNPCEntity> SHONE_NPC_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(StoryTelling.MOD_ID, "shone_npc"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ShoneNPCEntity::new)
                    .dimensions(EntityDimensions.fixed(1,2))
                    .build());
}
