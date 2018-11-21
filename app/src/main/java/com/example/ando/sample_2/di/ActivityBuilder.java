package com.example.ando.sample_2.di;

import android.app.Activity;

import com.example.ando.sample_2.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class ActivityBuilder {

   /* @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(ActivityComponent.bu)
*/

   @ContributesAndroidInjector(modules = {ActivityModule.class})
   @ActivityScope
    abstract MainActivity bindMainActivity();
}
