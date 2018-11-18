package com.example.ando.sample_2;

import android.content.Context;

import com.example.ando.sample_2.utils.NetworkChecker;
import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivityViewModel {
    @Inject
    NetworkMonitor networkChecker;
    @Inject
    Gson gson;
    private SampleApplication mApplication;

    public MainActivityViewModel(Context context) {
        mApplication.getmApplicationComponent().inject(this);
    }

    public void setApplication(SampleApplication application) {
        mApplication = application;
    }
}
