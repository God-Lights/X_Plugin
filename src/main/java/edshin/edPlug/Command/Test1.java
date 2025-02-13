package edshin.edPlug.Command;

import edshin.edPlug.GUI.TestGUI;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.List;

public class Test1 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = sender.getServer().getPlayer(args[0]);
        if(!args[0].isEmpty()) {
            TestGUI testGUI = new TestGUI();
            testGUI.open(p);
            return true;
        }
        return false;
    }
}
