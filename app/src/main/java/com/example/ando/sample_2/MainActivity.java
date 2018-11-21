package com.example.ando.sample_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ando.sample_2.di.ActivityModule;
import com.example.ando.sample_2.models.Employee;
import com.example.ando.sample_2.models.Vehicle;
import com.example.ando.sample_2.utils.NetworkMonitor;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Handles main screen
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkMonitor networkMonitor;
    @Inject
    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
