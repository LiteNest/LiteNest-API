package container.desktop.api.service;

import container.desktop.api.entity.Volume;
import container.desktop.api.exception.IllegalVolumeSizeException;
import container.desktop.api.exception.ResourceNotFoundException;
import container.desktop.api.exception.VolumeInUseException;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface VolumeService<V extends Volume> extends EntityService<V> {
    List<? extends Volume> list();

    @Nullable
    Volume findById(String id);

    List<? extends Volume> findByIds(List<String> ids);

    /**
     * 通过ID删除卷
     * @param id 卷的ID
     */
    void deleteById(String id);

    /**
     * 创建一个卷
     * @param size 容量，单位为GB
     * @return 卷的ID
     */
    String create(Integer size, Long userId);

    String create(Integer size, String customName, Long userId);
    void delete(String id) throws VolumeInUseException;
    String resize(String id, Integer size, Long userId) throws IllegalVolumeSizeException, ResourceNotFoundException;
}
