package com.example.hp.chan;

        import android.content.Intent;
        import android.graphics.Color;
        import android.graphics.drawable.ColorDrawable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ListView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    static final String TAG = "Chan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.i(TAG, getLocalClassName() + ".onCreate");

        ArrayList<MyItem> data = new ArrayList<>();
        data.add(new MyItem("성북구 ","02-760-1678","11:00~22:00"));

        final MyAdapter adapter = new MyAdapter(data, this, R.layout.item);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.RED));
        listView.setDividerHeight(5);

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

    public void button1(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
*/
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
    }
*/
}