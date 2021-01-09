package com.e.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    FragmentManager zenet;
    EditText et , em;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new Fragment();
        zenet = getFragmentManager();
        FragmentTransaction gogo= zenet.beginTransaction();

        // cant seem to figure out why the code isnt taking my fragment class buggg!! alert
        gogo.add(R.id.framy, fragment, "hh7");
        gogo.commit();

        et= findViewById(R.id.edit);
        em= findViewById(R.id.edita);
        String kll = et.getText().toString().trim();
        String wll = em.getText().toString().trim();
        Bundle joe = new Bundle();
        joe.putString("kll", kll);
        joe.putString("wll", wll);
        fragment.setArguments(joe);




    }
}