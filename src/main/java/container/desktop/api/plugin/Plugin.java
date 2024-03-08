package container.desktop.api.plugin;

public interface Plugin {
    void onEnable();
    void onDisable();
    String getName();
    String getVersion();
}
