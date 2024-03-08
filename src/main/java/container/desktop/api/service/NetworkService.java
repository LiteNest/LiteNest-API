package container.desktop.api.service;

import container.desktop.api.entity.Network;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public interface NetworkService<N extends Network> extends EntityService<N> {

    /**
     * 列出所有网络
     * @return 网络列表
     */
    List<? extends Network> list();

    /**
     * 根据ID删除网络
     * @param id ID
     * @return 操作结果
     */
    Status deleteById(String id);

    /**
     * 创建网络
     * @param name 网络名称
     * @param attachable 是否可附加
     * @return 网络ID
     */
    String create(String name, boolean attachable);

    /**
     * 创建网络
     * @param name 网络名称
     * @param address 网络地址
     * @param attachable 是否可附加
     * @return 网络ID
     */
    String create(String name, String address, boolean attachable);

    /**
     * 创建网络
     * @param name 网络名称
     * @param address 网络地址
     * @param driver 网络驱动器类型
     * @param attachable 是否可附加
     * @return 网络ID
     */
    String create(String name, String address, Network.NetworkDriver driver, boolean attachable);

    /**
     * 创建网络
     * @param name 网络名称
     * @param driver 网络驱动器类型
     * @param attachable 是否可附加
     * @return 网络ID
     */
    String create(String name, Network.NetworkDriver driver, boolean attachable);

    /**
     * 创建网络
     * @param name 网络名称
     * @return 网络ID
     */
    String create(String name);

    /**
     * 创建网络
     * @param name 网络名称
     * @param address 网络地址
     * @return 网络ID
     */
    String create(String name, String address);

    /**
     * 创建网络
     * @param name 网络名称
     * @param address 网络地址
     * @param driver 网络驱动器类型
     * @return 网络ID
     */
    String create(String name, String address, Network.NetworkDriver driver);

    /**
     * 创建网络
     * @param name 网络名称
     * @param driver 网络驱动器类型
     * @return 网络ID
     */
    String create(String name, Network.NetworkDriver driver);

    @AllArgsConstructor
    @Getter
    enum Status {
        SUCCESS("成功"),
        NETWORK_NOT_EXISTS("网络不存在");
        @Setter
        private String message;
    }
}
