package com.example.arka.custom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent intent;
    ListView list;
    String[] itemname = {
            "Persegi",
            "Lingkaran",
            "Segitiga",
            "Persegi Panjang",
            "Trapesium"
    };

    Integer[] imgid = {
            R.mipmap.iconpersegi,
            R.mipmap.lingkaran,
            R.mipmap.segitiga,
            R.mipmap.persegipanjang,
            R.mipmap.trapesium
    };

    String[] descriptionitem = {
            "1",
            "2",
            "3",
            "4",
            "5"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new CustomList(this, itemname, imgid, descriptionitem);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

        //list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //@Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //String Slecteditem = itemname[+position];
                //Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        intent = new Intent(this, DetailActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

            }
       // });


    }
//}
