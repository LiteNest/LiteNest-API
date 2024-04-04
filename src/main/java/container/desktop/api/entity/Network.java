package container.desktop.api.entity;

import lombok.*;

import java.util.List;

public interface Network extends Entity {

    /**
     * 获取网络的ID
     * @return 网络的ID
     */
    String getId();

    /**
     * 获取网络的名称
     * @return 网络名称
     */
    String getName();

    /**
     * 获取网络可用状态
     * @return 该网络是否可用
     */
    boolean isAvailable();
    void setAvailable(boolean available);

    /**
     * 获取网络的地址
     * @return 网络地址
     */
    String getAddr();

    /**
     * 获取网关地址
     * @return 网关地址
     */
    String getGatewayAddr();

    /**
     * 获取网络驱动器模式
     * @return 网络驱动器模式
     */
    NetworkDriver getNetworkDriver();

    /**
     * 删除网络实体下属容器列表中的容器ID
     * @param id 容器ID
     */
    void removeContainerId(String id);

    /**
     * 增添网络实体下属容器列表中的容器ID
     * @param id 容器ID
     */
    void addContainerId(String id);
    /**
     * 获取连接在该网络上的容器的ID
     * @return 连接在该网络上的容器的ID
     */
    List<String> getContainerIds();

    /**
     * 检查该网络是否是可被附加的
     * @return 该网络是否是可被附加的
     */
    boolean isAttachable();
    boolean isShown();
    void setShown(boolean shown);

    /**
     * 网络驱动器模式枚举类
     */
    @AllArgsConstructor
    @Getter
    @SuppressWarnings("all")
    enum NetworkDriver {

        BRIDGE("bridge"),
        HOST("host"),
        OVERLAY("overlay"),
        MACVLAN("macvlan"),
        NONE("none"),
        CUSTOM("");

        @Setter
        private String name;

        public static NetworkDriver parse(String s) {
            for (NetworkDriver constant : NetworkDriver.class.getEnumConstants()) {
                if (constant.getName().equals(s)) return constant;
            }
            return null;
        }
    }
}
