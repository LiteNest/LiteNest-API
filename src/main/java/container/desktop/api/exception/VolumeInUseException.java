package container.desktop.api.exception;

import lombok.Getter;

import java.util.List;

@Getter
public class VolumeInUseException extends RuntimeException {
    private final List<String> containerIds;

    public VolumeInUseException(List<String> containerIds) {
        this.containerIds = containerIds;
    }

}
