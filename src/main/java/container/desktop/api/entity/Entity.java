package container.desktop.api.entity;

public interface Entity {
    /**
     * 向实体添加元数据
     * @param key 键
     * @param value 值
     */
    void addMetaData(String key, Object value);

    /**
     * 获取元数据
     * @param key 键
     * @return 值
     */
    Object getMetaData(String key);

    /**
     * 删除元数据
     * @param key 键
     */
    void deleteMetaData(String key);
}
