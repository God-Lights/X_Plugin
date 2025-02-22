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
        ItemStack lightDust = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta ldMeta = lightDust.getItemMeta();
        ldMeta.setCustomModelData(103232);
        ldMeta.itemName(text("Light Dust"));
        ldMeta.setMaxStackSize(99);
        lightDust.setItemMeta(ldMeta);
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
        if(ChatColor.stripColor(e.getView().getTitle()).equalsIgnoreCase("KKANG")) {
            if(e.getCurrentItem().equals(lightDust)) {
                ItemStack curItem = e.getCurrentItem();
                ItemStack slotItem = e.getView().getItem(24);
                e.getView().setItem(24,curItem);
                e.setCurrentItem(slotItem);
                e.setCancelled(true);
            } else if(!e.getCurrentItem().isEmpty()){
                e.setCancelled(true);
            }

        }
    }
}
