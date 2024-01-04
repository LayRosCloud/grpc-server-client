package org.example.server;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;

public class ServerHelper {
    private final String domain = "localhost";
    private final int port = 5000;
    private final ManagedChannel channel;

    public ServerHelper(){
        channel = ManagedChannelBuilder
                .forTarget(String.format("%s:%d", domain, port))
                .usePlaintext()
                .build();
    }

    public int getPort() {
        return port;
    }

    public String getDomain(){
        return  domain;
    }

    public ManagedChannel getChannel(){
        return  channel;
    }
}
