package com.example.mysimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClick(View View)
    {
        TextView txtHello = findViewById(R.id.textMessage);
        EditText editTextName = findViewById(R.id.editTxtName);
        txtHello.setText("Hello "+editTextName.getText().toString());
    }
}