package container.desktop.api.command;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Command {
    @Setter
    protected String description;

    @Setter
    protected String usageMessage;

    private final String name;

    protected Command(String name) {
        this.name = name;
    }

    protected Command(String description, String usageMessage, String name) {
        this.description = description;
        this.usageMessage = usageMessage;
        this.name = name;
    }


}
