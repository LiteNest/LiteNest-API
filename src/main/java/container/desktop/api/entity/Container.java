package container.desktop.api.entity;

import java.util.Collection;
import java.util.List;

public interface Container extends Entity {
    /**
     * 取出容器ID
     * @return 容器ID
     */
    String getId();

    /**
     * 取出容器实体的自定义名称（云桌面平台定义，并非容器引擎定义）
     * @return 容器实体的自定义名称
     */
    String getCustomName();

    /**
     * 设置容器实体的自定义名称（云桌面平台定义，并非容器引擎定义）
     * @param customName 容器实体的自定义名称
     */
    void setCustomName(String customName);

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

    List<String> getDataVolumeIds();
    void setDataVolumeIds(List<String> dataVolumeIds);
    void addDataVolumeId(String volumeId);
    void removeDataVolumeId(String volumeId);
    void addDataVolumeIds(Collection<String> ids);

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

    void setPowerStatus(PowerStatus powerStatus);
    Integer getPort();
    void setPort(Integer port);

    enum PowerStatus {
        POWER_OFF,
        STOPPING,
        STARTING,
        ACTIVE;

        public static PowerStatus parse(String s) {
            for (PowerStatus enumConstant : PowerStatus.class.getEnumConstants()) {
                if (enumConstant.toString().equalsIgnoreCase(s)) {
                    return enumConstant;
                }
            }
            return null;
        }
    }
}
