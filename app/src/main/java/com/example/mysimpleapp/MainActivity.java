package com.example.mysimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        EditText firstname = findViewById(R.id.FirstName);

        EditText lastname = findViewById(R.id.LastName);

        EditText email = findViewById(R.id.Email);

        TextView txtDetail = findViewById(R.id.textView);
        txtDetail.setText(firstname.getText().toString());
        TextView txtDetail2 = findViewById(R.id.textView2);
        txtDetail2.setText(lastname.getText().toString());
        TextView txtDetail3 = findViewById(R.id.textView3);
        txtDetail3.setText(email.getText().toString());

    }
}