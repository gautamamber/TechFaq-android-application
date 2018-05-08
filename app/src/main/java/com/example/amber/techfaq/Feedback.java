package com.example.amber.techfaq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_feedback );
    }

    public void done(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        Toast toast=Toast.makeText(getApplicationContext(),"Thanks for your Feedback",Toast.LENGTH_SHORT);
        startActivity(i);
    }
}
