package com.example.ando.sample_2;

import android.content.Context;

import com.example.ando.sample_2.di.ActivityContext;
import com.example.ando.sample_2.di.ApplicationContext;
import com.example.ando.sample_2.di.DaggerSecondActivityComponent;
import com.example.ando.sample_2.di.SecondActivityModule;
import com.example.ando.sample_2.models.Vehicle;
import com.example.ando.sample_2.utils.NetworkChecker;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import javax.inject.Inject;

public class SecondActivityViewModel {
    //Application context
    @Inject
    @ApplicationContext
    Context context;

    @ActivityContext
    @Inject
    Context activityContext;

    @Inject
    NetworkMonitor networkChecker;

    @Inject
    Gson gson;

    @Inject
    Vehicle vehicle;


    public SecondActivityViewModel(SampleApplication application, SecondActivity context) {
        DaggerSecondActivityComponent.builder().applicationComponent(application.getmApplicationComponent())
                .secondActivityModule(new SecondActivityModule(context)).build().inject(this);
    }
}
