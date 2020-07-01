package com.example.calculatrice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import org.jetbrains.annotations.NotNull;

public class TextEditFragment extends Fragment {
    EditText crunchifyEditText;
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_textedit, container, false);
        crunchifyEditText = (EditText)view.findViewById(R.id.edt1);
        return view;
    }
}
