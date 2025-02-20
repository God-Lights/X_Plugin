package edshin.edPlug.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static net.kyori.adventure.text.Component.text;

public class RecipeMain implements Listener {
    private final Inventory inv;

    public RecipeMain() {
        this.inv = Bukkit.createInventory(null,45,"RECIPE-MAGICSHARD");
        initItemSetting();
    }

    private void initItemSetting() {
        ItemStack noclick = new ItemStack(Material.BARRIER);
        ItemMeta ncmeta = noclick.getItemMeta();
        ncmeta.itemName(text(""));
        ncmeta.setCustomModelData(100000);
        ncmeta.setHideTooltip(true);
        noclick.setItemMeta(ncmeta);
        ItemStack diamondBlock = new ItemStack(Material.DIAMOND_BLOCK);
        ItemStack emerald = new ItemStack(Material.EMERALD);
        ItemStack echoShard = new ItemStack(Material.ECHO_SHARD);
        ItemStack netherStar = new ItemStack(Material.NETHER_STAR);
        ItemStack magicShard = new ItemStack(Material.KNOWLEDGE_BOOK);
        ItemMeta ldMeta = magicShard.getItemMeta();
        ldMeta.setCustomModelData(112345);
        ldMeta.itemName(text("Magic Shard"));
        magicShard.setItemMeta(ldMeta);
        inv.setItem(0,noclick);
        inv.setItem(1,noclick);
        inv.setItem(2,noclick);
        inv.setItem(3,noclick);
        inv.setItem(4,noclick);
        inv.setItem(5,noclick);
        inv.setItem(6,noclick);
        inv.setItem(7,noclick);
        inv.setItem(8,noclick);
        inv.setItem(9,noclick);
        inv.setItem(10,noclick);
        inv.setItem(11,diamondBlock);
        inv.setItem(12,diamondBlock);
        inv.setItem(13,diamondBlock);
        inv.setItem(14,noclick);
        inv.setItem(15,noclick);
        inv.setItem(16,noclick);
        inv.setItem(17,noclick);
        inv.setItem(18,noclick);
        inv.setItem(19,noclick);
        inv.setItem(20,emerald);
        inv.setItem(21,echoShard);
        inv.setItem(22,emerald);
        inv.setItem(23,noclick);
        inv.setItem(24,magicShard);
        inv.setItem(25,noclick);
        inv.setItem(26,noclick);
        inv.setItem(27,noclick);
        inv.setItem(28,noclick);
        inv.setItem(29,emerald);
        inv.setItem(30,netherStar);
        inv.setItem(31,emerald);
        inv.setItem(32,noclick);
        inv.setItem(33,noclick);
        inv.setItem(34,noclick);
        inv.setItem(35,noclick);
        inv.setItem(36,noclick);
        inv.setItem(37,noclick);
        inv.setItem(38,noclick);
        inv.setItem(39,noclick);
        inv.setItem(40,noclick);
        inv.setItem(41,noclick);
        inv.setItem(42,noclick);
        inv.setItem(43,noclick);
        inv.setItem(44,noclick);
    }
    public void open(Player player){
        player.openInventory(inv);
    }
}
