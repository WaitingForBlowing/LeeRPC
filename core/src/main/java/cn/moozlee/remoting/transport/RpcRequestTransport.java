package cn.moozlee.remoting.transport;

import cn.moozlee.extension.SPI;
import cn.moozlee.remoting.dto.RpcRequest;

@SPI
public interface RpcRequestTransport {
    Object sendRpcRequest(RpcRequest request);
}
