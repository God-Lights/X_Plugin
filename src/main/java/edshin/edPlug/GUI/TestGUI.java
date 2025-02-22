package edshin.edPlug.GUI;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

import static net.kyori.adventure.text.Component.text;

public class TestGUI implements Listener {
    private final Inventory inv;

    public TestGUI() {
        this.inv = Bukkit.createInventory(null,45,"TESTGUI");
        initItemSetting();
    }

    private void initItemSetting() {
        ItemStack noclick = new ItemStack(Material.BARRIER);
        ItemMeta ncmeta = noclick.getItemMeta();
        ncmeta.itemName(text(""));
        ncmeta.setCustomModelData(100000);
        ncmeta.setHideTooltip(true);
        noclick.setItemMeta(ncmeta);
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
        inv.setItem(14,noclick);
        inv.setItem(15,noclick);
        inv.setItem(16,noclick);
        inv.setItem(17,noclick);
        inv.setItem(18,noclick);
        inv.setItem(19,noclick);
        inv.setItem(23,noclick);
        inv.setItem(25,noclick);
        inv.setItem(26,noclick);
        inv.setItem(27,noclick);
        inv.setItem(28,noclick);
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
