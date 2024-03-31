package container.desktop.api.service;

import container.desktop.api.entity.Container;
import container.desktop.api.entity.Volume;
import container.desktop.api.exception.ContainerCreationException;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

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
     * @param customName 容器实体的自定义名称
     * @param imageId 容器镜像ID
     * @param networkId 容器网络ID
     * @param rootDisk 跟磁盘大小
     * @param vcpu 虚拟处理器数量
     * @param RAM 运行内存
     * @param command 启动命令
     * @param username 容器所属用户名
     * @return 容器ID
     */
    String create(String name,
                String customName,
                String imageId,
                String networkId,
                Integer rootDisk,
                Integer vcpu,
                Integer RAM,
                String command, @NotNull String username) throws ContainerCreationException;

    /**
     * 创建容器
     * @param imageId 容器镜像ID
     * @param customName 容器实体的自定义名称
     * @param networkId 容器网络ID
     * @param rootDisk 跟磁盘大小
     * @param vcpu 虚拟处理器数量
     * @param RAM 运行内存
     * @param command 启动命令
     * @return 容器ID
     */
    String create(String customName,
                  String imageId,
                  String networkId,
                  Integer rootDisk,
                  Integer vcpu,
                  Integer RAM,
                  String command,
                  @NotNull String username) throws ContainerCreationException;

    String create(String name,
                  String customName,
                  String imageId,
                  String networkId,
                  Integer rootDisk,
                  Integer vcpu,
                  Integer RAM,
                  String command,
                  @NotNull String username,
                  List<Volume.VolumeBinding> volumeIds) throws ContainerCreationException;

    String create(String name,
                  String customName,
                  String imageId,
                  String networkId,
                  Integer rootDisk,
                  Integer vcpu,
                  Integer RAM,
                  String command,
                  @NotNull String username,
                  Map<String, String> env,
                  List<Volume.VolumeBinding> volumeIds) throws ContainerCreationException;

    String create(String customName,
                  String imageId,
                  String networkId,
                  Integer rootDisk,
                  Integer vcpu,
                  Integer RAM,
                  String command,
                  @NotNull String username,
                  List<Volume.VolumeBinding> volumeIds) throws ContainerCreationException;

    String create(String customName,
                  String imageId,
                  String networkId,
                  Integer rootDisk,
                  Integer vcpu,
                  Integer RAM,
                  String command,
                  @NotNull String username,
                  Map<String, String> env,
                  List<Volume.VolumeBinding> volumeIds) throws ContainerCreationException;

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

    Integer getMaxVCPUs();

    @RequiredArgsConstructor
    class NetworkNotAttachableException extends RuntimeException {
        private final String networkId;
    }
}
