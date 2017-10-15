package com.example.hp.chan;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            Drawable drawable = getDrawable(R.drawable.ic_arrow_back_black_24dp);
            if (drawable != null) {
                drawable.setTint(Color.WHITE);
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        Intent intent = getIntent();
        String msg = intent.getStringExtra("string_msg");

        EditText edit = (EditText) findViewById(R.id.edit);
        edit.setText(msg);
    }

   /* @Override
    public void onBackPressed() {
        EditText edi = (EditText) findViewById(R.id.edit);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("ResultString", edi.getText().toString());
        setResult(RESULT_OK, resultIntent);
        super.onBackPressed();
    }*/
}
