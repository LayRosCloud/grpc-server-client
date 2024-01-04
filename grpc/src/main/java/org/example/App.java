package org.example;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.services.CalculatorServiceImpl;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException, InterruptedException {
        final int port = 5000;

        Server server = ServerBuilder
                .forPort(port)
                .addService(new CalculatorServiceImpl())
                .build();

        server.start();

        System.out.printf("server started on port %d", port);

        server.awaitTermination();
    }
}
