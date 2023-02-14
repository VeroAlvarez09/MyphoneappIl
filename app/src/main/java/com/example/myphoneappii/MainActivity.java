package com.example.myphoneappii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String TAG="ActividadMyphoneappII";
    Button crearalarma, llamar;
    String phonerNumber = "3015520522";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"--oncreate");
    }
}