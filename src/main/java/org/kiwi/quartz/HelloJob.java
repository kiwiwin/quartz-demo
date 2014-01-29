package org.kiwi.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class HelloJob extends QuartzJobBean {
    private Hello hello;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        hello.sayHello();
    }

    @Required
    public void setHello(Hello hello) {
        this.hello = hello;
    }
}
