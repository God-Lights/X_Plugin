package edshin.edPlug.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.net.http.WebSocket;

import static net.kyori.adventure.text.Component.text;

public class RECIPES implements Listener {
    private final Inventory inv;

    public RECIPES() {
        this.inv = Bukkit.createInventory(null,9,"RECIPES");
        initItemSetting();
    }
    private void initItemSetting() {
        ItemStack lightDust = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta ldMeta = lightDust.getItemMeta();
        ldMeta.setCustomModelData(103232);
        ldMeta.itemName(text("Light Dust"));
        lightDust.setItemMeta(ldMeta);
        ItemStack lightShard = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta lsMeta = lightShard.getItemMeta();
        lsMeta.setCustomModelData(113101);
        lsMeta.itemName(text("Light Shard"));
        lightShard.setItemMeta(lsMeta);
        ItemStack magicShard = new ItemStack(Material.KNOWLEDGE_BOOK);
        ItemMeta msMeta = magicShard.getItemMeta();
        msMeta.setCustomModelData(112345);
        msMeta.itemName(text("Magic Shard"));
        magicShard.setItemMeta(msMeta);
        inv.setItem(0,lightShard);
        inv.setItem(1,magicShard);
    }
    public void open(Player player){
        player.openInventory(inv);
    }
}
