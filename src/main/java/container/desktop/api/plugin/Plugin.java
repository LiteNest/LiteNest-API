package container.desktop.api.plugin;

import java.io.File;

public interface Plugin {
    void onEnable();
    void onDisable();
    String getName();
    String getVersion();
    File getDataFolder();
}
