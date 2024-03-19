package container.desktop.api.repository;

import container.desktop.api.entity.Volume;

import java.util.List;
import java.util.Optional;

public interface VolumeRepository<V extends Volume> {
    Optional<V> findById(String id);
    List<? extends Volume> findByIds(List<String> ids);
    List<? extends Volume> findByIds(String... ids);
}
