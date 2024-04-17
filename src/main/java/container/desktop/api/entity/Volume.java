package container.desktop.api.entity;

import java.util.Collection;
import java.util.List;

public interface Volume extends Entity, Cloneable {
    String getId();
    String getCustomName();
    void setCustomName(String customName);
    List<String> getContainerIds();
    void addContainerId(String id);
    void removeContainerId(String id);
    void addContainerIds(Collection<String> ids);
    String getMountPoint();
    void setMountPoint(String mountPoint);
    Integer getSize();
    void setSize(Integer size);
    Long getOwnerId();
    void setOwnerId(Long ownerId);

    interface VolumeBinding {
        String getVolumeId();
        String getMountPath();
    }
}
