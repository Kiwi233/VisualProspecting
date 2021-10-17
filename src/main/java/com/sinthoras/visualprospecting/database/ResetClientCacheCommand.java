package com.sinthoras.visualprospecting.database;

import com.sinthoras.visualprospecting.VP;
import net.minecraft.client.resources.I18n;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class ResetClientCacheCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "visualprospectingresetprogress";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return I18n.format("visualprospecting.resetprogress.command");
    }

    @Override
    public void processCommand(ICommandSender sender, String[] parameters) {
        VP.clientCache.resetPlayerProgression();
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
