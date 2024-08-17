package org.luke.takoyakiLibrary;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class TakoUtility {

    private TakoUtility() {}

    public static ItemStack getItem(Material material, String name) {
        var item = new ItemStack(material);
        var meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    public static String toColor(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static Inventory getInitInventory(String title, Integer size) {
        return Bukkit.createInventory(null, size, toColor(title));
    }

}
