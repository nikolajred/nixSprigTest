package com.nix.test.nixSprigTest.cont;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelloWorldController {
    @Data
    public static class HelloWorldResponse{
        private String text = "XTHbfychn";
    }

 /*   @GetMapping
    public  HelloWorldResponse helloWorld() {
        return new HelloWorldResponse();
    }*/

}
