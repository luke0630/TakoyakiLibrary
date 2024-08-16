package org.luke.takoyakiLibrary;

import org.bukkit.plugin.java.JavaPlugin;

public final class TakoyakiLibrary {
    private static TakoyakiLibrary instance;
    private GUI gui;

    private TakoyakiLibrary() {
        // コンストラクタをprivateにして、外部からのインスタンス化を防止
    }

    public static TakoyakiLibrary getInstance() {
        if (instance == null) {
            instance = new TakoyakiLibrary();
        }
        return instance;
    }

    public void initialize(JavaPlugin plugin) {
        if (this.gui == null) {
            this.gui = new GUI(plugin);
        }
    }

    public GUI getGUI() {
        return gui;
    }
}
