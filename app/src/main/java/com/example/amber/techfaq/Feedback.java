package com.example.amber.techfaq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
EditText e1,e2,e3,e4,e5;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_feedback );
        b1 = (Button)findViewById(R.id.b1);
        e1 = (EditText)findViewById(R.id.i1);
        e2 = (EditText)findViewById(R.id.i2);
        e3 = (EditText)findViewById(R.id.i3);
        e4 = (EditText)findViewById(R.id.i4);
        e5 = (EditText)findViewById(R.id.i5);



    }

    public void done(View view) {




        try{
            if (e1.getText().toString().trim().equals(""))
            {
                Toast.makeText( this,"Enter Proper Details",Toast.LENGTH_SHORT ).show();
            }
                else if(e2.getText().toString().trim().equals(""))
            {
                Toast.makeText( this,"Enter Proper Details",Toast.LENGTH_SHORT ).show();
            }
                else if (e3.getText().toString().trim().equals(""))
            {
                Toast.makeText( this,"Enter Proper Details",Toast.LENGTH_SHORT ).show();
            }
            else if (e4.getText().toString().trim().equals(""))
            {
                Toast.makeText( this,"Enter Proper Details",Toast.LENGTH_SHORT ).show();
            }
            else if (e5.getText().toString().trim().equals(""))
            {
                Toast.makeText( this,"Enter Proper Details",Toast.LENGTH_SHORT ).show();
            }
            else {
                e1.setText( "" );
                e5.setText( "" );
                e4.setText( "" );
                e3.setText( "" );
                e2.setText( "" );
                Intent i = new Intent( getApplicationContext(),MainActivity.class );
                Toast.makeText( this,"Thank you",Toast.LENGTH_SHORT ).show();
                startActivity( i );
            }

        }catch(Exception e)
        {
            Toast.makeText( this,"Something went wrong",Toast.LENGTH_SHORT ).show();
        }


    }
}

