package container.desktop.api.service;

import container.desktop.api.entity.Entity;
import container.desktop.api.exception.UpdatingException;

public interface EntityService<E extends Entity> {

    /**
     * 根据ID更新实体，请注意这是期望的容器状态，
     * 应用程序将会尽可能将容器的状态变为期望状态，
     * 但实际受到执行过程的影响
     * @param entity 实体
     */
    void update(E entity) throws UpdatingException;
}
