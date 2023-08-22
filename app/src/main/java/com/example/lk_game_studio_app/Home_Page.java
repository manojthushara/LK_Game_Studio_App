package com.example.lk_game_studio_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Home_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        LinearLayout aboutbtn = findViewById(R.id.about);
        LinearLayout hextrisbtn = findViewById(R.id.hextris);
        LinearLayout pingpongbtn = findViewById(R.id.pingpong);
        LinearLayout basketballbtn = findViewById(R.id.basketball);
        LinearLayout trafficbtn = findViewById(R.id.traffic);
        LinearLayout stackbtn = findViewById(R.id.stack);
        LinearLayout crossybtn = findViewById(R.id.crossyroad);
        LinearLayout cubebtn = findViewById(R.id.cube);
        LinearLayout shootbtn = findViewById(R.id.shoot);
        LinearLayout aviatorbtn = findViewById(R.id.aviator);
        LinearLayout advanturebtn = findViewById(R.id.adventure);
        LinearLayout roadracebtn = findViewById(R.id.roadrace);
        LinearLayout officebtn = findViewById(R.id.office);
        LinearLayout heartsbtn = findViewById(R.id.hearts);
        LinearLayout rpgbtn = findViewById(R.id.rpg);
        LinearLayout contact = findViewById(R.id.contact);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Contact_Page.class));
            }
        });

        rpgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/RPG/");
            }
        });

        heartsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/html5-hearts/");
            }
        });

        officebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/officewalkthrough1/Build3/index.html");
            }
        });

        roadracebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/roadRace/");
            }
        });

        advanturebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/2dplatformergame/Build8/index.html");
            }
        });

        aviatorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/TheAviatormaster3js/index.html");
            }
        });

        shootbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/shootthebox3js/index.html");
            }
        });

        cubebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/cube3js/index.html");
            }
        });

        crossybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/crossyroad3js/index.html");
            }
        });

        stackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/stackgame3js/dist/index.html");
            }
        });

        trafficbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/trafficgame3js/dist/index.html");
            }
        });

        basketballbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/ball-shooting/index.html");
            }
        });

        pingpongbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/pingpoing/index.html");
            }
        });


        hextrisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://bluechipplay.com/Games/hextris-gh-pages/index.html");
            }
        });

        aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, About_page.class));
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}