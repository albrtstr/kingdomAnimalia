package com.example.kingdomanimalia;

import android.app.Application;
import android.content.Intent;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

public class CheckLifeCycle extends Application implements LifecycleObserver {

    @Override
    public void onCreate()
    {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        startService(new Intent(this, MyService.class));
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppBackground()
    {
        stopService(new Intent(this, MyService.class));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        startService(new Intent(this, MyService.class));
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        startService(new Intent(this, MyService.class));
    }

}
