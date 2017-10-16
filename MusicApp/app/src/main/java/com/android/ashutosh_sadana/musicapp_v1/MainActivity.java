package com.android.ashutosh_sadana.musicapp_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewGroup group = (ViewGroup)findViewById(R.id.genre_list_layout);
        View v;
        for(int i = 0; i < group.getChildCount(); i++) {
            v = group.getChildAt(i);
            if(v instanceof TextView) {
                v.setOnClickListener(new View.OnClickListener(){
                    @Override

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, GenreActivity.class);
                        intent.putExtra("id", view.getId());
                        intent.putExtra("name", ((TextView) findViewById(view.getId())).getText());
                        startActivity(intent);
                    }
                });
            }
        }
    }
}
