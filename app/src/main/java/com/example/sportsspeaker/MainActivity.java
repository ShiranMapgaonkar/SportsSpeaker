package com.example.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgboxing;
    private ImageButton imgaikedo;
    private ImageButton imgjudo;
    private ImageButton imgkarate;
    private ImageButton imgkickboxing;
    private ImageButton imgtaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgboxing = findViewById(R.id.imgboxing);
        imgaikedo = findViewById(R.id.imgaikedo);
        imgjudo = findViewById(R.id.imgjudo);
        imgkarate = findViewById(R.id.imgkarate);
        imgkickboxing = findViewById(R.id.imgkickboxing);
        imgtaekwondo = findViewById(R.id.imgtaekwondo);

        imgboxing.setOnClickListener(MainActivity.this);
        imgaikedo.setOnClickListener(MainActivity.this);
        imgjudo.setOnClickListener(MainActivity.this);
        imgkarate.setOnClickListener(MainActivity.this);
        imgkickboxing.setOnClickListener(MainActivity.this);
        imgtaekwondo.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imgbtnview) {

        switch (imgbtnview.getId()) {
            case R.id.imgboxing :
                playsportname(imgboxing.getTag().toString());
                break;
            case R.id.imgaikedo :
                playsportname(imgaikedo.getTag().toString());
                break;
            case R.id.imgjudo :
                playsportname(imgjudo.getTag().toString());
                break;
            case R.id.imgkarate :
                playsportname(imgkarate.getTag().toString());
                break;
            case R.id.imgkickboxing :
                playsportname(imgkickboxing.getTag().toString());
                break;
            case R.id.imgtaekwondo :
                playsportname(imgtaekwondo.getTag().toString());
                break;

        }

    }

    private void playsportname (String sportname) {
        MediaPlayer sportplayer = MediaPlayer.create(this,getResources().getIdentifier(sportname,"raw", getPackageName()));
        sportplayer.start();
    }
}