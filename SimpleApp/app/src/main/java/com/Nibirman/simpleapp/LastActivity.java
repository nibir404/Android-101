package com.Nibirman.simpleapp;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LastActivity extends AppCompatActivity {

    TextView FinalTextVew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        FinalTextVew =(TextView) findViewById(R.id.textView2);
        FinalTextVew.setText("WELCOME!! "+getIntent().getStringExtra("PERSON_NAME"));
    }
}
