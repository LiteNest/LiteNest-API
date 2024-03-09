package container.desktop.api.service;

import container.desktop.api.entity.Container;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public interface ContainerService<C extends Container> extends EntityService<C>{

    /**
     * 列出所有容器
     * @return 所有容器构成的列表
     */
    List<? extends Container> list();

    /**
     * 根据ID查找某个容器
     * @param id ID
     * @return 容器
     */
    @Nullable
    Container findById(String id);

    /**
     * 根据ID列表查找所有容器
     * @param containerIds ID列表
     * @return 根据ID列表查找到的所有容器
     */
    List<? extends Container> findByIds(List<String> containerIds);

    /**
     * 创建容器
     * @param name 容器名称
     * @param imageId 容器镜像ID
     * @param networkId 容器网络ID
     * @param rootDisk 跟磁盘大小
     * @param vcpu 虚拟处理器数量
     * @param RAM 运行内存
     * @param command 启动命令
     * @return 容器ID
     */
    String create(String name,
                String imageId,
                String networkId,
                Integer rootDisk,
                Integer vcpu,
                Integer RAM,
                String command, @NotNull String username);

    /**
     * 创建容器
     * @param imageId 容器镜像ID
     * @param networkId 容器网络ID
     * @param rootDisk 跟磁盘大小
     * @param vcpu 虚拟处理器数量
     * @param RAM 运行内存
     * @param command 启动命令
     * @return 容器ID
     */
    String create(String imageId,
                  String networkId,
                  Integer rootDisk,
                  Integer vcpu,
                  Integer RAM,
                  String command,
                  @NotNull String username);

    /**
     * 删除容器
     * @param containerId 容器ID
     */
    void delete(String containerId);

    /**
     * 将该容器连接到某网络
     * @param networkId 要连接的网络ID，该网络的{@literal isAttachable()}属性必须为{@literal true}
     */
    void attachTo(String networkId);

    @RequiredArgsConstructor
    class NetworkNotAttachableException extends RuntimeException {
        private final String networkId;
    }
}
