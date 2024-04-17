package container.desktop.api.exception;

import lombok.Getter;

@Getter
public class ContainerCreationException extends Exception {
    private final Reason reason;

    public ContainerCreationException(String message, Reason reason) {
        super(message);
        this.reason = reason;
    }

    public enum Reason {
        USING_NON_PUBLIC_IMAGE,
        INSUFFICIENT_MINIMUM_REQUIREMENTS,
        UNKNOWN
    }
}
