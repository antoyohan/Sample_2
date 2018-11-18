package com.example.ando.sample_2.di;

import android.content.Context;

import com.example.ando.sample_2.SampleApplication;
import com.example.ando.sample_2.SecondActivity;
import com.example.ando.sample_2.SecondActivityViewModel;
import com.example.ando.sample_2.models.Vehicle;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondActivityModule {

    SecondActivity context;

    public SecondActivityModule(SecondActivity context) {
        this.context = context;
    }

    @ActivityContext
    @Provides
   public Context activityContext(){
        return context;
    }

    @ActivityScope
    @Provides
    Vehicle getVehicle() {
        return new Vehicle();
    }

    @Provides
    SecondActivityViewModel svm(SampleApplication application, SecondActivity context){
        return new SecondActivityViewModel(application, context);
    }

    @Provides
    public SecondActivity getContext() {
        return context;
    }
}
