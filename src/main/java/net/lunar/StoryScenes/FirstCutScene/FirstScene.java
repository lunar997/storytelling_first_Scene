package net.lunar.StoryScenes.FirstCutScene;

import net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC.MainHeroNPCEntity;
import net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC.ShoneNPCEntity;
import net.lunar.StoryTelling;
import net.lunar.engine.CutScene;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

// -291 -60 71  -120 6
// -296 -60 59  -283 -63 64
// -296 -60 61  -283 -63 66

public class FirstScene {
    public static void firstScene(PlayerEntity player) throws InterruptedException {
        World world = player.getWorld();
        CutScene.CutSceneFunction(player, new BlockPos(-291, -60, 71), null, -120f, 6f, 10);
        EntityType<?> main_hero_type = Registries.ENTITY_TYPE.get(new Identifier(StoryTelling.MOD_ID, "main_hero_npc"));
        EntityType<?> shone_type = Registries.ENTITY_TYPE.get(new Identifier(StoryTelling.MOD_ID, "shone_npc"));
        MainHeroNPCEntity MAIN_HERO = (MainHeroNPCEntity)main_hero_type.create(world);
        assert MAIN_HERO != null;
        ShoneNPCEntity SHONE = (ShoneNPCEntity)shone_type.create(world);
        assert SHONE != null;
        MAIN_HERO.setPosition(-296, -60, 59);
        world.spawnEntity(MAIN_HERO);
        SHONE.setPosition(-296, -60, 61);
        world.spawnEntity(SHONE);
        Thread.sleep(1000);
        StoryTelling.LOGGER.info("Start Moving For NPC");
        MAIN_HERO.StartMovingTo(-283, -63, 64, 0.5f);
        SHONE.getNavigation().startMovingTo(-283, -63, 66, 0.5f);
    }
}
