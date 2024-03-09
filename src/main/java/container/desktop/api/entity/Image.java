package container.desktop.api.entity;

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
    boolean isShown();
}
