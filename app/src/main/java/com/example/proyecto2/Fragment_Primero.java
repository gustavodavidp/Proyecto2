package com.example.proyecto2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment_Primero extends Fragment {

    private EditText Et1,Et2;
    private Button Btn1,Btn2;
    private TextView Tv1,Tv2;


    public Fragment_Primero() {
        // Required empty public constructor
    }


    public static Fragment_Primero newInstance(String param1, String param2) {
        Fragment_Primero fragment = new Fragment_Primero();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment__primero,container,false);

        Et1 = view.findViewById(R.id.Et1);
        Btn1 = view.findViewById(R.id.Btn1);

        Et2 = view.findViewById(R.id.Et2);
        Btn2 = view.findViewById(R.id.Btn2);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tv1 = getActivity().findViewById(R.id.Tv1);
                Tv1.setText("Nombre Ingresado");
                Et1.setText(" ");
                Tv2 = getActivity().findViewById(R.id.Tv2);
                Tv2.setText("Apellido Ingresado");
                Et2.setText(" ");

            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tv1 = getActivity().findViewById(R.id.Tv1);
                Tv1.setText(Et1.getText().toString());
                Tv2 = getActivity().findViewById(R.id.Tv2);
                Tv2.setText(Et2.getText().toString());

            }
        });

        return view;
    }
}