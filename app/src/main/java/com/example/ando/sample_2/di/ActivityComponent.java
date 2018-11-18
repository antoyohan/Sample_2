package com.example.ando.sample_2.di;

import com.example.ando.sample_2.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
