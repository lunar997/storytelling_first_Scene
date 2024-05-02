package net.lunar;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lunar.StoryEntities.ModStoryEntities;
import net.lunar.StoryEntities.WideNPC.WideNPCEntity;
import net.lunar.commands.StoryClearCommand;
import net.lunar.event.EventClientJoin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoryTelling implements ModInitializer {
	public static final String MOD_ID = "storytelling";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(ModStoryEntities.MAIN_HERO_NPC_ENTITY, WideNPCEntity.createDefaultAttributes());
		FabricDefaultAttributeRegistry.register(ModStoryEntities.SHONE_NPC_ENTITY, WideNPCEntity.createDefaultAttributes());
		//ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register(new EventTriggerKillOtherEntity());
		ClientPlayConnectionEvents.JOIN.register(new EventClientJoin());
		CommandRegistrationCallback.EVENT.register(StoryClearCommand::register);
	}
}