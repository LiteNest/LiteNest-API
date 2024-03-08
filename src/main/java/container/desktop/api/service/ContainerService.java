package container.desktop.api.service;

import container.desktop.api.entity.Container;
import lombok.RequiredArgsConstructor;

public interface ContainerService<C extends Container> extends EntityService<C>{

    /**
     * 创建容器
     * @param name 容器名称
     * @param imageId 容器镜像ID
     * @param networkId 容器网络ID
     * @param rootDisk 跟磁盘大小
     * @param vcpu 虚拟处理器数量
     * @param RAM 运行内存
     * @return 容器ID
     */
    String create(String name,
                String imageId,
                String networkId,
                Integer rootDisk,
                Integer vcpu,
                Integer RAM);

    /**
     * 创建容器
     * @param imageId 容器镜像ID
     * @param networkId 容器网络ID
     * @param rootDisk 跟磁盘大小
     * @param vcpu 虚拟处理器数量
     * @param RAM 运行内存
     * @return 容器ID
     */
    String create(String imageId,
                String networkId,
                Integer rootDisk,
                Integer vcpu,
                Integer RAM);

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
