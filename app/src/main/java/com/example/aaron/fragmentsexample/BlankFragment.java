package com.example.aaron.fragmentsexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    TextView tV;
    Button bT;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        tV = (TextView) v.findViewById(R.id.textView);
        bT = (Button) v.findViewById(R.id.myB);

        bT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tV.setText("Great!");
            }
        });

        return v;
    }

}
