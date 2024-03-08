package container.desktop.api.plugin;

import java.io.File;

public interface PluginManager {
    void loadPlugins(File folder);
    void unloadPlugins();
    Plugin[] getPlugins();
    Plugin getPlugin();
}
