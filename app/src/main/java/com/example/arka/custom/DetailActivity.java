package com.example.arka.custom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.view.MenuItem;

public class DetailActivity extends AppCompatActivity {

    EditText sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sisi = (EditText) findViewById(R.id.sisi);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void tombolHitung1(View view) {
        try{
            Intent intent = new Intent(DetailActivity.this, HasilActivity.class);
            int nilaiA = Integer.parseInt(sisi.getText().toString());
            int hasil = nilaiA * nilaiA;
            intent.putExtra("hasil",""+hasil);
            //Toast.makeText(this, ""+hasil, Toast.LENGTH_SHORT).show();
            startActivity(intent);

        }catch (Exception ex){

        }
    }

    public void tombolHitung2(View view) {
        try{
            Intent intent = new Intent(DetailActivity.this, HasilActivity.class);
            int nilaiA = Integer.parseInt(sisi.getText().toString());
            int hasil = 4 * nilaiA;
            intent.putExtra("hasil",""+hasil);
            //Toast.makeText(this, ""+hasil, Toast.LENGTH_SHORT).show();
            startActivity(intent);

        }catch (Exception ex){

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
