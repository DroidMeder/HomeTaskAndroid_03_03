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

public class ForthFragment extends Fragment {
    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button=view.findViewById(R.id.btn_fourth_fragment);
        editText=view.findViewById(R.id.editText_fourth_fragment);
        initFragment();
    }

    private void initFragment() {

        Bundle bundleIn=getArguments();
        if (bundleIn != null){
            String username = bundleIn.getString(MainFragment.USERNAME_KEY);
            System.out.println(username);
            editText.setText(username);
        }

        button.setOnClickListener(v -> {
            MainActivity.isFourthFragment =false;
            Bundle bundle = new Bundle();
            Fragment forthFragment = new FifthFragment();
            if (editText.getText() != null){
                bundle.putString(MainFragment.USERNAME_KEY, editText.getText().toString());
            }
            forthFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, forthFragment).commit();

        });
    }
}