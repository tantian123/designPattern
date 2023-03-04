package com.demo.tt.behavioral.observer.more;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("event")
public class Context {
    @Autowired
    private  ApplicationContext applicationContext;

    @GetMapping("test")
    public void test(){
        applicationContext.publishEvent(new MyEvent(new Object()));
    }
}
