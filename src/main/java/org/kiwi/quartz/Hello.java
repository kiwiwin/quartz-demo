package org.kiwi.quartz;

import java.util.Date;

public class Hello {
    public void sayHello() {
        System.out.println("Hello, current time is: " + new Date(System.currentTimeMillis()));
    }
}
