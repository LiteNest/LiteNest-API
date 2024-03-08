package container.desktop.api.entity;

public interface Entity {
    /**
     * 向实体添加属性，注意，此属性不参与持久化过程，这意味着重新获取后将会删除这些属性
     * @param key 键
     * @param value 值
     */
    void addAttribute(String key, Object value);

    /**
     * 获取属性
     * @param key 键
     * @return 值
     */
    Object getAttribute(String key);

    /**
     * 删除属性
     * @param key 键
     */
    void deleteAttribute(String key);

    /**
     * 清空属性
     */
    void clearAttributes();
}
