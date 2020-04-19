package com.lambda.unit1;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class TestVertex extends AbstractVerticle {
    private long startTime = System.currentTimeMillis();
    private long counter = 1;

    @Override
    public void start() {
        vertx.setPeriodic(2000, counter->{
            long runTime = (System.currentTimeMillis() - startTime / 1000);
            System.out.println("Server run tume : "+runTime+"seconds.");
        });

/*        vertx.createHttpServer()
                .requestHandler(req -> {
                    System.out.println("Request #" + counter++ +
                            " from "+ req.remoteAddress().host());
                    req.response().end("Hello from OtherSide");
                }).listen(8080);

        System.out.println("--------------------------");
        System.out.println("---> Server now listenint on 8080");
        System.out.println("--------------------------");
        }*/
    }

    @Override
    public void stop() {



    }
}