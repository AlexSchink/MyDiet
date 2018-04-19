package com.example.alexanderschink.mydiet;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView foodView;
    private String[] myString;
    private static final Random randomGen = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    @Override
    protected void onResume() {
        super.onResume();
        ImageView foodView = (ImageView) findViewById(R.id.foodView);

        int randFood = randomGen.nextInt(4)+1;
        String imgNumber = "mydiet" + randFood;
        int foodID = getResources().getIdentifier(imgNumber, "drawable", getPackageName());

        foodView.setImageResource(foodID);




        TextView quoteLabel = (TextView) findViewById(R.id.quoteLabel);

        myString = getResources().getStringArray(R.array.quotesArray);
        String q = myString[randomGen.nextInt(myString.length)];

        quoteLabel.setText(q);


    }
}
