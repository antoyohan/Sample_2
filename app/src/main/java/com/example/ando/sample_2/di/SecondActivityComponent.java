package com.example.ando.sample_2.di;

import com.example.ando.sample_2.SecondActivity;
import com.example.ando.sample_2.SecondActivityViewModel;

import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = SecondActivityModule.class)
public interface SecondActivityComponent {
    void inject(SecondActivityViewModel secondActivityViewModel);

    void inject(SecondActivity secondActivity);
}
