package net.lunar.event;


import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC.ShoneNPCEntity;
import net.lunar.engine.cutScene;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class EventTriggerKillOtherEntity implements ServerEntityCombatEvents.AfterKilledOtherEntity{
    @Override
    public void afterKilledOtherEntity(ServerWorld world, Entity entity, LivingEntity killedEntity) {
        if(entity.isPlayer() && killedEntity instanceof ShoneNPCEntity) {
            entity.sendMessage(Text.literal("USE NORM"));
            cutScene.cutSceneFunction((PlayerEntity)entity, new BlockPos(-55, -45, -30), null, 35f,18f, 5);
        }
        else entity.sendMessage(Text.literal("Something wrong!!!"));
    }
}
