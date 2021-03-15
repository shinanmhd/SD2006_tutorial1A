package com.example.tutorialone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*
    * initialize all the variables for the click handlers
    * Note
    * ------------------
    * - to reduce the code we can initialize all the variables in one line with the following ways
    * CardView cardOne, cardTwo, cardThree, cardFour, cardFive, cardSix, cardSeven, cardEight, cardNine;
    * */
    CardView cardOne;
    CardView cardTwo;
    CardView cardThree;
    CardView cardFour;
    CardView cardFive;
    CardView cardSix;
    CardView cardSeven;
    CardView cardEight;
    CardView cardNine;
//    CardView cardOne, cardTwo, cardThree, cardFour, cardFive, cardSix, cardSeven, cardEight, cardNine;

    TextView txtDevName;
    TextView txtDevBatch;

    // intent to navigate to the details view activity
    Intent intent;

    // name of the data passed to the details view
    public static final String EXTRA_VIEW_CAT = "com.assessment_1.view_cat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * link the object with the view by passing the id to the findViewById() method
        * */
        cardOne   = findViewById(R.id.cat1Card);
        cardTwo   = findViewById(R.id.cat2Card);
        cardThree = findViewById(R.id.cat3Card);
        cardFour  = findViewById(R.id.cat4Card);
        cardFive  = findViewById(R.id.cat5Card);
        cardSix   = findViewById(R.id.cat6Card);
        cardSeven = findViewById(R.id.cat7Card);
        cardEight = findViewById(R.id.cat8Card);
        cardNine  = findViewById(R.id.cat9Card);

        txtDevName  = findViewById(R.id.txtDevName);
        txtDevBatch = findViewById(R.id.txtDevBatch);

        /*
        * set on click listeners to the card objects
        * */
        cardOne.setOnClickListener(this);
        cardTwo.setOnClickListener(this);
        cardThree.setOnClickListener(this);
        cardFour.setOnClickListener(this);
        cardFive.setOnClickListener(this);
        cardSix.setOnClickListener(this);
        cardSeven.setOnClickListener(this);
        cardEight.setOnClickListener(this);
        cardNine.setOnClickListener(this);

        txtDevName.setOnClickListener(this);
        txtDevBatch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /*
        * switch between the cats and call the navigate method with the clicked cat id
        * */
        switch (view.getId()) {
            case R.id.cat1Card:
                navigate(1);
                break;
            case R.id.cat2Card:
                navigate(2);
                break;
            case R.id.cat3Card:
                navigate(3);
                break;
            case R.id.cat4Card:
                navigate(4);
                break;
            case R.id.cat5Card:
                navigate(5);
                break;
            case R.id.cat6Card:
                navigate(6);
                break;
            case R.id.cat7Card:
                navigate(7);
                break;
            case R.id.cat8Card:
                navigate(8);
                break;
            case R.id.cat9Card:
                navigate(9);
                break;
            case R.id.txtDevName:
            case R.id.txtDevBatch:
                Toast.makeText(this, "Why are you clicking on the developer details.", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    public void navigate(int activeCat) {
        intent = new Intent(this, CatViewActivity.class);
        intent.putExtra(EXTRA_VIEW_CAT, activeCat);
        startActivity(intent);
    }
}