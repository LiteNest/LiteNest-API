package container.desktop.api.service;

import container.desktop.api.entity.Entity;

import java.util.List;

public interface EntityService<E extends Entity> {
    /**
     * 列出所有实体
     * @return 所有实体
     */
    List<E> list();

    /**
     * 根据ID移除或释放实体
     * @param id ID
     */
    void delete(String id);

    /**
     * 根据ID更新实体
     * @param entity 实体
     */
    void update(E entity);
}
