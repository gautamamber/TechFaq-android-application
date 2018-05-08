package com.example.amber.techfaq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Query extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_query );
    }

    public void qdone(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        Toast toast=Toast.makeText(getApplicationContext(),"Contact you soon",Toast.LENGTH_SHORT);
        startActivity(i);
    }
}
