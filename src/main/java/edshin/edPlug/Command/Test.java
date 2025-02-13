package edshin.edPlug.Command;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockDataMeta;
import org.bukkit.inventory.meta.ItemMeta;

import static net.kyori.adventure.text.Component.text;

public class Test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player)sender;
        Location l = p.getLocation();
        Slime slime = p.getWorld().spawn(l, Slime.class);
        slime.setSize(1);
        slime.setWander(false);
        slime.setAI(false);
        slime.customName(text(p.getName()));
        Villager npc = p.getWorld().spawn(l, Villager.class);
        npc.customName(text(p.getName()));
        npc.setAI(false);
        npc.sleep(l);
        /*
        Interaction interaction = p.getWorld().spawn(l, Interaction.class);
        interaction.setInteractionWidth((float)p.getWidth());
        interaction.setInteractionHeight((float)p.getHeight());
        interaction.addScoreboardTag("intercommand");
        */

        p.sendMessage(p.getClientBrandName()+"\n");
        return false;
    }
}
