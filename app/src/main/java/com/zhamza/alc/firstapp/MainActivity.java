package com.zhamza.alc.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbout;
    private Button btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfile = findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfileActivity();
            }
        });

        btnAbout = findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutAndelaActivity();
            }
        });
    }

    private void openAboutAndelaActivity() {
        Intent intent = new Intent(this, AboutALC.class);
        startActivity(intent);
    }

    private void openMyProfileActivity() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}
