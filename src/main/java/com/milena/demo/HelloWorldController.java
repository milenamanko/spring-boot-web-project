package com.milena.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public HelloWorld hello (){
        return new HelloWorld("world");
    }
@Getter
@Setter
    @AllArgsConstructor
    private class HelloWorld {
        String hello;
    }

}
