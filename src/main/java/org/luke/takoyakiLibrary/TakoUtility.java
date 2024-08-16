package org.luke.takoyakiLibrary;

import org.bukkit.ChatColor;

public final class TakoUtility {
    public static String toColor(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
