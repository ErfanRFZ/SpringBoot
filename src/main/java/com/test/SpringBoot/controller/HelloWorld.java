package com.test.SpringBoot.controller;

import com.test.SpringBoot.model.Users;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HelloWorld {

    @GetMapping("/get")
    public String GetHelloWorld(){
        return "Hello World!";
    }

    @PostMapping("/get")
    public String SetHelloWorld(@RequestBody @Valid Users name){
        return "Hello " + name.toString() + "!";
    }

    @PutMapping("/get")
    public String PutHelloWorld(){
        return "Multiple change field Done!";
    }

    @PatchMapping("/get")
    public String PatchHelloWorld(){
        return "Change field Done!";
    }

    @DeleteMapping("/get")
    public String DelHelloWorld(){
        return "Del where id==id!";
    }
}
