package edshin.edPlug.Command;

import net.kyori.adventure.bossbar.BossBar;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player && sender.isOp()) {
            Player p = (Player)sender;
            if(!args[0].isBlank()) {
                p.setAllowFlight(Boolean.parseBoolean(args[0]));
                if(!args[1].isBlank()) {
                    p.setFlySpeed(Float.parseFloat(args[1]));
                    p.sendMessage(ChatColor.GOLD+"Set Fly Speed to "+args[1]);
                } else {
                    p.sendMessage(ChatColor.DARK_PURPLE+"Woosh!");
                }
            }
        }
        return false;
    }
}