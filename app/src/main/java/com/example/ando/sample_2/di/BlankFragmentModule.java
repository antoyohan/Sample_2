package com.example.ando.sample_2.di;

import android.content.Context;

import com.example.ando.sample_2.BlankFragment;
import com.example.ando.sample_2.models.Employee;

import dagger.Module;
import dagger.Provides;

@Module
public class BlankFragmentModule {

    private final Context mContext;
    private BlankFragment blankFragment;

    public BlankFragmentModule(Context context, BlankFragment blankFragment) {
        mContext = context;
        this.blankFragment = blankFragment;
    }

    @Provides
    Context getOontext() {
        return mContext;
    }

    @Provides
    Employee getEmployee(BlankFragment fragment) {
        return fragment.getArguments().getParcelable("param1");
    }

    @Provides
    BlankFragment getFragment() {
        return blankFragment;
    }
}
