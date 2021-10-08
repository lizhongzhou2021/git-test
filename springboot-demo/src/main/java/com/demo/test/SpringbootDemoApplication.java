package com.demo.test;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class SpringbootDemoApplication {

    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
        System.out.println("springboot启动好了");
        while (true){
            Thread.sleep(10000);
        }
    }

    @GetMapping("/main/{name}")
    public String test(@PathVariable("name") String name){
        System.out.println("hello word "+ name);
        return "hello word " + name;
    }

}
