package com.example.ando.sample_2.di;

import android.content.Context;

import com.example.ando.sample_2.MainActivity;
import com.example.ando.sample_2.MainActivityViewModel;
import com.example.ando.sample_2.models.Employee;
import com.example.ando.sample_2.models.Vehicle;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @ActivityScope
    @Provides
    Employee getEmployee() {
        return new Employee();
    }

    @ActivityScope
    @Provides
    Vehicle getVehicle() {
        return new Vehicle();
    }




    @ActivityScope
    @Provides
    MainActivity privideMainActivity(MainActivity mainActivity) {
        return mainActivity;
    }
}
