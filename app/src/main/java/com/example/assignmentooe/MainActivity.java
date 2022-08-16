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
    private ImageView image;
    private String [] titles_array;
    private String [] contents_array;
    private ImageView banner_img;
    public String title;
    public String content;
    public String banner_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button_cs = (ImageButton)findViewById(R.id.tile_cs);
        ImageButton button_se = (ImageButton)findViewById(R.id.tile_se);
        ImageButton button_des = (ImageButton)findViewById(R.id.tile_design);
        ImageButton button_math = (ImageButton)findViewById(R.id.tile_math);

        ImageView detail_banner = (ImageView)findViewById(R.id.detail_banner);

        /**
         * button_cs.setOnClickListener
         * View on the detailed activity of Computer Science
         * when the cs image button is clicked
         *Returns nothing
         */
        button_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "The cs button has been clicked!", Toast.LENGTH_SHORT).show();
                ///Explicit Intent class is used to be able to move from main activity to detail
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);

                titles_array=getResources().getStringArray(R.array.string_array_titles);
                title=titles_array[0];
                contents_array=getResources().getStringArray(R.array.string_array_content);
                content=contents_array[0];

                intent.putExtra("BANNER",R.drawable.img_cs_banner);
                intent.putExtra("TITLE",title);
                intent.putExtra("CONTENT",content);
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

                titles_array=getResources().getStringArray(R.array.string_array_titles);
                title=titles_array[3];
                contents_array=getResources().getStringArray(R.array.string_array_content);
                content=contents_array[3];

                intent.putExtra("BANNER",R.drawable.img_se_banner);
                intent.putExtra("TITLE",title);
                intent.putExtra("CONTENT",content);
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

                titles_array=getResources().getStringArray(R.array.string_array_titles);
                title=titles_array[1];
                contents_array=getResources().getStringArray(R.array.string_array_content);
                content=contents_array[1];

                intent.putExtra("BANNER",R.drawable.img_design_banner);
                intent.putExtra("TITLE",title);
                intent.putExtra("CONTENT",content);
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

                titles_array=getResources().getStringArray(R.array.string_array_titles);
                title=titles_array[2];
                contents_array=getResources().getStringArray(R.array.string_array_content);
                content=contents_array[2];

                intent.putExtra("BANNER",R.drawable.img_math_banner);
                intent.putExtra("TITLE",title);
                intent.putExtra("CONTENT",content);
                startActivity(intent);
            }
        });

    }
}