package net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MainHeroNPCEntity extends PathAwareEntity {

    public MainHeroNPCEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public void StartMovingTo(float x, float y, float z, float speed) {
        this.navigation.startMovingTo(x,y,z,speed);
    }
}
