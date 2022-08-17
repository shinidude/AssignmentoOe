package com.example.assignmentooe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent; //Intend is imported to be able to use the intent class


public class DetailedActivity extends AppCompatActivity {
    //Declaring variables
    TextView TITLE, CONTENT;
    int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        TITLE=findViewById(R.id.content_title_id);//passing the title textview in xml to be able to access in java
        CONTENT=findViewById(R.id.detail_content_id);//passing the content textview in xml to be able to access in java
        ImageView banner = (ImageView) findViewById(R.id.detail_banner);//passing the image in the detailed activity in xml to be able to access in java

        Intent intent = getIntent();//Accessing the intent
        String title = intent.getStringExtra("TITLE");//getting the "TITLE" data and passing it into title
        String content = intent.getStringExtra("CONTENT");//getting the "CONTENT" data and passing it into content

        TITLE.setText(title);//the text in the TITLE textview will be changed into the value in title
        CONTENT.setText(content);//the text in the CONTENT textview will be changed into the value in content

        Bundle b= getIntent().getExtras();//check if any value sent from previous activity
        val = b.getInt("BANNER");//get the image value
        banner.setImageResource(val);//Set the banner using the image value
    }
}