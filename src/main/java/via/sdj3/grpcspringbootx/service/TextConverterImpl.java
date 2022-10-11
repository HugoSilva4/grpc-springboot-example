package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.protobuf.RequestText;
import via.sdj3.protobuf.ResponseText;
import via.sdj3.protobuf.TexConverterGrpc;
@GRpcService
public class TextConverterImpl extends TexConverterGrpc.TexConverterImplBase {

    @Override
    public void toUpper(RequestText request, StreamObserver<RequestText> responseObserver) {
        //super.toUpper(request, responseObserver);
        System.out.println("Receive Request => " + request.toString());
        ResponseText responseText = ResponseText.newBuilder()
                .setOutputText(request.getInputText().toUpperCase()).build();
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }

    @Override
    public void capitalizeFirstCharacter(RequestText request, StreamObserver<RequestText> responseObserver) {
        //super.capitalizeFirstCharacter(request, responseObserver);
        System.out.println("Received Request => " + request.toString());
        String res = Character.toUpperCase(request.getInputText().charAt(0))
                + request.getInputText().substring(1).toLowerCase();

        ResponseText responseText = ResponseText.newBuilder()
                .setOutputText(res).build();
    }
}
