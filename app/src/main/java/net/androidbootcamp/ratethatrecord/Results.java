package net.androidbootcamp.ratethatrecord;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //Intent intent = getIntent();
        //String [] stringArray = intent.getStringArrayExtra("string-array");
        String[] array = getIntent().getStringArrayExtra("key");
        TextView songResult1 = (TextView) findViewById(R.id.txtSongResult1);
        TextView songResult2 = (TextView) findViewById(R.id.txtSongResult2);
        TextView songResult3 = (TextView) findViewById(R.id.txtSongResult3);

        songResult1.setText(array[0]);
        songResult2.setText(array[1]);
        songResult3.setText(array[2]);
    }
}
