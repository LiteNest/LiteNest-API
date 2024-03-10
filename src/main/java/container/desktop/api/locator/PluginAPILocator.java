package container.desktop.api.locator;

import container.desktop.api.plugin.PluginManager;
import lombok.Getter;

public class PluginAPILocator {
    @Getter
    private static PluginManager pluginManager;

    public static void setPluginManager(PluginManager pluginManager) {
        if (PluginAPILocator.pluginManager == null) {
            PluginAPILocator.pluginManager = pluginManager;
        } else {
            throw new IllegalModificationException();
        }
    }

}
