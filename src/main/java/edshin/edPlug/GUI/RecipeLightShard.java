package edshin.edPlug.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static net.kyori.adventure.text.Component.text;

public class RecipeLightShard implements Listener {
    private final Inventory inv;

    public RecipeLightShard() {
        this.inv = Bukkit.createInventory(null,45,"RECIPE-LIGHTSHARD");
        initItemSetting();
    }

    private void initItemSetting() {
        ItemStack noclick = new ItemStack(Material.BARRIER);
        ItemMeta ncmeta = noclick.getItemMeta();
        ncmeta.itemName(text(""));
        ncmeta.setCustomModelData(100000);
        ncmeta.setHideTooltip(true);
        noclick.setItemMeta(ncmeta);
        ItemStack a = new ItemStack(Material.AIR);
        ItemStack b = new ItemStack(Material.AMETHYST_SHARD);
        ItemStack c = new ItemStack(Material.AIR);
        ItemStack d = new ItemStack(Material.AMETHYST_SHARD);
        ItemStack e = new ItemStack(Material.AIR);
        ItemStack f = new ItemStack(Material.AMETHYST_SHARD);
        ItemStack g = new ItemStack(Material.AIR);
        ItemStack h = new ItemStack(Material.AMETHYST_SHARD);
        ItemStack i = new ItemStack(Material.AIR);
        ItemStack lightShard = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta lsMeta = lightShard.getItemMeta();
        lsMeta.setCustomModelData(113101);
        lsMeta.itemName(text("Light Shard"));
        lightShard.setItemMeta(lsMeta);

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
        //inv.setItem(11,a); //0
        inv.setItem(12,b); //1
        //inv.setItem(13,c); //2
        inv.setItem(14,noclick);
        inv.setItem(15,noclick);
        inv.setItem(16,noclick);
        inv.setItem(17,noclick);
        inv.setItem(18,noclick);
        inv.setItem(19,noclick);
        inv.setItem(20,d); //3
        //inv.setItem(21,e); //4
        inv.setItem(22,f); //5
        inv.setItem(23,noclick);
        inv.setItem(24,lightShard); //result
        inv.setItem(25,noclick);
        inv.setItem(26,noclick);
        inv.setItem(27,noclick);
        inv.setItem(28,noclick);
        //inv.setItem(29,g); //6
        inv.setItem(30,h); //7
        //inv.setItem(31,i); //8
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
