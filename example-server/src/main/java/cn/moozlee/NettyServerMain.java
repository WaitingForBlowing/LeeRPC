package cn.moozlee;

import cn.moozlee.annotation.RpcScan;
import cn.moozlee.config.RpcServiceConfig;
import cn.moozlee.remoting.transport.netty.server.NettyRpcServer;
import cn.moozlee.serviceimpl.HelloServiceImpl2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RpcScan(basePackage = {"cn.moozlee"})
public class NettyServerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NettyServerMain.class);
        NettyRpcServer nettyPrpServer = (NettyRpcServer) applicationContext.getBean("nettyRpcServer");
        //手动注入
        HelloService helloService2 = new HelloServiceImpl2();
        RpcServiceConfig rpcServiceConfig = RpcServiceConfig.builder()
                .group("test2")
                .version("version2")
                .service(helloService2)
                .build();
        nettyPrpServer.registerService(rpcServiceConfig);
        nettyPrpServer.start();
    }
}
