package container.desktop.api.repository;

import container.desktop.api.entity.Network;

import java.util.Optional;

public interface NetworkRepository<N extends Network> extends Repository<N>{
    Optional<N> findById(String id);
    Optional<N> findByName(String name);
}
