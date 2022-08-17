package com.example.assignmentooe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View; //Imported View to be able to implement it for the view methods
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast; //Imported Toast to be able to implement a toast message
import android.content.Intent; //Intend is imported to be able to use the intent class

public class MainActivity extends AppCompatActivity{

    //Declaring necessary variables
    private String [] titles_array; ///An array of tiles of course
    private String [] contents_array; //An array of contents of each course
    public String title; //title of the course
    public String content; //detailed content of the course

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///passing through the xml image buttons to be able to access in jave
        ImageButton button_cs = (ImageButton)findViewById(R.id.tile_cs);
        ImageButton button_se = (ImageButton)findViewById(R.id.tile_se);
        ImageButton button_des = (ImageButton)findViewById(R.id.tile_design);
        ImageButton button_math = (ImageButton)findViewById(R.id.tile_math);

        /**
         * button_cs.setOnClickListener
         * View on the detailed activity of Computer Science
         * when the cs image button is clicked
         *Returns nothing
         */
        button_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///Displays a message to the user that the button has been clicked properly
                Toast.makeText(MainActivity.this, "The cs button has been clicked!", Toast.LENGTH_SHORT).show();
                //Creating a new intent
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);

                ///Pass the array from the of the text from the array.xml
                titles_array=getResources().getStringArray(R.array.string_array_titles); //passing the array of titles to titles
                contents_array=getResources().getStringArray(R.array.string_array_content); //passing the array of contents to contents

                //Passing the index of the designates title and detailed content.
                title=titles_array[0];
                content=contents_array[0];

                //passing data through to the new Activity
                intent.putExtra("BANNER",R.drawable.img_cs_banner); //passing an image
                intent.putExtra("TITLE",title); //passing the title
                intent.putExtra("CONTENT",content); //passing the detailed content

                //passing the intent into start activity
                startActivity(intent);
            }
        });

        /**
         *  button_se.setOnClickListener
         * Displays the Detailed Activity of Software Engineering
         *when the se imagebutton is clicked
         */
        button_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The se button has been clicked!", Toast.LENGTH_SHORT).show();
                ///Explicit Intent class is used to be able to move from main activity to detail activity
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);

                ///Pass the array from the of the text from the array.xml
                titles_array=getResources().getStringArray(R.array.string_array_titles); //passing the array of titles to titles
                contents_array=getResources().getStringArray(R.array.string_array_content); //passing the array of contents to contents

                //Passing the index of the designates title and detailed content.
                title=titles_array[3];
                content=contents_array[3];

                //passing data through to the new Activity
                intent.putExtra("BANNER",R.drawable.img_se_banner);//passing an image
                intent.putExtra("TITLE",title);//passing the title
                intent.putExtra("CONTENT",content);//passing the detailed content

                //passing the intent into start activity
                startActivity(intent);
            }
        });

        /**
         *  button_des.setOnClickListener
         * Displays the Detailed Activity of Design
         *when the design image button is clicked
         */
        button_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The design button has been clicked!", Toast.LENGTH_SHORT).show();
                ///Explicit Intent class is used to be able to move from main activity to detail activity
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);

                ///Pass the array from the of the text from the array.xml
                titles_array=getResources().getStringArray(R.array.string_array_titles); //passing the array of titles to titles
                contents_array=getResources().getStringArray(R.array.string_array_content); //passing the array of contents to contents

                //Passing the index of the designates title and detailed content.
                title=titles_array[1];
                content=contents_array[1];

                //passing data through to the new Activity
                intent.putExtra("BANNER",R.drawable.img_design_banner);//passing an image
                intent.putExtra("TITLE",title);//passing the title
                intent.putExtra("CONTENT",content);//passing the detailed content

                //passing the intent into start activity
                startActivity(intent);
            }
        });

        /**
         *  button_math.setOnClickListener
         * Displays the Detailed Activity of Mathematics
         *when the Mathematics image button is clicked
         */
        button_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The math button has been clicked!", Toast.LENGTH_SHORT).show();
                ///Explicit Intent class is used to be able to move from main activity to detail activity
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);

                ///Pass the array from the of the text from the array.xml
                titles_array=getResources().getStringArray(R.array.string_array_titles); //passing the array of titles to titles
                contents_array=getResources().getStringArray(R.array.string_array_content); //passing the array of contents to contents

                //Passing the index of the designates title and detailed content.
                title=titles_array[2];
                content=contents_array[2];

                //passing data through to the new Activity
                intent.putExtra("BANNER",R.drawable.img_math_banner);//passing an image
                intent.putExtra("TITLE",title);//passing the title
                intent.putExtra("CONTENT",content);//passing the detailed content

                //passing the intent into start activity
                startActivity(intent);
            }
        });

    }
}