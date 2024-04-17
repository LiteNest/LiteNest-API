package container.desktop.api.service;

import container.desktop.api.entity.Image;
import container.desktop.api.exception.ImageUpdatingException;
import container.desktop.api.exception.UpdatingException;

import java.util.List;

public interface ImageService<I extends Image> extends EntityService<I> {
    List<? extends Image> listAll();
    List<? extends Image> listAllPublic();
    Image findById(String id);
    void flush();
    void pull(String id, boolean wait);
    default void pullAndWait(String id) {
        pull(id, true);
    }

    @Override
    void update(I entity) throws ImageUpdatingException;
}
