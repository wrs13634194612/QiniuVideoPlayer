package com.znzb.partybuilding.netframe.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.znzb.partybuilding.R;


public class ZnzbFragment extends Fragment {

    public static ZnzbFragment newInstance(String info) {
        Bundle args = new Bundle();
        ZnzbFragment fragment = new ZnzbFragment();
        args.putString("info", info);
        fragment.setArguments(args);
        return fragment;
    }

    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_znzb, null);


        return view;
    }
}
