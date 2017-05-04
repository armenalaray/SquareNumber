package com.example.armen.squarenumber;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = (EditText)findViewById(R.id.etInput);


    }

    public void buttonClick(View v){
        String input = etInput.getText().toString();
        Log.i("INFO", "el numero es:"+ input);

        double number = Double.parseDouble(input);
        Context context = this;
        if(CheckTriangle(number)){
            Toast.makeText(context,"El numero: " + input + " es un numero triangular.", Toast.LENGTH_LONG).show();
        }
        if(CheckSquare(number)){
            Toast.makeText(context,"El numero: "+ input + " es un numero cuadrado.", Toast.LENGTH_LONG).show();
        }

    }

    boolean CheckTriangle(double number){
        double count = 0;
        double base  = 0;
        while (base < number)
        {
            count += 1;
            base = base + count;
        }
        if(number == base){
            return true;
        }
        else {
            return false;
        }
    }

    boolean CheckSquare(double number){
        double root = sqrt(number);
        double piso = floor(root);

        if(piso == root){
            return true;
        }
        else{
            return false;
        }
    }
}
