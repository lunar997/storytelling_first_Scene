package net.lunar.engine;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameMode;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class CutScene {
    public static void CutSceneFunction(PlayerEntity player, BlockPos pos, @Nullable BlockPos newPos, float hY, float hP, int length) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        ServerPlayerEntity ServerPlayer = (ServerPlayerEntity)player;
        BlockPos playerPosBefore = ServerPlayer.getBlockPos();
        ServerPlayer.changeGameMode(GameMode.SPECTATOR);
        ServerPlayer.teleport(ServerPlayer.getServerWorld(), pos.getX(), pos.getY(), pos.getZ(), hY, hP);
        executor.scheduleAtFixedRate(() -> {
            ServerPlayer.teleport(ServerPlayer.getServerWorld(), pos.getX(), pos.getY(), pos.getZ(), hY, hP);
        }, 0, 75, TimeUnit.MILLISECONDS);

        executor.schedule(() -> {
            ServerPlayer.changeGameMode(GameMode.SURVIVAL);
            if(newPos == null) {
                ServerPlayer.teleport(ServerPlayer.getServerWorld(), playerPosBefore.getX(), playerPosBefore.getY(), playerPosBefore.getZ(), 45f, 45f);
            }
            else {
                ServerPlayer.teleport(ServerPlayer.getServerWorld(), newPos.getX(), newPos.getY(), newPos.getZ(), 45f, 45f);
            }
            executor.shutdown();
        }, length, TimeUnit.SECONDS);

    }
}
