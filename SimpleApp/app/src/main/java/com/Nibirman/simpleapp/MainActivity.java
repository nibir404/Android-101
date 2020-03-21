package com.Nibirman.simpleapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText userNameEditText;
    Button EnterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.Showtextview);
        userNameEditText = (EditText) findViewById(R.id.editText2);
        EnterButton = (Button) findViewById(R.id.Okbutton);

        EnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Button on press method
                String nameString = userNameEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this,LastActivity.class);
                intent.putExtra("PERSON_NAME",nameString);
                startActivity(intent);
            }
        });
    }
}
