package container.desktop.api.service;

import container.desktop.api.entity.Entity;
import container.desktop.api.exception.UpdatingException;

public interface EntityService<E extends Entity> {

    /**
     * 根据ID更新实体
     * @param entity 实体
     */
    void update(E entity) throws UpdatingException;
}
