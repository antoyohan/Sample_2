package com.example.ando.sample_2.utils;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NetworkChecker implements NetworkMonitor {

    @Inject
    public NetworkChecker() {
    }

    @Override
    public boolean idNetworkConnected() {
        return true;
    }
}
