package com.android.ashutosh_sadana.musicapp_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        this.setTitle(name);

        Button play_button = (Button) findViewById(R.id.play_button);
                play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenreActivity.this,TrackDetailsActivity.class);
                startActivity(intent);
            }
        });

        Button buy_now_button = (Button) findViewById(R.id.buy_now_button);
        buy_now_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenreActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
