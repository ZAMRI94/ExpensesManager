package com.example.zzzyk.expensesmanager.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zzzyk.expensesmanager.R;

/**
 * Created by zzzyk on 10/14/2017.
 */

public class Register extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.register, container, false);
        return rootView;
    }
}

