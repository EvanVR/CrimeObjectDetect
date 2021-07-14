package com.example.demovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    VideoView videoView;
    MediaController mc;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();

        videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.output_new);
        mc = new MediaController(MainActivity.this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);

        //next.setOnClickListener(new View.OnClickListener() {
        //    @Override
         //   public void onClick(View view) {
        //        Intent intent = new Intent(Demo.this, MainActivity.class);
          //      startActivity(intent);
            //}
        //});
    }
}