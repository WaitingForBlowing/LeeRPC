package cn.moozlee.loadbalance.impl;

import cn.moozlee.loadbalance.AbstractLoadBalance;
import cn.moozlee.remoting.dto.RpcRequest;

import java.util.List;
import java.util.Random;

public class RandomLoadBalance extends AbstractLoadBalance {
    @Override
    protected String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest) {
        Random random = new Random();
        String result = serviceAddresses.get(random.nextInt(serviceAddresses.size()));
        random = null;
        return result;
    }
}
