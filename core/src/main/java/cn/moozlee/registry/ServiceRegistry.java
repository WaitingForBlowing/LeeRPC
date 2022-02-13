package cn.moozlee.registry;

import cn.moozlee.extension.SPI;

import java.net.InetSocketAddress;

@SPI
public interface ServiceRegistry {

    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);
}
