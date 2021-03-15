package com.example.tutorialone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CatViewActivity extends AppCompatActivity {
    // image view
    ImageView catImage;

    // title text
    TextView txtTitle;

    // back button
    Button btnBack;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_view);

        btnBack = findViewById(R.id.btnBack);

        catImage = findViewById(R.id.catImage);

        txtTitle = findViewById(R.id.catTitle);

        /* Get the passed cat to view from the main activity */
        intent = getIntent();
        int viewCat = intent.getIntExtra(MainActivity.EXTRA_VIEW_CAT, 1);

        switch (viewCat) {
            case 1:
                txtTitle.setText("Small white Kitten");
                catImage.setImageResource(R.drawable.cat1);
                break;
            case 2:
                txtTitle.setText("Kitten sleeping on back");
                catImage.setImageResource(R.drawable.cat2);
                break;
            case 3:
                txtTitle.setText("Kitten in basket");
                catImage.setImageResource(R.drawable.cat3);
                break;
            case 4:
                txtTitle.setText("White Sleeping cat");
                catImage.setImageResource(R.drawable.cat4);
                break;
            case 5:
                txtTitle.setText("White & brown cat Sleeping arm crossed");
                catImage.setImageResource(R.drawable.cat5);
                break;
            case 6:
                txtTitle.setText("Brown cat Sleeping on side");
                catImage.setImageResource(R.drawable.cat6);
                break;
            case 7:
                txtTitle.setText("Wild bob cat sitting");
                catImage.setImageResource(R.drawable.cat7);
                break;
            case 8:
                txtTitle.setText("Small wild cat");
                catImage.setImageResource(R.drawable.cat8);
                break;
            case 9:
                txtTitle.setText("I think it's a bobcat");
                catImage.setImageResource(R.drawable.cat9);
                break;
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == btnBack.getId()) {
                    goHome();
                }
            }
        });
    }

    public void goHome() {
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}