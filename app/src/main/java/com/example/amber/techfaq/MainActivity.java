package com.example.amber.techfaq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.nfc.tech.MifareClassic.SIZE_MINI;
import static android.support.design.widget.FloatingActionButton.SIZE_NORMAL;

public class MainActivity extends AppCompatActivity {

    TextView t5; int mSize;
    final int getSizeDimension() {
        switch (mSize) {
            case SIZE_MINI:
                return getResources().getDimensionPixelSize(R.dimen.design_fab_size_mini);
            case SIZE_NORMAL:
            default:
                return getResources().getDimensionPixelSize(R.dimen.design_fab_size_normal);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView( R.layout.activity_main );
        TextView t5 =(TextView)findViewById(R.id.t5);
        t5.setClickable(true);
        t5.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.linkedin.com/in/amber-gautam-988782137/'> @ambergautam </a>";
        t5.setText( Html.fromHtml(text));




    }

    public void query(View view) {
        Intent i = new Intent(getApplicationContext(), Query.class);
        startActivity(i);
    }

    public void feedback(View view) {
        Intent i = new Intent(getApplicationContext(), Feedback.class);
        startActivity(i);
    }


    public void search(View view) {
        try{
            Intent intent=new Intent(this,ViewListContents.class);
            startActivity(intent);
        }catch(Exception e)
        {
            Toast.makeText( this,"something wrong",Toast.LENGTH_SHORT ).show();
        }
    }
}

