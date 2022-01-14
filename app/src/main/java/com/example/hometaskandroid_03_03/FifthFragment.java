package com.example.hometaskandroid_03_03;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class FifthFragment extends Fragment {
    private EditText editText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText=view.findViewById(R.id.editText_fifth_fragment);
        initFragment();
    }

    private void initFragment() {
        MainActivity.isFifthFragment =false;
        Bundle bundleIn=getArguments();
        if (bundleIn != null){
            String username = bundleIn.getString(MainFragment.USERNAME_KEY);
            System.out.println(username);
            editText.setText(username);
        }

    }
}