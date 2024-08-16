package org.luke.takoyakiLibrary;

import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        TakoyakiLibrary.getInstance().initialize(this);
        getLogger().info("TakoyakiLibraryが有効になりました");
    }

    @Override
    public void onDisable() {
        // 必要に応じてリソースのクリーンアップ
        getLogger().info("TakoyakiLibraryが無効になりました");
    }
}
