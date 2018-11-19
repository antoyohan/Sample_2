package com.example.ando.sample_2;

import com.example.ando.sample_2.utils.NetworkMonitor;
import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivityViewModel {
    @Inject
    NetworkMonitor networkChecker;
    @Inject
    Gson gson;

    public MainActivityViewModel(SampleApplication application) {
        application.getmApplicationComponent().inject(this);
    }

}
