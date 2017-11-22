package com.example.arka.custom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter {

    private final Activity context;
    private final String[] itemname;
    private final String[] descriptionItem;
    private final Integer[] imgid;

    public CustomList(Activity context, String[] itemname, Integer[] imgid, String[] descriptionItem) {
        super(context, R.layout.activity_custom_list, itemname);

        this.context=context;
        this.itemname=itemname;
        this.descriptionItem=descriptionItem;
        this.imgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_custom_list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Description "+descriptionItem[position]);
        return rowView;

    };
}
