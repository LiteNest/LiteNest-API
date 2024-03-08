package container.desktop.api.repository;

import container.desktop.api.entity.Entity;

public interface Repository<T extends Entity> {
    T findById();
    void deleteById();
    void save(T entity);
    void delete(T entity);
}
