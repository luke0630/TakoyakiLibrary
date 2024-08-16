package org.luke.takoyakiLibrary;

import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("TakoyakiLibrary has enabled.");
    }

    @Override
    public void onDisable() {
        // 必要に応じてリソースのクリーンアップ
        getLogger().info("TakoyakiLibrary has disabled.");
    }
}
