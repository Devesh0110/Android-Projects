package com.example.guessthecorrectnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void accept(View v){
        EditText editText=(EditText)findViewById(R.id.editText);
        String y=editText.getText().toString();
        int usernumber=Integer.parseInt(y);
        if(usernumber==randomnumber){
            Toast.makeText(this, "Correct Value", Toast.LENGTH_SHORT).show();
        }
        else if(usernumber<randomnumber){
            Toast.makeText(this, "Go higher", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Go lower",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) { //runs code when the app is loaded
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Random rand=new Random();
       randomnumber=rand.nextInt(20)+1;
    }
}