package com.example.ando.sample_2.di;

import com.example.ando.sample_2.SampleApplication;
import com.example.ando.sample_2.utils.NetworkChecker;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module(includes = ApplicationModule.Bindings.class)
public class ApplicationModule {

    @Provides
    public SampleApplication getApp(SampleApplication application) {
        return application;
    }

    @Singleton
    @Provides
    public Gson getGetGson() {
        return new Gson();
    }


    @Module
    public interface Bindings {
        @Binds
        NetworkMonitor bindToNetworkMonitor(NetworkChecker networkChecker);
    }
}
