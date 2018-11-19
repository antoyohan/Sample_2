package com.example.ando.sample_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.ando.sample_2.di.ActivityModule;
import com.example.ando.sample_2.models.Employee;
import com.example.ando.sample_2.models.Vehicle;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

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

    @Inject
    Gson gson;

    @Inject
    NetworkMonitor networkMonitor;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SampleApplication) this.getApplication()).getmApplicationComponent()
                .plus(new ActivityModule(this))
                .inject(this);

        Log.d(TAG, "onCreate: ");

    }

}
