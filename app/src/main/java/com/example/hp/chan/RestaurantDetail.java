/*
package com.example.hp.chan;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RestaurantDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);


        ArrayList<MyItem> data = new ArrayList<>();
        data.add(new MyItem("성북구 ","02-760-1678","11:00~22:00"));

        final MyAdapter adapter = new MyAdapter(data, this, R.layout.item);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.RED));
        listView.setDividerHeight(5);


       */
/* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                String address = ((MyItem)adapter.getItem(position)).getAddress();
                Toast.makeText(RestaurantDetail.this, address + " selected",
                        Toast.LENGTH_SHORT).show();
            }
        });*//*

    }

}
*/
