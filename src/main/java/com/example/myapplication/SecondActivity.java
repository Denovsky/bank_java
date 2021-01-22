package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    public int balance;
    Button convert;
    Button take_of;
    Button sum_in;
    TextView score;
    TextView greeting2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        greeting2 = findViewById(R.id.greet2);
        score = findViewById(R.id.score);
        sum_in = findViewById(R.id.button);
        take_of = findViewById(R.id.button2);
        convert = findViewById(R.id.button3);
        sum_in.setOnClickListener(this);
        take_of.setOnClickListener(this);
        convert.setOnClickListener(this);

        String text = ("Wellcome, " + getIntent().getStringExtra("loginText"));
        String text2 = ("Your balance: " + balance);

        greeting2.setText(text);
        score.setText(text2);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
        case R.id.button:
            intent = new Intent(SecondActivity.this, Money_of_balance.class);
            startActivity(intent);
            break;
        }

    }
}