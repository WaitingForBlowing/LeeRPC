package cn.moozlee.registry;

import cn.moozlee.extension.SPI;
import cn.moozlee.remoting.dto.RpcRequest;

import java.net.InetSocketAddress;

@SPI
public interface ServiceDiscovery {

    InetSocketAddress lookupService(RpcRequest rpcRequest);
}
