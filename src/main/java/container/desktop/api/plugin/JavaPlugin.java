package container.desktop.api.plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public abstract class JavaPlugin implements Plugin {
    public Logger getLogger(){
        return LoggerFactory.getLogger(getName());
    }

    @Override
    public File getDataFolder() {
        return new File("./plugins/" + getName());
    }
}
