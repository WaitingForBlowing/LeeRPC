package cn.moozlee.loadbalance;

import cn.moozlee.extension.SPI;
import cn.moozlee.remoting.dto.RpcRequest;

import java.util.List;

@SPI
public interface LoadBalance {

    String selectServiceAddress(List<String> serviceAddresses, RpcRequest rpcRequest);
}
