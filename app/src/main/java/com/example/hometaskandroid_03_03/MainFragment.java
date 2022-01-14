package com.example.hometaskandroid_03_03;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {

    private EditText editText;
    private Button button;
    public final static String USERNAME_KEY = "username_key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button=view.findViewById(R.id.btn_first_fragment);
        editText=view.findViewById(R.id.editText_first_fragment);
        initFragment();
    }

    private void initFragment() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.isMainFragment=false;
                Bundle bundle = new Bundle();
                Fragment fragment = new SecondFragment();
                if (editText.getText() != null){
                    bundle.putString(USERNAME_KEY, editText.getText().toString());
                }
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fragment).commit();

            }
        });
    }
}