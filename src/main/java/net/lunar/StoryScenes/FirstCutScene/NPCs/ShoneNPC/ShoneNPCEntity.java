package net.lunar.StoryScenes.FirstCutScene.NPCs.ShoneNPC;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class ShoneNPCEntity extends PathAwareEntity {

    public ShoneNPCEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
