package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean image1=true;
    public void fade(View view){
        ImageView img1id=(ImageView)findViewById(R.id.img1id);
        ImageView img2id=(ImageView)findViewById(R.id.img2id);
        if(image1==true) {
            image1=false;
            img1id.animate().scaleX(0.9f).scaleY(0.9f).alpha(0).setDuration(2000);
            img2id.animate().rotation(360).alpha(1).setDuration(3000);
        }
        else{
            image1=true;
            img2id.animate().rotation(350).alpha(0).setDuration(2000);
            img1id.animate().scaleX(0.5f).scaleY(0.5f).alpha(1).setDuration(2000);
        }

    }
//    public void fade2(View v){
//        ImageView img1id=(ImageView)findViewById(R.id.img1id);
//        ImageView img2id=(ImageView)findViewById(R.id.img2id);
//        img2id.animate().alpha(0).setDuration(2000);
//        img1id.animate().alpha(1).setDuration(2000);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img1id=(ImageView)findViewById(R.id.img1id);
        img1id.animate().translationXBy(100).setDuration(1000);
    }
}