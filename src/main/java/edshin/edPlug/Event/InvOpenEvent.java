package edshin.edPlug.Event;

import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.GameEvent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

import static net.kyori.adventure.text.Component.text;

public class InvOpenEvent implements Listener {
    boolean isOpen = true;
    @EventHandler
    public void onPlayerDeathByPlugin(PlayerDeathEvent e) {
        if(e.getPlayer().getKiller() != null) {
            e.deathMessage(text(e.getPlayer().getKiller().getName()+" ──("+e.getPlayer().getLocation().getBlockX()+", "+e.getPlayer().getLocation().getBlockY()+", "+e.getPlayer().getLocation().getBlockZ()+")─> "+e.getPlayer().getName()));
        } else {
            e.deathMessage(text(""));
            e.getPlayer().getServer().sendMessage(text(ChatColor.RED+"One Player Died in ("+e.getPlayer().getLocation().getBlockX()+", "+e.getPlayer().getLocation().getBlockY()+", "+e.getPlayer().getLocation().getBlockZ()+")."));
        }
    }
}
