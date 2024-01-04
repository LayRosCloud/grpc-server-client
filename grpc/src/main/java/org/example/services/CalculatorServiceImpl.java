package org.example.services;

import com.proto.calc.CalcService;
import com.proto.calc.CalculatorGrpc;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorGrpc.CalculatorImplBase {
    @Override
    public void multiply(CalcService.NumberRequest numberRequest,
                         StreamObserver<CalcService.ResultResponse> responseObserver){
        int result = numberRequest.getFirstNumber() * numberRequest.getSecondNumber();
        CalcService.ResultResponse response = CalcService.ResultResponse
                .newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void fold(CalcService.NumberRequest numberRequest,
                     StreamObserver<CalcService.ResultResponse> responseObserver){
        int result = numberRequest.getFirstNumber() + numberRequest.getSecondNumber();
        CalcService.ResultResponse response = CalcService.ResultResponse
                .newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void divide(CalcService.NumberRequest numberRequest,
                       StreamObserver<CalcService.ResultResponse> responseObserver) {
        int result = numberRequest.getFirstNumber() / numberRequest.getSecondNumber();
        CalcService.ResultResponse response = CalcService.ResultResponse
                .newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void subtract(CalcService.NumberRequest numberRequest,
                         StreamObserver<CalcService.ResultResponse> responseObserver) {
        int result = numberRequest.getFirstNumber() - numberRequest.getSecondNumber();
        CalcService.ResultResponse response = CalcService.ResultResponse
                .newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
