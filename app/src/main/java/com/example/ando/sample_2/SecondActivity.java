package com.example.ando.sample_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ando.sample_2.di.DaggerSecondActivityComponent;
import com.example.ando.sample_2.di.SecondActivityModule;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    SecondActivityViewModel secondActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DaggerSecondActivityComponent.builder()
                .secondActivityModule(new SecondActivityModule(this))
                .applicationComponent(((SampleApplication) getApplication()).getmApplicationComponent())
                .build()
                .inject(this);
    }
}
