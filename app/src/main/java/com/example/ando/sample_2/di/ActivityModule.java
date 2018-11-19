package com.example.ando.sample_2.di;

import com.example.ando.sample_2.MainActivity;
import com.example.ando.sample_2.MainActivityViewModel;
import com.example.ando.sample_2.SampleApplication;
import com.example.ando.sample_2.models.Employee;
import com.example.ando.sample_2.models.Vehicle;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    MainActivity mainActivity;

    public ActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

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
    MainActivityViewModel getViewModel(SampleApplication application) {
        return new MainActivityViewModel(application);
    }

    @ActivityScope
    @Provides
    MainActivity privideMainActivity(){
        return mainActivity;
    }
}
