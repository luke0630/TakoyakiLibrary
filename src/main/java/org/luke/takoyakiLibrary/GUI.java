package org.luke.takoyakiLibrary;

import org.bukkit.plugin.java.JavaPlugin;

public class GUI {
    private final JavaPlugin plugin;

    public GUI(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void test() {
        plugin.getLogger().info("きちゃああああああああああああああ");
    }
 }
