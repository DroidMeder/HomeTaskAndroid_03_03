package com.example.hometaskandroid_03_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    public static boolean isMainFragment = true;
    public static boolean isSecondFragment = true;
    public static boolean isThirdFragment = true;
    public static boolean isFourthFragment = true;
    public static boolean isFifthFragment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();

    }

    @Override
    public void onBackPressed() {
        if (isMainFragment && isSecondFragment && isThirdFragment && isFourthFragment
                && isFifthFragment) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new MainFragment()).commit();
            isMainFragment = true;
            isSecondFragment = true;
            isThirdFragment = true;
            isFourthFragment = true;
            isFifthFragment = true;
        }
    }
}