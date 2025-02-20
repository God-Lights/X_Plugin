package edshin.edPlug;

import edshin.edPlug.Command.Fly;
import edshin.edPlug.Command.Food;
import edshin.edPlug.Command.Test;
import edshin.edPlug.Command.Test1;
import edshin.edPlug.Event.InvClickEvent;
import edshin.edPlug.GUI.TestGUI;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.w3c.dom.events.EventListener;

import static net.kyori.adventure.text.Component.text;

public final class EdPlug extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(new InvClickEvent(),this);
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
    public void Interact(PlayerInteractEvent e) {
        ItemStack magicShard = new ItemStack(Material.KNOWLEDGE_BOOK);
        ItemMeta msMeta = magicShard.getItemMeta();
        msMeta.setCustomModelData(112345);
        msMeta.itemName(text("Magic Shard"));
        magicShard.setItemMeta(msMeta);
        if(e.getItem().equals(magicShard)) {
            TestGUI testGUI = new TestGUI();
            testGUI.open(e.getPlayer());
        }
    }

}
