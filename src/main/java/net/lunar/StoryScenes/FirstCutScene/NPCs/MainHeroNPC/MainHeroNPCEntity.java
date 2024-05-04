package net.lunar.StoryScenes.FirstCutScene.NPCs.MainHeroNPC;

import net.lunar.util.EntityNavigationSub;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MainHeroNPCEntity extends PathAwareEntity {
    public MainHeroNPCEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public EntityNavigation getNavigation() {
        return new EntityNavigationSub(this, this.getWorld());
    }
}
