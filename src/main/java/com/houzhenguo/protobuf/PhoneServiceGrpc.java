package com.houzhenguo.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
//@javax.annotation.Generated(
//    value = "by gRPC proto compiler (version 1.27.2)",
//    comments = "Source: phonebook.proto")
public final class PhoneServiceGrpc {

  private PhoneServiceGrpc() {}

  public static final String SERVICE_NAME = "PhoneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest,
      com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse> getAddPhoneToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPhoneToUser",
      requestType = com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest.class,
      responseType = com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest,
      com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse> getAddPhoneToUserMethod() {
    io.grpc.MethodDescriptor<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest, com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse> getAddPhoneToUserMethod;
    if ((getAddPhoneToUserMethod = PhoneServiceGrpc.getAddPhoneToUserMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getAddPhoneToUserMethod = PhoneServiceGrpc.getAddPhoneToUserMethod) == null) {
          PhoneServiceGrpc.getAddPhoneToUserMethod = getAddPhoneToUserMethod =
              io.grpc.MethodDescriptor.<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest, com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addPhoneToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("addPhoneToUser"))
              .build();
        }
      }
    }
    return getAddPhoneToUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PhoneServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneServiceStub>() {
        @Override
        public PhoneServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneServiceStub(channel, callOptions);
        }
      };
    return PhoneServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PhoneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneServiceBlockingStub>() {
        @Override
        public PhoneServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneServiceBlockingStub(channel, callOptions);
        }
      };
    return PhoneServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PhoneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneServiceFutureStub>() {
        @Override
        public PhoneServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneServiceFutureStub(channel, callOptions);
        }
      };
    return PhoneServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PhoneServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addPhoneToUser(com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest request,
        io.grpc.stub.StreamObserver<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPhoneToUserMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddPhoneToUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest,
                com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse>(
                  this, METHODID_ADD_PHONE_TO_USER)))
          .build();
    }
  }

  /**
   */
  public static final class PhoneServiceStub extends io.grpc.stub.AbstractAsyncStub<PhoneServiceStub> {
    private PhoneServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PhoneServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneServiceStub(channel, callOptions);
    }

    /**
     */
    public void addPhoneToUser(com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest request,
        io.grpc.stub.StreamObserver<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPhoneToUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PhoneServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PhoneServiceBlockingStub> {
    private PhoneServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PhoneServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse addPhoneToUser(com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPhoneToUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PhoneServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PhoneServiceFutureStub> {
    private PhoneServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PhoneServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse> addPhoneToUser(
        com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPhoneToUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PHONE_TO_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PhoneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PhoneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PHONE_TO_USER:
          serviceImpl.addPhoneToUser((com.houzhenguo.protobuf.Phonebook.AddPhoneToUserRequest) request,
              (io.grpc.stub.StreamObserver<com.houzhenguo.protobuf.Phonebook.AddPhoneToUserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PhoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PhoneServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.houzhenguo.protobuf.Phonebook.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PhoneService");
    }
  }

  private static final class PhoneServiceFileDescriptorSupplier
      extends PhoneServiceBaseDescriptorSupplier {
    PhoneServiceFileDescriptorSupplier() {}
  }

  private static final class PhoneServiceMethodDescriptorSupplier
      extends PhoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PhoneServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PhoneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PhoneServiceFileDescriptorSupplier())
              .addMethod(getAddPhoneToUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
