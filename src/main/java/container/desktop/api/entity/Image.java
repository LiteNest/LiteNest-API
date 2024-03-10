package container.desktop.api.entity;

import org.jetbrains.annotations.Nullable;

public interface Image extends Entity {

    /**
     * 获取镜像ID
     * @return 镜像ID
     */
    String getId();

    /**
     * 获取镜像名称
     * @return 镜像名称
     */
    String getName();

    /**
     * 获取该镜像最小的CPU数量
     * @return 最小的CPU数量
     */
    Integer getMinimumVcpus();

    /**
     * 获取该镜像最小的运行内存数量
     * @return 最小的运行内存数量
     */
    Integer getMinimumRAM();

    /**
     * 获取对外远程桌面端口
     * @return 对外远程桌面端口
     */
    Integer getRemoteDesktopPort();

    boolean isAvailable();

    /**
     * 设置镜像的可用状态
     * @param available 镜像的可用状态
     */
    void setAvailable(@Nullable Boolean available);

    /**
     * 查询镜像是否为公共镜像
     * @return 是否为公共镜像
     */
    boolean isPublic();

    /**
     * 设置镜像公开状态
     * @param _public 镜像公开状态
     */
    void setPublic(@Nullable Boolean _public);

    /**
     * 设置远程桌面端口
     * @param port 远程桌面端口
     */
    void setRemoteDesktopPort(@Nullable Integer port);
}
