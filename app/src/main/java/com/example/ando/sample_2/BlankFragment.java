package com.example.ando.sample_2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ando.sample_2.di.BlankFragmentModule;
import com.example.ando.sample_2.di.DaggerBlankFragmentComponent;
import com.example.ando.sample_2.models.Employee;
import com.example.ando.sample_2.utils.NetworkMonitor;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    @Inject
    NetworkMonitor mNetworkChecker;
    @Inject
    Context mActivityContext;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    @Inject
    Employee mParam1;
    private String mParam2;

    public BlankFragment() {
    }

    public static BlankFragment newInstance(Employee param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerBlankFragmentComponent.builder().
                applicationComponent(((SampleApplication) getActivity().getApplication()).getmApplicationComponent())
                .blankFragmentModule(new BlankFragmentModule(getContext(), this)).build().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
