package com.example.ivode.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public Map<String, Integer> show = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = {"hat", "eyebrows", "nose", "mustache", "arms", "eyes", "glasses",
                "mouth", "ears", "shoes"};
        for (String item : items) {
            show.put(item, savedInstanceState != null ? savedInstanceState.getInt(item) : View.INVISIBLE);
            ImageView img = findViewById(getResources().getIdentifier(item, "id", getPackageName()));
            img.setVisibility(show.get(item));
        }
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String item = checkbox.getText().toString().toLowerCase();
        ImageView img = findViewById(getResources().getIdentifier(item,"id", getPackageName()));
        // checkbox is checked? then make visible, else make invisible
        img.setVisibility(checkbox.isChecked() ? View.VISIBLE : View.INVISIBLE);
        show.put(item, img.getVisibility());
    }

    public void onSaveInstanceState(Bundle outState) {
        for (Map.Entry<String, Integer> save_state : show.entrySet()) {
            outState.putInt(save_state.getKey(), save_state.getValue());
        }
        super.onSaveInstanceState(outState); // always call super
    }

}
