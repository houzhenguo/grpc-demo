package com.houzhenguo.service;

import com.houzhenguo.protobuf.Hello;
import com.houzhenguo.protobuf.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(Hello.RequestMsg request, StreamObserver<Hello.ResponseMsg> responseObserver) {
        Hello.ResponseMsg response = null;
        System.out.println("server recv" + request.getName());
        response = Hello.ResponseMsg.newBuilder().setRes("hello "+ request.getName()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
