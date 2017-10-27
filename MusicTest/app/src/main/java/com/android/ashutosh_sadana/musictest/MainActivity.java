package com.android.ashutosh_sadana.musictest;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.play_button);
        b2 = (Button) findViewById(R.id.pause_button);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.start();
                }
                });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                            mediaPlayer.pause();

                }
            });

    }
}
