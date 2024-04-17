package container.desktop.api.exception;

import lombok.Getter;

@Getter
public class IllegalVolumeSizeException extends RuntimeException {
    private final Integer expectSize;
    private final String volumeId;

    public IllegalVolumeSizeException(String message, Integer expectSize, String volumeId) {
        super(message);
        this.expectSize = expectSize;
        this.volumeId = volumeId;
    }
}
