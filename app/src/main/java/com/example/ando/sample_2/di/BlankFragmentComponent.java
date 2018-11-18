package com.example.ando.sample_2.di;

import com.example.ando.sample_2.BlankFragment;

import dagger.Component;

@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = BlankFragmentModule.class)
public interface BlankFragmentComponent {

    void inject(BlankFragment blankFragment);
}
