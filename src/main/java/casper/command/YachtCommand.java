package casper.command;

import casper.plugin.YachtDice;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class YachtCommand implements CommandExecutor
{
    YachtDice main;

    public YachtCommand() { }

    public YachtCommand(YachtDice main)
    {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        Player player = (Player) sender;
        String cmd = command.getName();

        if("joinYacht".equals(cmd))
        {
            Inventory yachtInventory = Bukkit.createInventory(null, 54, "야추 참가방");
            player.openInventory(yachtInventory);
        }
        else if("joinYacht2".equals(cmd))
        {
            Inventory yachtInventory = Bukkit.createInventory(null, 54, "야추 참가방");
            player.openInventory(yachtInventory);
        }

        return false;
    }
}