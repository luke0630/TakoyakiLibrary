package org.luke.takoyakiLibrary;

import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info("TacoRaceLibraryが有効になりました");

        TakoyakiLibrary.GUI = new GUI();
    }
}
