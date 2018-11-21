package com.example.ando.sample_2;

import android.app.Activity;
import android.app.Application;
import android.app.Service;

import com.example.ando.sample_2.di.ApplicationComponent;
import com.example.ando.sample_2.di.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasServiceInjector;

/**
 * Application for understanding Dagger2 Framework
 * */
public class SampleApplication extends Application implements HasActivityInjector {

    private ApplicationComponent mApplicationComponent;

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent.builder()
                .setApplication(this)
                .setAppContext(this)
                .create().inject(this);

    }

    public ApplicationComponent getmApplicationComponent() {
        return mApplicationComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

}
