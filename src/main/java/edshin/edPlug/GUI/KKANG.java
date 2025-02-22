package edshin.edPlug.GUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class KKANG implements Listener {
    private final Inventory inv;

    public KKANG() {
        this.inv = Bukkit.createInventory(null,27,"KKANG");
        initItemSetting();
    }
    private void initItemSetting() {
    }
    public void open(Player player){
        player.openInventory(inv);
    }
}
