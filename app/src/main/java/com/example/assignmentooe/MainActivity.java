package com.example.assignmentooe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //Imported View to be able to implement it for the view methods
import android.widget.Toast; //Importted Toast to be able to implement a toast message

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void cs_subButton(View v){
            Toast.makeText(this, "The button has been clicked!", Toast.LENGTH_SHORT).show();
        }

        public void math_subButton(View v){
            Toast.makeText(this, "The button has been clicked!", Toast.LENGTH_SHORT).show();
        }

        public void design_subButton(View v){
            Toast.makeText(this, "The button has been clicked!", Toast.LENGTH_SHORT).show();
        }

        public void se_subButton(View v){
            Toast.makeText(this, "The button has been clicked!", Toast.LENGTH_SHORT).show();
        }

}