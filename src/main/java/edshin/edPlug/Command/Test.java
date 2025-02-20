package edshin.edPlug.Command;

import edshin.edPlug.GUI.RECIPES;
import edshin.edPlug.GUI.RecipeMain;
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

import java.awt.*;
import java.util.*;

import static net.kyori.adventure.text.Component.text;

public class Test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player)sender;
        Location l = p.getEyeLocation();
        /*
        Slime slime = p.getWorld().spawn(l, Slime.class);
        slime.setSize(1);
        slime.setWander(false);
        slime.setAI(false);
        slime.customName(text(p.getName()));
        Villager npc = p.getWorld().spawn(l, Villager.class);
        npc.customName(text(p.getName()));
        npc.setAI(false);
        Interaction interaction = p.getWorld().spawn(l, Interaction.class);
        interaction.setInteractionWidth((float)p.getWidth());
        interaction.setInteractionHeight((float)p.getHeight());
        interaction.addScoreboardTag("intercommand");
        */
        if(p.isOp()) {
            if(args[0].equals("sitem")) {
                ItemDisplay itemDisplay = p.getWorld().spawn(l, ItemDisplay.class);

                ItemStack itemStack = new ItemStack(Objects.requireNonNull(Material.getMaterial(args[1])));
                itemDisplay.setItemStack(itemStack);
                itemDisplay.setDisplayHeight(1f);
                itemDisplay.setDisplayWidth(1f);
                itemDisplay.setRotation(p.getYaw(),0);
                itemDisplay.addScoreboardTag(args[2]);
                Date date = new Date();
                p.sendMessage(p.getClientBrandName()+"\n"+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()+"\n"+date.getTime());
            }
            if(args[0].equals("gitem")) {
                if(args[1].equals("light_dust")) {
                    ItemStack lightDust = new ItemStack(Material.GLOWSTONE_DUST);
                    ItemMeta ldMeta = lightDust.getItemMeta();
                    ldMeta.setCustomModelData(103232);
                    ldMeta.itemName(text("Light Dust"));
                    ldMeta.setMaxStackSize(99);
                    lightDust.setItemMeta(ldMeta);
                    p.give(lightDust);
                }
                if(args[1].equals("light_shard")) {
                    ItemStack lightShard = new ItemStack(Material.GLOWSTONE_DUST);
                    ItemMeta lsMeta = lightShard.getItemMeta();
                    lsMeta.setCustomModelData(113101);
                    lsMeta.itemName(text("Light Shard"));
                    lightShard.setItemMeta(lsMeta);
                    p.give(lightShard);
                }
                if(args[1].equals("magic_shard")) {
                    ItemStack magicShard = new ItemStack(Material.KNOWLEDGE_BOOK);
                    ItemMeta msMeta = magicShard.getItemMeta();
                    msMeta.setCustomModelData(112345);
                    msMeta.itemName(text("Magic Shard"));
                    magicShard.setItemMeta(msMeta);
                    p.give(magicShard);
                }
            }
        }
        if(args[0].equals("recipe")) {
            RECIPES recipes = new RECIPES();
            recipes.open(p);
        }
        return false;
    }
}
