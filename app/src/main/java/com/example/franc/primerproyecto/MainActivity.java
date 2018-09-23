package com.example.franc.primerproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonPulsado(View view){
        TextView holaMundo = (TextView) findViewById(R.id.holaMundo);
        if (holaMundo.getVisibility() == view.INVISIBLE)
            holaMundo.setVisibility(view.VISIBLE);
        else holaMundo.setVisibility(view.INVISIBLE);
    }
}
