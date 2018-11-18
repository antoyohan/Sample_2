package com.example.ando.sample_2.di;

import android.content.Context;

import com.example.ando.sample_2.MainActivity;
import com.example.ando.sample_2.MainActivityViewModel;
import com.example.ando.sample_2.SampleApplication;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context appContext();

    SampleApplication getApp();

    NetworkMonitor networkMonitor();

    Gson gson();

    void inject(MainActivityViewModel mainActivityViewModel);
}
