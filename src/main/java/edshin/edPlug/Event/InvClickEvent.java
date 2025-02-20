package edshin.edPlug.Event;

import edshin.edPlug.GUI.RecipeLightShard;
import edshin.edPlug.GUI.RecipeMain;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static net.kyori.adventure.text.Component.text;

public class InvClickEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        ItemStack noclick = new ItemStack(Material.BARRIER);
        ItemMeta ncmeta = noclick.getItemMeta();
        ncmeta.itemName(text(""));
        ncmeta.setCustomModelData(100000);
        ncmeta.setHideTooltip(true);
        noclick.setItemMeta(ncmeta);
        ItemStack magicShard = new ItemStack(Material.KNOWLEDGE_BOOK);
        ItemMeta msMeta = magicShard.getItemMeta();
        msMeta.setCustomModelData(112345);
        msMeta.itemName(text("Magic Shard"));
        magicShard.setItemMeta(msMeta);
        ItemStack lightShard = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta lsMeta = lightShard.getItemMeta();
        lsMeta.setCustomModelData(113101);
        lsMeta.itemName(text("Light Shard"));
        lightShard.setItemMeta(lsMeta);
        Player player = (Player) e.getWhoClicked();
        if(e.getClickedInventory() == null)
            return;
        if(ChatColor.stripColor(e.getView().getTitle()).equalsIgnoreCase("TESTGUI")) {
            if(e.getCurrentItem().equals(noclick)) {
                e.setCancelled(true);
            }
            if(e.getSlot() == 24) {
                player.give(e.getCurrentItem());e.setCurrentItem(new ItemStack(Material.AIR));e.setCancelled(true);
            }
            if(e.getClickedInventory().getItem(11).equals(new ItemStack(Material.DIAMOND_BLOCK)) && e.getClickedInventory().getItem(12).equals(new ItemStack(Material.DIAMOND_BLOCK)) && e.getClickedInventory().getItem(13).equals(new ItemStack(Material.DIAMOND_BLOCK))) {
                if(e.getClickedInventory().getItem(20).equals(new ItemStack(Material.EMERALD)) && e.getClickedInventory().getItem(21).equals(new ItemStack(Material.ECHO_SHARD)) && e.getClickedInventory().getItem(22).equals(new ItemStack(Material.EMERALD))) {
                    if(e.getClickedInventory().getItem(29).equals(new ItemStack(Material.EMERALD)) && e.getClickedInventory().getItem(30).equals(new ItemStack(Material.NETHER_STAR)) && e.getClickedInventory().getItem(31).equals(new ItemStack(Material.EMERALD))) {
                        e.getClickedInventory().setItem(24,magicShard);
                        e.getClickedInventory().setItem(11,null);
                        e.getClickedInventory().setItem(12,null);
                        e.getClickedInventory().setItem(13,null);
                        e.getClickedInventory().setItem(20,null);
                        e.getClickedInventory().setItem(21,null);
                        e.getClickedInventory().setItem(22,null);
                        e.getClickedInventory().setItem(29,null);
                        e.getClickedInventory().setItem(30,null);
                        e.getClickedInventory().setItem(31,null);
                    }
                }
            }
        }
        if(ChatColor.stripColor(e.getView().getTitle()).equalsIgnoreCase("RECIPE-MAGICSHARD")) {
            e.setCancelled(true);
        }
        if(ChatColor.stripColor(e.getView().getTitle()).equalsIgnoreCase("RECIPE-LIGHTSHARD")) {
            e.setCancelled(true);
        }
        if(ChatColor.stripColor(e.getView().getTitle()).equalsIgnoreCase("RECIPES")) {
            if(e.getCurrentItem().equals(magicShard)) {
                RecipeMain recipeMain = new RecipeMain();
                recipeMain.open(player);
                e.setCancelled(true);
            }
            if(e.getCurrentItem().equals(lightShard)) {
                RecipeLightShard recipeLightShard = new RecipeLightShard();
                recipeLightShard.open(player);
                e.setCancelled(true);
            }
        }
    }
}
