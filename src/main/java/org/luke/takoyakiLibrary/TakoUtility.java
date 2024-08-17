package org.luke.takoyakiLibrary;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

public final class TakoUtility {


    public static String toColor(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static Inventory getInitInventory(String title, Integer size) {
        return Bukkit.createInventory(null, size, toColor(title));
    }

}
