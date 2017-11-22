package com.example.arka.custom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;

public class DetailActivity extends AppCompatActivity {

    EditText panjang, lebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        panjang = (EditText) findViewById(R.id.panjang);
        lebar = (EditText) findViewById(R.id.lebar);

    }
    public void tombolHitung(View view){
        try{
            Intent intent = new Intent(DetailActivity.this, HasilActivity.class);
            int nilaiA = Integer.parseInt(panjang.getText().toString());
            int nilaiB = Integer.parseInt(lebar.getText().toString());
            int hasil = nilaiA * nilaiB;
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
