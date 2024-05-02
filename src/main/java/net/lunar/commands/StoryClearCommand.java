package net.lunar.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.lunar.StoryTelling;
import net.lunar.util.IEntityDataSaver;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.literal;

public class StoryClearCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {
        dispatcher.register(literal("storyclear")
                .requires(serverCommandSource -> serverCommandSource.hasPermissionLevel(2))
                .executes(StoryClearCommand::storyClear));
    }

    public static int storyClear(CommandContext<ServerCommandSource> context) {

        context.getSource().sendMessage(Text.literal("Story has been cleared"));
        return 1;
    }
}
