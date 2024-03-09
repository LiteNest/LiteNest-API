package container.desktop.api.repository;

import container.desktop.api.entity.Image;

import java.util.Optional;

public interface ImageRepository<I extends Image> extends Repository<I> {
    Optional<I> findById(String id);
}
