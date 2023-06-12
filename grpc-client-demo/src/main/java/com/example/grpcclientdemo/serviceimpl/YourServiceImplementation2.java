//package com.example.grpcclientdemo.serviceimpl;
//
//import com.stubs.YourRequest;
//import com.stubs.YourResponse;
//import com.stubs.YourServiceGrpc;
//import io.grpc.stub.StreamObserver;
//
//public class YourServiceImplementation2 extends YourServiceGrpc.YourServiceImplBase {
//    @Override
//    public void yourMethod(YourRequest request, StreamObserver<YourResponse> responseObserver) {
//        // Server logic to process the request and generate a response
//        String responseMessage = "Response from 2021 server: " + request.getMessage();
//        YourResponse response = YourResponse.newBuilder()
//                .setResponseMessage(responseMessage)
//                .build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//
//}
