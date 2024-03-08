package container.desktop.api.service;

import container.desktop.api.entity.Network;


public interface NetworkService<N extends Network> extends EntityService<N> {

    /**
     * 创建网路
     * @param name 网络名称
     * @param address 网络地址
     * @return 网络ID
     */
    String create(String name, String address);
}
