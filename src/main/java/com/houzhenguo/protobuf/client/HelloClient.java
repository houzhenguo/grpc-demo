package com.houzhenguo.protobuf.client;

import com.houzhenguo.protobuf.Hello;
import com.houzhenguo.protobuf.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

// rpc call
public class HelloClient {
    private final ManagedChannel channel;

    private final HelloServiceGrpc.HelloServiceBlockingStub blockingStub;

    public HelloClient (String host, int port) {
        ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forAddress(host,port).usePlaintext();
        channel = channelBuilder.build();
        blockingStub = HelloServiceGrpc.newBlockingStub(channel);
    }
    public void shutdown() throws InterruptedException{
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    public void sayHello(String name) {
        Hello.RequestMsg request = Hello.RequestMsg.newBuilder().setName(name).build();
        Hello.ResponseMsg response  ;
        try {
            response = blockingStub.hello(request);
            System.out.println(response.getRes());
        }catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
    public static void main(String ... args) throws Exception{
        HelloClient client = new HelloClient("localhost", 8888);
        try {
            client.sayHello("侯振国");
        }finally {
            client.shutdown();
        }
    }
}
