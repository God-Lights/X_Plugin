package edshin.edPlug;

import edshin.edPlug.Command.Fly;
import edshin.edPlug.Command.Food;
import edshin.edPlug.Command.Test;
import edshin.edPlug.Command.Test1;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.w3c.dom.events.EventListener;

import static net.kyori.adventure.text.Component.text;

public final class EdPlug extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage("Plugin is allowed");
        getCommand("fly").setExecutor(new Fly());
        getCommand("food").setExecutor(new Food());
        getCommand("test").setExecutor(new Test());
        getCommand("test1").setExecutor(new Test1());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("Plugin is disabled");
    }
    @EventHandler
    public void EntityDamageByEntity(EntityDamageByEntityEvent e) {
        Entity entity = e.getEntity();
        Bukkit.broadcast(text(entity.getType()+","+e.getDamage()));
    }
}
