package me.pm7.cornbreaddensened.annoyances;

import me.pm7.cornbreaddensened.CornbreadDensened;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoSleep implements Listener {
    CornbreadDensened plugin = CornbreadDensened.getPlugin();
    List<Material> bedsList = Arrays.asList(Material.BLACK_BED, Material.BLUE_BED, Material.BROWN_BED,
            Material.CYAN_BED, Material.GRAY_BED, Material.GREEN_BED, Material.LIME_BED, Material.RED_BED,
            Material.LIGHT_BLUE_BED, Material.LIGHT_GRAY_BED, Material.PINK_BED, Material.PURPLE_BED,
            Material.WHITE_BED, Material.ORANGE_BED, Material.YELLOW_BED, Material.MAGENTA_BED, Material.RESPAWN_ANCHOR);

    List<String> usedBeds = new ArrayList<>();
    @EventHandler
    public void onPlayerSleep(PlayerInteractEvent e) {
        if(e.getClickedBlock() != null) {
            if (bedsList.contains(e.getClickedBlock().getBlockData().getMaterial())) {
                Player p = e.getPlayer();
                if(14 <= p.getHealth() && p.getHealth() <= 15) {
                    if(usedBeds.contains(p.getName())) {
                        usedBeds.remove(p.getName());
                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("...Still gonna set fire to you lol")), 5L);
                    }
                } else {
                    p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("You must be between 14.0 and 15.0 health to set spawn..."));
                    if(p.getHealth() > 15.0) { p.setHealth(13.5); } // :)
                    usedBeds.add(p.getName());
                    e.setCancelled(true);
                }
                p.setFireTicks(200);
            }
        }
    }
}
