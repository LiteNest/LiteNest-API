package container.desktop.api.repository;

import container.desktop.api.entity.Container;

import java.util.Optional;

public interface ContainerRepository<C extends Container> extends Repository<C> {
    Optional<C> findById(String id);
}
