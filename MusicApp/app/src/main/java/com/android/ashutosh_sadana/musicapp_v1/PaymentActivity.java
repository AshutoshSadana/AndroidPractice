package com.android.ashutosh_sadana.musicapp_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        Button back_genre_button_2 = (Button) findViewById(R.id.back_genre_button_2);
        back_genre_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentActivity.this,GenreActivity.class);
                startActivity(intent);
            }
        });

        Button back_stream_button = (Button) findViewById(R.id.back_stream_button);
        back_stream_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentActivity.this,TrackDetailsActivity.class);
                startActivity(intent);
            }
        });

    }
}
