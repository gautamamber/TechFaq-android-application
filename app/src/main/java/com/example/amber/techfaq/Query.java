package com.example.amber.techfaq;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Query extends AppCompatActivity {

    DatabaseHelper myDB;
EditText e1,e2,e3;
    public static final String DATABASE_NAME = "mdb";
Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_query );
        myDB = new DatabaseHelper(this);
        b1 = (Button)findViewById(R.id.b1);
        e1 = (EditText)findViewById(R.id.i1);
        e2 = (EditText)findViewById(R.id.i2);
        e3 = (EditText)findViewById(R.id.i3);
    }


    public void qdone(View view) {
        String newEntry = e3.getText().toString().trim();

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
            else {

                AddData(newEntry);
                e3.setText("");
                e1.setText( "" );
                e2.setText( "" );
                Intent i = new Intent( getApplicationContext(),MainActivity.class );

                startActivity( i );

            }

        }catch(Exception e)
        {
            Toast.makeText( this,"Something went wrong",Toast.LENGTH_SHORT ).show();
        }


    }
    public void AddData(String newEntry) {

        boolean insertData = myDB.addData(newEntry);

        if(insertData==true){
            Toast.makeText(this, "Thank you", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Something went wrong :(.", Toast.LENGTH_LONG).show();
        }
    }
    

}
