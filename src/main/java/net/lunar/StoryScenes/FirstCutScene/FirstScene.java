package net.lunar.StoryScenes.FirstCutScene;

import net.lunar.StoryEntities.ModStoryEntities;
import net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC.MainHeroNPCEntity;
import net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC.ShoneNPCEntity;
import net.lunar.StoryTelling;
import net.lunar.engine.CutScene;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// -291 -60 71  -120 6
// -296 -60 59  -283 -63 64
// -296 -60 61  -283 -63 66

public class FirstScene {
    public static void firstScene(PlayerEntity player) throws InterruptedException {
        World world = player.getWorld();
        CutScene.CutSceneFunction(player, new BlockPos(-291, -60, 71), null, -120f, 6f, 15);
        EntityType<MainHeroNPCEntity> main_hero_type = ModStoryEntities.MAIN_HERO_NPC_ENTITY;
        EntityType<ShoneNPCEntity> shone_type = ModStoryEntities.SHONE_NPC_ENTITY;
        MainHeroNPCEntity MAIN_HERO = main_hero_type.create(world);
        ShoneNPCEntity SHONE = shone_type.create(world);
        assert MAIN_HERO != null;
        MAIN_HERO.refreshPositionAndAngles(new BlockPos(-296, -60, 59), 45f, 45f);
        assert SHONE != null;
        SHONE.refreshPositionAndAngles(new BlockPos(-296, -60, 61), 45f, 45f);
        world.spawnEntity(MAIN_HERO);
        world.spawnEntity(SHONE);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
            executor.schedule(() -> {
                player.sendMessage(Text.literal("Start Moving"));
                SHONE.getNavigation().startMovingTo(-283, -63, 64, 0.5f);
                MAIN_HERO.getNavigation().startMovingTo(-283, -63, 66, 0.5f);
                        }, 10, TimeUnit.SECONDS);
    }
}
