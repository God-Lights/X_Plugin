package edshin.edPlug.Event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class InvOpenEvent implements Listener {
    @EventHandler
    public void invOpen(InventoryOpenEvent e) {
        if(ChatColor.stripColor(e.getView().getTitle()).equalsIgnoreCase("TESTGUI")) {

        }
    }
}
