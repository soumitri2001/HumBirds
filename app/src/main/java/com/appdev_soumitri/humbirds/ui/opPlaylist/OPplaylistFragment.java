package com.appdev_soumitri.humbirds.ui.opPlaylist;

import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdev_soumitri.humbirds.R;

import java.util.Objects;

public class OPplaylistFragment extends Fragment {

    private OPplaylistViewModel mViewModel;

    public static OPplaylistFragment newInstance() {
        return new OPplaylistFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_op, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(OPplaylistViewModel.class);
        // TODO: Use the ViewModel

    }
}