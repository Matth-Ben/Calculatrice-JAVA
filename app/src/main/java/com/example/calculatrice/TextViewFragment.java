package com.example.calculatrice;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

public class TextViewFragment extends Fragment {
    TextView crunchifyLastCalc;
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_textview, container, false);
        crunchifyLastCalc = (TextView)view.findViewById(R.id.textlastcalc);
        return view;
    }
}
