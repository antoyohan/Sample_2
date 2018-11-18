package com.example.ando.sample_2;

import android.app.Application;

import com.example.ando.sample_2.di.ApplicationComponent;
import com.example.ando.sample_2.di.ApplicationModule;
import com.example.ando.sample_2.di.DaggerApplicationComponent;

/**
 * Application for understanding Dagger2 Framework
 * */
public class SampleApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder().
                applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getmApplicationComponent() {
        return mApplicationComponent;
    }
}
