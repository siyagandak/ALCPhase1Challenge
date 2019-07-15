package com.sentinelstudio.alcphase1challenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mAboutAlcButton;
    private Button myProfileButton;
    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializeViews();

        mAboutAlcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAboutAlcActivity();
            }
        });

        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMyProfileActivity();
            }
        });

    }

    private void showMyProfileActivity() {
        mIntent = new Intent(this, MyProfile.class);
        startActivity(mIntent);
    }

    private void showAboutAlcActivity() {
        mIntent = new Intent(this, AboutALC.class);
        startActivity(mIntent);
    }

    private void initializeViews() {
        mAboutAlcButton = findViewById(R.id.btn_about_alc);
        myProfileButton = findViewById(R.id.btn_my_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
