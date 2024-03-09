package container.desktop.api.service;

import container.desktop.api.entity.Image;

import java.util.List;

public interface ImageService<I extends Image> extends EntityService<I> {
    List<? extends Image> listAll();
    List<? extends Image> listAllPublic();
    void flush();
    void pull(String id, boolean wait);
    default void pullAndWait(String id) {
        pull(id, true);
    }
}
