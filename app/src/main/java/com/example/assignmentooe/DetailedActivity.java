package com.example.assignmentooe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent; //Intend is imported to be able to use the intent class


public class DetailedActivity extends AppCompatActivity {

    TextView TITLE, CONTENT;
    int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        TITLE=findViewById(R.id.content_title_id);
        CONTENT=findViewById(R.id.detail_content_id);
        ImageView banner = (ImageView) findViewById(R.id.detail_banner);

        Intent intent = getIntent();
        String title = intent.getStringExtra("TITLE");
        String content = intent.getStringExtra("CONTENT");
        Bundle b= getIntent().getExtras();

        if (b != null) {
            val = b.getInt("BANNER");
        }
        banner.setImageResource(val);

        TITLE.setText(title);
        CONTENT.setText(content);


    }


}