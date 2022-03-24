package casper.plugin;

import casper.command.YachtCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class YachtDice extends JavaPlugin implements Listener
{
    @Override
    public void onEnable() {
        // Plugin startup logic
        YachtCommand yachtCommand = new YachtCommand(this);
        getCommand("joinYacht").setExecutor(yachtCommand);
        getCommand("joinYacht2").setExecutor(yachtCommand);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
