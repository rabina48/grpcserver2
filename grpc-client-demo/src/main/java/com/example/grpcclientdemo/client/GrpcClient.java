package com.example.grpcclientdemo.client;

import com.stubs.YourRequest;
import com.stubs.YourResponse;
import com.stubs.YourServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        // Create a gRPC channel

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 2020)
                .usePlaintext()
                .build();

        // Generate the client stub
        YourServiceGrpc.YourServiceBlockingStub client = YourServiceGrpc.newBlockingStub(channel);

        // Invoke the gRPC API
        YourRequest request = YourRequest.newBuilder()
                .setMessage("true")
                .build();
        YourResponse response = client.yourMethod(request);


        // Handle the response
        System.out.println("Response from 2020 gRPC server: " + response.getResponseMessage());


            long project3ResponseTime = System.nanoTime() - startTime;
            System.out.println("This is total time = " + project3ResponseTime);

        // Shut down the channel
//        channel.shutdown();
    }
}

