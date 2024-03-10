package container.desktop.api.exception;

import lombok.Getter;

@Getter
public class ImageUpdatingException extends UpdatingException {

    private final Error error;

    public ImageUpdatingException(Error error) {
        this.error = error;
    }




    @Getter
    public enum Error {
        DISALLOW_WITHOUT_REMOTE_DESKTOP_PORT("不允许设置无远程桌面端口的镜像为公开镜像");

        private final String message;

        Error(String message) {
            this.message = message;
        }
    }
}
