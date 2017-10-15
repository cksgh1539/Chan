package com.example.hp.chan;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    static final String TAG = "Chan";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            Drawable drawable = getDrawable(R.drawable.ic_arrow_back_black_24dp);
            if (drawable != null) {
                drawable.setTint(Color.WHITE);
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }
        Log.i(TAG, getLocalClassName() + ".onCreate");
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }*/

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.quick_action1:
                Toast.makeText(getApplicationContext(), "quick", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_subactivity:
                startActivity(new Intent(this, ThirdActivity.class));

                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                intent.putExtra("string_msg", "Hello");
                startActivityForResult(intent, 0);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/

    public void onClickButtonTwo(View view) {
        Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
        intent.putExtra("string_msg", "Hello");
        startActivityForResult(intent, 0);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getLocalClassName() + ".onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, getLocalClassName() + ".onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, getLocalClassName() + ".onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getLocalClassName() + ".onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getLocalClassName() + ".onDestroy");
    }




   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 0 || data == null)
            return;
        String msg = data.getStringExtra("ResultString");
        Log.i(TAG, "ActivityResult:" + resultCode + " " + msg);
    }*/


}