package container.desktop.api.repository;

import container.desktop.api.entity.Container;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ContainerRepository<C extends Container> extends Repository<C> {
    Optional<C> findById(String id);
    List<? extends Container> findByIdIn(Collection<String> ids);
    void deleteAllByIdInBatch(Iterable<String> ids);
}
