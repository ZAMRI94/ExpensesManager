package com.example.zzzyk.expensesmanager.View;
/**
 * Created by zzzyk on 10/14/2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zzzyk.expensesmanager.R;

public class Login extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.login, container, false);
        return rootView;
    }
}
