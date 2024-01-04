package org.example.services;

import com.proto.calc.CalcService;
import com.proto.calc.CalculatorGrpc;
import io.grpc.ManagedChannel;
import org.example.server.ServerHelper;

public class CalculatorService {

    //Логика полностью находится на сервере, тут просто вызываются эти методы
    public int fold(int a, int b){
        ServerHelper helper = new ServerHelper();
        ManagedChannel channel = helper.getChannel();
        CalculatorGrpc.CalculatorBlockingStub stub
                = CalculatorGrpc.newBlockingStub(channel);

        CalcService.NumberRequest request = CalcService.NumberRequest.newBuilder()
                .setFirstNumber(a)
                .setSecondNumber(b)
                .build();

        CalcService.ResultResponse response = stub.fold(request);
        channel.shutdownNow();
        return response.getResult();
    }

    public int multiply(int a, int b){
        ServerHelper helper = new ServerHelper();
        ManagedChannel channel = helper.getChannel();

        CalculatorGrpc.CalculatorBlockingStub stub
                = CalculatorGrpc.newBlockingStub(channel);

        CalcService.NumberRequest request = CalcService.NumberRequest.newBuilder()
                .setFirstNumber(a)
                .setSecondNumber(b)
                .build();

        CalcService.ResultResponse response = stub.multiply(request);
        channel.shutdownNow();
        return response.getResult();
    }

    public int divide(int a, int b){
        ServerHelper helper = new ServerHelper();
        ManagedChannel channel = helper.getChannel();

        CalculatorGrpc.CalculatorBlockingStub stub
                = CalculatorGrpc.newBlockingStub(channel);

        CalcService.NumberRequest request = CalcService.NumberRequest.newBuilder()
                .setFirstNumber(a)
                .setSecondNumber(b)
                .build();

        CalcService.ResultResponse response = stub.divide(request);
        channel.shutdownNow();
        return response.getResult();
    }

    public int subtract(int a, int b){
        ServerHelper helper = new ServerHelper();
        ManagedChannel channel = helper.getChannel();

        CalculatorGrpc.CalculatorBlockingStub stub
                = CalculatorGrpc.newBlockingStub(channel);

        CalcService.NumberRequest request = CalcService.NumberRequest.newBuilder()
                .setFirstNumber(a)
                .setSecondNumber(b)
                .build();

        CalcService.ResultResponse response = stub.subtract(request);
        channel.shutdownNow();
        return response.getResult();
    }
}
