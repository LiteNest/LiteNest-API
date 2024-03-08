package container.desktop.api.command;

import container.desktop.api.plugin.Plugin;
import lombok.Getter;
import lombok.Setter;

public class PluginCommand extends Command {
    private final Plugin owner;

    @Getter
    @Setter
    private CommandExecutor commandExecutor;

    protected PluginCommand(String name, Plugin owner) {
        super(name);
        this.owner = owner;
    }

    public Plugin getPlugin() {
        return owner;
    }

    public boolean execute(String[] args) {
        return commandExecutor.onCommand(this.getName(), args);
    }

}
