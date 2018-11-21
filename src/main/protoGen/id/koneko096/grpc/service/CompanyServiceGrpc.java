package id.koneko096.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: company.proto")
public final class CompanyServiceGrpc {

  private CompanyServiceGrpc() {}

  public static final String SERVICE_NAME = "id.koneko096.grpc.service.CompanyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.GetEmployeeRequest,
      id.koneko096.grpc.service.Company.EmployeeStatus> getGetEmployeeStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployeeStatus",
      requestType = id.koneko096.grpc.service.Company.GetEmployeeRequest.class,
      responseType = id.koneko096.grpc.service.Company.EmployeeStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.GetEmployeeRequest,
      id.koneko096.grpc.service.Company.EmployeeStatus> getGetEmployeeStatusMethod() {
    io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.GetEmployeeRequest, id.koneko096.grpc.service.Company.EmployeeStatus> getGetEmployeeStatusMethod;
    if ((getGetEmployeeStatusMethod = CompanyServiceGrpc.getGetEmployeeStatusMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetEmployeeStatusMethod = CompanyServiceGrpc.getGetEmployeeStatusMethod) == null) {
          CompanyServiceGrpc.getGetEmployeeStatusMethod = getGetEmployeeStatusMethod = 
              io.grpc.MethodDescriptor.<id.koneko096.grpc.service.Company.GetEmployeeRequest, id.koneko096.grpc.service.Company.EmployeeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "id.koneko096.grpc.service.CompanyService", "GetEmployeeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.GetEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.EmployeeStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("GetEmployeeStatus"))
                  .build();
          }
        }
     }
     return getGetEmployeeStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.RegisterEmployeeRequest,
      id.koneko096.grpc.service.Company.EmployeeStatus> getRegisterEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterEmployee",
      requestType = id.koneko096.grpc.service.Company.RegisterEmployeeRequest.class,
      responseType = id.koneko096.grpc.service.Company.EmployeeStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.RegisterEmployeeRequest,
      id.koneko096.grpc.service.Company.EmployeeStatus> getRegisterEmployeeMethod() {
    io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.RegisterEmployeeRequest, id.koneko096.grpc.service.Company.EmployeeStatus> getRegisterEmployeeMethod;
    if ((getRegisterEmployeeMethod = CompanyServiceGrpc.getRegisterEmployeeMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getRegisterEmployeeMethod = CompanyServiceGrpc.getRegisterEmployeeMethod) == null) {
          CompanyServiceGrpc.getRegisterEmployeeMethod = getRegisterEmployeeMethod = 
              io.grpc.MethodDescriptor.<id.koneko096.grpc.service.Company.RegisterEmployeeRequest, id.koneko096.grpc.service.Company.EmployeeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "id.koneko096.grpc.service.CompanyService", "RegisterEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.RegisterEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.EmployeeStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("RegisterEmployee"))
                  .build();
          }
        }
     }
     return getRegisterEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.MutateEmployeeRequest,
      id.koneko096.grpc.service.Company.EmployeeStatus> getMutateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateEmployee",
      requestType = id.koneko096.grpc.service.Company.MutateEmployeeRequest.class,
      responseType = id.koneko096.grpc.service.Company.EmployeeStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.MutateEmployeeRequest,
      id.koneko096.grpc.service.Company.EmployeeStatus> getMutateEmployeeMethod() {
    io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.MutateEmployeeRequest, id.koneko096.grpc.service.Company.EmployeeStatus> getMutateEmployeeMethod;
    if ((getMutateEmployeeMethod = CompanyServiceGrpc.getMutateEmployeeMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getMutateEmployeeMethod = CompanyServiceGrpc.getMutateEmployeeMethod) == null) {
          CompanyServiceGrpc.getMutateEmployeeMethod = getMutateEmployeeMethod = 
              io.grpc.MethodDescriptor.<id.koneko096.grpc.service.Company.MutateEmployeeRequest, id.koneko096.grpc.service.Company.EmployeeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "id.koneko096.grpc.service.CompanyService", "MutateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.MutateEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.EmployeeStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("MutateEmployee"))
                  .build();
          }
        }
     }
     return getMutateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.FireEmployeeRequest,
      id.koneko096.grpc.service.Company.Empty> getFireEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FireEmployee",
      requestType = id.koneko096.grpc.service.Company.FireEmployeeRequest.class,
      responseType = id.koneko096.grpc.service.Company.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.FireEmployeeRequest,
      id.koneko096.grpc.service.Company.Empty> getFireEmployeeMethod() {
    io.grpc.MethodDescriptor<id.koneko096.grpc.service.Company.FireEmployeeRequest, id.koneko096.grpc.service.Company.Empty> getFireEmployeeMethod;
    if ((getFireEmployeeMethod = CompanyServiceGrpc.getFireEmployeeMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getFireEmployeeMethod = CompanyServiceGrpc.getFireEmployeeMethod) == null) {
          CompanyServiceGrpc.getFireEmployeeMethod = getFireEmployeeMethod = 
              io.grpc.MethodDescriptor.<id.koneko096.grpc.service.Company.FireEmployeeRequest, id.koneko096.grpc.service.Company.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "id.koneko096.grpc.service.CompanyService", "FireEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.FireEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  id.koneko096.grpc.service.Company.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("FireEmployee"))
                  .build();
          }
        }
     }
     return getFireEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompanyServiceStub newStub(io.grpc.Channel channel) {
    return new CompanyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompanyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompanyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompanyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CompanyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployeeStatus(id.koneko096.grpc.service.Company.GetEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmployeeStatusMethod(), responseObserver);
    }

    /**
     */
    public void registerEmployee(id.koneko096.grpc.service.Company.RegisterEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void mutateEmployee(id.koneko096.grpc.service.Company.MutateEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void fireEmployee(id.koneko096.grpc.service.Company.FireEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getFireEmployeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                id.koneko096.grpc.service.Company.GetEmployeeRequest,
                id.koneko096.grpc.service.Company.EmployeeStatus>(
                  this, METHODID_GET_EMPLOYEE_STATUS)))
          .addMethod(
            getRegisterEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                id.koneko096.grpc.service.Company.RegisterEmployeeRequest,
                id.koneko096.grpc.service.Company.EmployeeStatus>(
                  this, METHODID_REGISTER_EMPLOYEE)))
          .addMethod(
            getMutateEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                id.koneko096.grpc.service.Company.MutateEmployeeRequest,
                id.koneko096.grpc.service.Company.EmployeeStatus>(
                  this, METHODID_MUTATE_EMPLOYEE)))
          .addMethod(
            getFireEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                id.koneko096.grpc.service.Company.FireEmployeeRequest,
                id.koneko096.grpc.service.Company.Empty>(
                  this, METHODID_FIRE_EMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class CompanyServiceStub extends io.grpc.stub.AbstractStub<CompanyServiceStub> {
    private CompanyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployeeStatus(id.koneko096.grpc.service.Company.GetEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmployeeStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerEmployee(id.koneko096.grpc.service.Company.RegisterEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mutateEmployee(id.koneko096.grpc.service.Company.MutateEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fireEmployee(id.koneko096.grpc.service.Company.FireEmployeeRequest request,
        io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFireEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompanyServiceBlockingStub extends io.grpc.stub.AbstractStub<CompanyServiceBlockingStub> {
    private CompanyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public id.koneko096.grpc.service.Company.EmployeeStatus getEmployeeStatus(id.koneko096.grpc.service.Company.GetEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEmployeeStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public id.koneko096.grpc.service.Company.EmployeeStatus registerEmployee(id.koneko096.grpc.service.Company.RegisterEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public id.koneko096.grpc.service.Company.EmployeeStatus mutateEmployee(id.koneko096.grpc.service.Company.MutateEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public id.koneko096.grpc.service.Company.Empty fireEmployee(id.koneko096.grpc.service.Company.FireEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getFireEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompanyServiceFutureStub extends io.grpc.stub.AbstractStub<CompanyServiceFutureStub> {
    private CompanyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<id.koneko096.grpc.service.Company.EmployeeStatus> getEmployeeStatus(
        id.koneko096.grpc.service.Company.GetEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmployeeStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<id.koneko096.grpc.service.Company.EmployeeStatus> registerEmployee(
        id.koneko096.grpc.service.Company.RegisterEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<id.koneko096.grpc.service.Company.EmployeeStatus> mutateEmployee(
        id.koneko096.grpc.service.Company.MutateEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<id.koneko096.grpc.service.Company.Empty> fireEmployee(
        id.koneko096.grpc.service.Company.FireEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFireEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_STATUS = 0;
  private static final int METHODID_REGISTER_EMPLOYEE = 1;
  private static final int METHODID_MUTATE_EMPLOYEE = 2;
  private static final int METHODID_FIRE_EMPLOYEE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompanyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompanyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_STATUS:
          serviceImpl.getEmployeeStatus((id.koneko096.grpc.service.Company.GetEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus>) responseObserver);
          break;
        case METHODID_REGISTER_EMPLOYEE:
          serviceImpl.registerEmployee((id.koneko096.grpc.service.Company.RegisterEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus>) responseObserver);
          break;
        case METHODID_MUTATE_EMPLOYEE:
          serviceImpl.mutateEmployee((id.koneko096.grpc.service.Company.MutateEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.EmployeeStatus>) responseObserver);
          break;
        case METHODID_FIRE_EMPLOYEE:
          serviceImpl.fireEmployee((id.koneko096.grpc.service.Company.FireEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<id.koneko096.grpc.service.Company.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return id.koneko096.grpc.service.Company.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyService");
    }
  }

  private static final class CompanyServiceFileDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier {
    CompanyServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyServiceMethodDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompanyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompanyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompanyServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeStatusMethod())
              .addMethod(getRegisterEmployeeMethod())
              .addMethod(getMutateEmployeeMethod())
              .addMethod(getFireEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
