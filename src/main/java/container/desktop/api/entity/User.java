package container.desktop.api.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface User extends Entity, Metadatable {

    /**
     * 获取用户的用户名
     * @return 用户名
     */
    String getUsername();

    /**
     * 获取用户的密码（可能是加密后的密码）
     * @return 密码（可能是加密后的密码）
     */
    String getPassword();

    /**
     * 设置用户的密码
     * @param password 密码
     */
    void setPassword(String password);

    /**
     * 获取用户的ID
     * @return 用户ID
     */
    java.lang.Long getId();

    /**
     * 获取用户所拥有的角色列表
     * @return 用户所拥有的角色列表
     */
    List<Role> getRoles();

    /**
     * 获取用户所拥有的容器的ID的列表
     * @return 用户所拥有的容器的ID的列表
     */
    List<String> getContainerIds();

    /**
     * 检查用户是否持有某一容器
     * @param containerId 容器ID
     * @return 用户是否持有某一容器
     */
    default boolean hasContainer(String containerId){
        return getContainerIds().contains(containerId);
    };

    /**
     * 检查用户是否持有某一角色
     * @param role 角色名称，见{@link Role}中定义的值
     * @return 用户是否持有某一角色
     */
    default boolean hasRole(String role){
        return getRoles().contains(Role.valueOf(role));
    };

    /**
     * 检查用户是否持有某一角色
     * @param role 角色
     * @return 用户是否持有某一角色
     */
    default boolean hasRole(Role role) {
        return getRoles().contains(role);
    };

    /**
     * 给用户添加容器
     * @param containerId 容器ID
     */
    void addContainer(String containerId);

    /**
     * 给用户分配角色
     * @param role 角色
     */
    void addRole(Role role);
    void addContainerId(String id);
    void removeContainerId(String id);
    Set<String> getVolumeIds();
    void addVolumeId(String volumeId);
    void addVolumeIds(Collection<String> volumeIds);
    void removeVolumeId(String volumeId);

    default boolean hasVolume(String volumeId) {
        if (getVolumeIds() == null) return false;
        return getVolumeIds().contains(volumeId);
    }


    @RequiredArgsConstructor
    @Getter
    enum Role {
        ADMIN("admin"),
        USER("user");
        private final String value;

        @Nullable
        public Role parse(String s) {
            for (Role role : Role.class.getEnumConstants()) {
                if (s.equals(role.getValue())) return role;
            }
            return null;
        }
    }
}
