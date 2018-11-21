package com.example.ando.sample_2.di;

import android.content.Context;

import com.example.ando.sample_2.SampleApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class,ActivityBuilder.class})
public interface ApplicationComponent {

    void inject(SampleApplication application);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder setApplication(SampleApplication application);
        @BindsInstance
        Builder setAppContext(Context appContext);

        ApplicationComponent create();
    }


}
