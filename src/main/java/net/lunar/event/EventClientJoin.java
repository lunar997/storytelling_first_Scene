package net.lunar.event;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.lunar.StoryScenes.FirstCutScene.FirstScene;
import net.lunar.StoryTelling;
import net.lunar.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;

import java.util.Objects;

public class EventClientJoin implements ClientPlayConnectionEvents.Join{
    @Override
    public void onPlayReady(ClientPlayNetworkHandler handler, PacketSender sender, MinecraftClient client) {
        PlayerEntity player = Objects.requireNonNull(Objects.requireNonNull(client.getServer()).getWorld(World.OVERWORLD)).getPlayers().get(0);
        IEntityDataSaver player_nbt = (IEntityDataSaver) player;
        NbtCompound nbt = player_nbt.getPersistentData();
        int storyTellInt = nbt.getInt("storyTellInt");
        if(storyTellInt == 0) {
            StoryTelling.LOGGER.info("Start First Scene");
            try {
                FirstScene.firstScene(player);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
