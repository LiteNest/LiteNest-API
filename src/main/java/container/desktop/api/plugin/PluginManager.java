package container.desktop.api.plugin;

import container.desktop.api.command.CommandExecutor;
import container.desktop.api.command.PluginCommand;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface PluginManager {
    void loadPlugins(File folder) throws IOException, Exception;
    void unloadPlugins();
    Plugin[] getPlugins();
    Plugin getPlugin(String name);
    Map<String, PluginCommand> getAllRegisteredPluginCommandsMap();
    Collection<PluginCommand> getAllRegisteredPluginCommands();

    /**
     * 注册命令
     * @param plugin 插件
     * @param name 命令名称
     * @param commandExecutor 命令处理器
     */
    void registerPluginCommand(Plugin plugin, String name, CommandExecutor commandExecutor);
}
