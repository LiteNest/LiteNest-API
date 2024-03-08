package container.desktop.api.service;

import container.desktop.api.entity.Image;

public interface ImageService<I extends Image> extends EntityService<I> {
    void pull(String id, boolean wait);
    default void pullAndWait(String id) {
        pull(id, true);
    }
}
