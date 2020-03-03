package com.houzhenguo.service;

import com.houzhenguo.protobuf.PhoneServiceGrpc;
import com.houzhenguo.protobuf.Phonebook;
import io.grpc.stub.StreamObserver;

public class PhonebookServiceImpl extends PhoneServiceGrpc.PhoneServiceImplBase {
    @Override
    public void addPhoneToUser(Phonebook.AddPhoneToUserRequest request, StreamObserver<Phonebook.AddPhoneToUserResponse> responseObserver) {
        Phonebook.AddPhoneToUserResponse response = null;
        if(request.getPhoneNumber().length() == 11 ){
            System.out.printf("uid = %s , phone type is %s, nubmer is %s\n", request.getUid(), request.getPhoneType(), request.getPhoneNumber());
            response = Phonebook.AddPhoneToUserResponse.newBuilder().setResult(true).build();
        }else{
            System.out.printf("The phone nubmer %s is wrong!\n",request.getPhoneNumber());
            response = Phonebook.AddPhoneToUserResponse.newBuilder().setResult(false).build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
