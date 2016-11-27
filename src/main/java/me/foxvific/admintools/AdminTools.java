package me.foxvific.admintools;

import org.bukkit.plugin.java.JavaPlugin;

public class AdminTools extends JavaPlugin {

    private static AdminTools instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static AdminTools getInstance() {
        return instance;
    }
}
