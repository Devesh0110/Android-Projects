package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void currencyConvert(View v){
        //Toast.makeText(this, "Converted", Toast.LENGTH_SHORT).show();
        EditText editText=(EditText)findViewById(R.id.editText);  //id editText belongs to the value box
        String amountindollar=editText.getText().toString();
        double dollars=Double.parseDouble(amountindollar);
        double rs=dollars*70.0;

        Toast.makeText(this, "$"+amountindollar+"= Rs"+rs, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}