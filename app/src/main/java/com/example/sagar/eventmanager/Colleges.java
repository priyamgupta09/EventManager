package com.example.sagar.eventmanager;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Colleges extends ActionBarActivity {
    TextView t,k,i,m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);

        t = (TextView) findViewById(R.id.textView3);
        t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Colleges.this, SRMUniversity.class));
            }});

                k = (TextView) findViewById(R.id.textView4);
                k.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Colleges.this, KIET.class));

                    }});

        m = (TextView) findViewById(R.id.textView10);
        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Colleges.this, MIET.class));

            }});

                        i = (TextView) findViewById(R.id.textView5);
                        i.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                startActivity(new Intent(Colleges.this, ITS.class));
                            }});
            }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_colleges, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

