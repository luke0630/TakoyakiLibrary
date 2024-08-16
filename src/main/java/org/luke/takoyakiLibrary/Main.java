package org.luke.takoyakiLibrary;

import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    private static JavaPlugin plugin;

    public static GUI GUI = null;

    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info("TacoRaceLibraryが有効になりました");

        Main.GUI = new GUI();
    }
}
