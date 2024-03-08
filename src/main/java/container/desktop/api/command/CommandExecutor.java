package container.desktop.api.command;

public interface CommandExecutor {
    boolean onCommand(String command, String[] args);
}
