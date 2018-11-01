package com.example.ivode.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        boolean check = checkbox.isChecked();
        // switch case statement for the 10 items
        switch (checkbox.getId()) {
            case R.id.hat_checkbox:
                ImageView hat = findViewById(R.id.hat);
                // we make the item visible if the checkbox is checked, else invisible
                hat.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            // same for all other items
            case R.id.eyebrows_checkbox:
                ImageView eyebrows = findViewById(R.id.eyebrows);
                eyebrows.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.nose_checkbox:
                ImageView nose = findViewById(R.id.nose);
                nose.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.mustache_checkbox:
                ImageView mustache = findViewById(R.id.mustache);
                mustache.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.arms_checkbox:
                ImageView arms = findViewById(R.id.arms);
                arms.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.eyes_checkbox:
                ImageView eyes = findViewById(R.id.eyes);
                eyes.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.glasses_checkbox:
                ImageView glasses = findViewById(R.id.glasses);
                glasses.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.mouth_checkbox:
                ImageView mouth = findViewById(R.id.mouth);
                mouth.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.shoes_checkbox:
                ImageView shoes = findViewById(R.id.shoes);
                shoes.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
            case R.id.ears_checkbox:
                ImageView ears = findViewById(R.id.ears);
                ears.setVisibility(check ? View.VISIBLE : View.INVISIBLE);
                break;
        }
    }
}
