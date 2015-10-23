package com.uk.ninja.qa.overflowmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.main_view);
        TextView textresult = (TextView)findViewById(R.id.textView);


        switch (item.getItemId()) {
            case R.id.white_black:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
                textresult.setTextColor(Color.parseColor("#000000"));
                return true;

            case R.id.black_white:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#000000"));
                textresult.setTextColor(Color.parseColor("#FFFFFF"));
                return true;

            case R.id.mint_chocolate:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#d0ffdf"));
                textresult.setTextColor(Color.parseColor("#87560b"));
                return true;

            case R.id.sepia:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#eedbb6"));
                textresult.setTextColor(Color.parseColor("#87560b"));
                return true;

            default:
                main_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
                textresult.setTextColor(Color.parseColor("#000000"));
                return super.onOptionsItemSelected(item);

        }
    }
}
