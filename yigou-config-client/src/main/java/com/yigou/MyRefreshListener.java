package com.yigou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.event.RefreshListener;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.stereotype.Component;

@Component
public class MyRefreshListener extends RefreshListener {

    @Autowired
    public MyRefreshListener(ContextRefresher contextRefresher) {
        super(contextRefresher);
    }

    @Override
    public void onApplicationEvent(RefreshRemoteApplicationEvent event) {
        //由于本来自带的RefreshListener，这里又调用了，super.on..()会执行两次
        super.onApplicationEvent(event);
        System.out.println("this is my refreshEvent listener!");
    }
}