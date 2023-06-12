//package com.example.grpcclientdemo.server;
//
//import com.example.grpcclientdemo.serviceimpl.YourServiceImplementation2;
//import io.grpc.Server;
//import io.grpc.ServerBuilder;
//
//import java.io.IOException;
//
//public class Server2 {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        Server server = ServerBuilder.forPort(2021)
//                .addService(new YourServiceImplementation2())
//                .build();
//
//        server.start();
//        System.out.println("gRPC server started on port 2021");
//
//        server.awaitTermination();
//    }
//}
