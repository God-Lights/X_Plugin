package edshin.edPlug.Command;

import edshin.edPlug.GUI.TestGUI;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.ChatColor;

import java.util.List;

public class Test1 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = sender.getServer().getPlayer(args[0]);
        if(!args[0].isEmpty() && p.isOp()) {
            TestGUI testGUI = new TestGUI();
            testGUI.open(p);
            p.sendMessage(ChatColor.GOLD+"Your Speed is "+p.getFlySpeed());
            return true;
        }
        return false;
    }
}
