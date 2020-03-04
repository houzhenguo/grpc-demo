package com.houzhenguo.server;

import com.houzhenguo.service.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class HelloServer {
    private Server server = null;
    private static final int PORT = 8888;

    private void start() throws IOException {
        server = ServerBuilder.forPort(PORT)
                .addService(new HelloServiceImpl())
                .build()
                .start();
        System.out.println("Server start , listen on " + PORT);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("***shutting down rpc server***");
                HelloServer.this.stop();
                System.out.println("shutting down finish");
            }
        });
    }

    // 关闭函数
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
     }
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    // server 开始
    public static void main(String[] args) throws Exception {
        HelloServer server = new HelloServer();
        server.start();
        server.blockUntilShutdown();
    }
}
