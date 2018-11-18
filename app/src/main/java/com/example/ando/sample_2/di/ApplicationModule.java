package com.example.ando.sample_2.di;

import android.content.Context;

import com.example.ando.sample_2.SampleApplication;
import com.example.ando.sample_2.utils.NetworkChecker;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private SampleApplication mContext;

    public ApplicationModule(SampleApplication context) {
        mContext = context;
    }

    @Provides
    public SampleApplication getApp() {
        return mContext;
    }

    @Singleton
    @Provides
    public static NetworkMonitor getNetworkMonitor() {
        return new NetworkChecker();
    }

    @Singleton
    @Provides
    public Gson getGetGson() {
        return new Gson();
    }

    @Singleton
    @Provides
    @ApplicationContext
    Context getAppplicationContext() {
        return mContext;
    }
}
