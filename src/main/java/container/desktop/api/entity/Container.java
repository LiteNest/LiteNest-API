package container.desktop.api.entity;

import java.util.List;

public interface Container extends Entity {
    /**
     * 取出容器ID
     * @return 容器ID
     */
    String getId();

    /**
     * 取出容器所用镜像ID
     * @return 镜像ID
     */
    String getImageId();

    /**
     * 取出容器的根磁盘大小（单位：GB）
     * @return 根磁盘大小
     */
    Integer getRootDisk();

    /**
     * 取出容器所具有的虚拟处理器数量
     * @return 虚拟处理器数量
     */
    Integer getVcpus();

    /**
     * 取出容器所具有的运行内存
     * @return 运行内存
     */
    Integer getRAM();

    /**
     * 取出容器所加入的网络ID
     * @return 网络ID
     */
    List<String> getNetworkIds();

    PowerStatus getPowerStatus();

    Long getOwnerId();

    enum PowerStatus {
        POWER_OFF,
        ACTIVE
    }
}
