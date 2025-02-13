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
        this.inv = Bukkit.createInventory(null,9,"TESTGUI");
        initItemSetting();
    }

    private void initItemSetting() {
        String[] star = {"★☆☆☆☆","★★☆☆☆","★★★☆☆","★★★★☆","★★★★★"};
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.itemName(text(star[(int)(Math.random()*5)],TextColor.color(65535)));
        itemMeta.addEnchant(Enchantment.SHARPNESS,255,true);
        AttributeModifier attributeModifier = new AttributeModifier(NamespacedKey.minecraft("attack_speed"),15D, AttributeModifier.Operation.MULTIPLY_SCALAR_1);
        itemMeta.addAttributeModifier(Attribute.ATTACK_SPEED,attributeModifier);
        //TextComponent component = Component.text("VeryGoodSword", Style.style(TextColor.color(65535), TextDecoration.BOLD));
        itemStack.setItemMeta(itemMeta);
        inv.setItem(4,itemStack);
    }
    public void open(Player player){
        player.openInventory(inv);
    }
}
