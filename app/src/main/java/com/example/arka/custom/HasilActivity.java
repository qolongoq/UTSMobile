package com.example.arka.custom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent intent = getIntent();

        TextView th = (TextView) findViewById(R.id.totalHasil);
        th.setText(""+intent.getStringExtra("hasil"));

    }
}
