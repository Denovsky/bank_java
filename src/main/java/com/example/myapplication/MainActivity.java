package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public String user_login = "ilya";
    public String user_password = "12345";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText loginText = (EditText) findViewById(R.id.login);
        EditText passwordText = (EditText) findViewById(R.id.password);
        Button enter = (Button) findViewById(R.id.enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                if ((loginText.getText().toString().equals(user_login)) && (passwordText.getText().toString().equals(user_password))) {
                    toast = Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("loginText", loginText.getText().toString());
                    startActivity(intent);
                }
                else {
                    toast = Toast.makeText(getApplicationContext(), "Wrong login or password", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}