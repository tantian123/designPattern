package com.demo.tt.behavioral.observer.more;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerOne implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("i get this event");
    }
}
