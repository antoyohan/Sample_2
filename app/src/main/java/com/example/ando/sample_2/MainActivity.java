package com.example.ando.sample_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ando.sample_2.di.ActivityModule;
import com.example.ando.sample_2.di.DaggerActivityComponent;
import com.example.ando.sample_2.models.Employee;
import com.example.ando.sample_2.models.Vehicle;

import javax.inject.Inject;

/**
 * Handles main screen
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Employee mEmployee;
    @Inject
    Vehicle mVehicle;
    @Inject
    MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder().
                applicationComponent(((SampleApplication) getApplication()).getmApplicationComponent()).
                activityModule(new ActivityModule(this)).build().inject(this);
        mainActivityViewModel.setApplication((SampleApplication) getApplication());
    }

}
