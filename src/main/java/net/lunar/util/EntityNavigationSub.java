package net.lunar.util;

import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeNavigator;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityNavigationSub extends EntityNavigation {
    public EntityNavigationSub(MobEntity entity, World world) {
        super(entity, world);
    }

    @Override
    protected PathNodeNavigator createPathNodeNavigator(int range) {
        return super.createPathNodeNavigator(range);
    }

    @Override
    protected Vec3d getPos() {
        return super.getPos();
    }

    @Override
    protected boolean isAtValidPosition() {
        return super.isAtValidPosition();
    }
}
