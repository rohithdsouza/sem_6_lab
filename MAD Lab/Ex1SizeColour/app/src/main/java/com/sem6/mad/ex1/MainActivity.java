package com.sem6.mad.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;
    Button butSize;
    Button butColor;
    private static float textSize = 24; //initial size of txtView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = findViewById(R.id.textView);
        butSize = findViewById(R.id.button);
        butColor = findViewById(R.id.button2);

        //Modify button size on click
        butSize.setOnClickListener(view -> {  //lambda "function view ->" instead of old version (below)
            if (textSize > 60)
                textSize = 24;
            else
            {
                textSize+=5;
                txtHello.setTextSize(textSize);
            }

        });

        butColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                txtHello.setTextColor(Color.rgb(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            }
        });

    }
}