package com.example.ando.sample_2;

import android.content.Context;

import com.example.ando.sample_2.di.ActivityScope;
import com.example.ando.sample_2.utils.NetworkChecker;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

@ActivityScope
public class MainActivityViewModel {
    NetworkMonitor networkChecker;
    Gson gson;
    private Context context;


    @Inject
    public MainActivityViewModel(Gson context) {

    }
}
