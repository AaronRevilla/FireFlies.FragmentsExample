package com.example.aaron.fragmentsexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragmentContainer) != null){

            BlankFragment bf = new BlankFragment();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.fragmentContainer, bf);
            //opcional
            ft.addToBackStack(null);
            ft.commit();

//          getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.myContainer, bFF)
//                    .commit();

        }
    }
}
