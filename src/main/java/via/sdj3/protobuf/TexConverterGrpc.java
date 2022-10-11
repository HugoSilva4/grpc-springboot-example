package via.sdj3.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: TextConverter.proto")
public final class TexConverterGrpc {

  private TexConverterGrpc() {}

  public static final String SERVICE_NAME = "TexConverter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.protobuf.RequestText,
      via.sdj3.protobuf.RequestText> getToUpperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToUpper",
      requestType = via.sdj3.protobuf.RequestText.class,
      responseType = via.sdj3.protobuf.RequestText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.protobuf.RequestText,
      via.sdj3.protobuf.RequestText> getToUpperMethod() {
    io.grpc.MethodDescriptor<via.sdj3.protobuf.RequestText, via.sdj3.protobuf.RequestText> getToUpperMethod;
    if ((getToUpperMethod = TexConverterGrpc.getToUpperMethod) == null) {
      synchronized (TexConverterGrpc.class) {
        if ((getToUpperMethod = TexConverterGrpc.getToUpperMethod) == null) {
          TexConverterGrpc.getToUpperMethod = getToUpperMethod =
              io.grpc.MethodDescriptor.<via.sdj3.protobuf.RequestText, via.sdj3.protobuf.RequestText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToUpper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.protobuf.RequestText.getDefaultInstance()))
              .setSchemaDescriptor(new TexConverterMethodDescriptorSupplier("ToUpper"))
              .build();
        }
      }
    }
    return getToUpperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.protobuf.RequestText,
      via.sdj3.protobuf.RequestText> getCapitalizeFirstCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "capitalizeFirstCharacter",
      requestType = via.sdj3.protobuf.RequestText.class,
      responseType = via.sdj3.protobuf.RequestText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.protobuf.RequestText,
      via.sdj3.protobuf.RequestText> getCapitalizeFirstCharacterMethod() {
    io.grpc.MethodDescriptor<via.sdj3.protobuf.RequestText, via.sdj3.protobuf.RequestText> getCapitalizeFirstCharacterMethod;
    if ((getCapitalizeFirstCharacterMethod = TexConverterGrpc.getCapitalizeFirstCharacterMethod) == null) {
      synchronized (TexConverterGrpc.class) {
        if ((getCapitalizeFirstCharacterMethod = TexConverterGrpc.getCapitalizeFirstCharacterMethod) == null) {
          TexConverterGrpc.getCapitalizeFirstCharacterMethod = getCapitalizeFirstCharacterMethod =
              io.grpc.MethodDescriptor.<via.sdj3.protobuf.RequestText, via.sdj3.protobuf.RequestText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "capitalizeFirstCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.protobuf.RequestText.getDefaultInstance()))
              .setSchemaDescriptor(new TexConverterMethodDescriptorSupplier("capitalizeFirstCharacter"))
              .build();
        }
      }
    }
    return getCapitalizeFirstCharacterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TexConverterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TexConverterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TexConverterStub>() {
        @java.lang.Override
        public TexConverterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TexConverterStub(channel, callOptions);
        }
      };
    return TexConverterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TexConverterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TexConverterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TexConverterBlockingStub>() {
        @java.lang.Override
        public TexConverterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TexConverterBlockingStub(channel, callOptions);
        }
      };
    return TexConverterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TexConverterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TexConverterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TexConverterFutureStub>() {
        @java.lang.Override
        public TexConverterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TexConverterFutureStub(channel, callOptions);
        }
      };
    return TexConverterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Service definition
   * </pre>
   */
  public static abstract class TexConverterImplBase implements io.grpc.BindableService {

    /**
     */
    public void toUpper(via.sdj3.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.protobuf.RequestText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToUpperMethod(), responseObserver);
    }

    /**
     */
    public void capitalizeFirstCharacter(via.sdj3.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.protobuf.RequestText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCapitalizeFirstCharacterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getToUpperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.protobuf.RequestText,
                via.sdj3.protobuf.RequestText>(
                  this, METHODID_TO_UPPER)))
          .addMethod(
            getCapitalizeFirstCharacterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.protobuf.RequestText,
                via.sdj3.protobuf.RequestText>(
                  this, METHODID_CAPITALIZE_FIRST_CHARACTER)))
          .build();
    }
  }

  /**
   * <pre>
   *Service definition
   * </pre>
   */
  public static final class TexConverterStub extends io.grpc.stub.AbstractAsyncStub<TexConverterStub> {
    private TexConverterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TexConverterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TexConverterStub(channel, callOptions);
    }

    /**
     */
    public void toUpper(via.sdj3.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.protobuf.RequestText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToUpperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void capitalizeFirstCharacter(via.sdj3.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.protobuf.RequestText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCapitalizeFirstCharacterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service definition
   * </pre>
   */
  public static final class TexConverterBlockingStub extends io.grpc.stub.AbstractBlockingStub<TexConverterBlockingStub> {
    private TexConverterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TexConverterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TexConverterBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.protobuf.RequestText toUpper(via.sdj3.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToUpperMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.protobuf.RequestText capitalizeFirstCharacter(via.sdj3.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCapitalizeFirstCharacterMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service definition
   * </pre>
   */
  public static final class TexConverterFutureStub extends io.grpc.stub.AbstractFutureStub<TexConverterFutureStub> {
    private TexConverterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TexConverterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TexConverterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.protobuf.RequestText> toUpper(
        via.sdj3.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToUpperMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.protobuf.RequestText> capitalizeFirstCharacter(
        via.sdj3.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCapitalizeFirstCharacterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TO_UPPER = 0;
  private static final int METHODID_CAPITALIZE_FIRST_CHARACTER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TexConverterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TexConverterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TO_UPPER:
          serviceImpl.toUpper((via.sdj3.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.protobuf.RequestText>) responseObserver);
          break;
        case METHODID_CAPITALIZE_FIRST_CHARACTER:
          serviceImpl.capitalizeFirstCharacter((via.sdj3.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.protobuf.RequestText>) responseObserver);
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

  private static abstract class TexConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TexConverterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.protobuf.TextConverter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TexConverter");
    }
  }

  private static final class TexConverterFileDescriptorSupplier
      extends TexConverterBaseDescriptorSupplier {
    TexConverterFileDescriptorSupplier() {}
  }

  private static final class TexConverterMethodDescriptorSupplier
      extends TexConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TexConverterMethodDescriptorSupplier(String methodName) {
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
      synchronized (TexConverterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TexConverterFileDescriptorSupplier())
              .addMethod(getToUpperMethod())
              .addMethod(getCapitalizeFirstCharacterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
