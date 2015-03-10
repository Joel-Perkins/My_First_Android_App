package com.example.p623419.myfirstapp01;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    public final static String FILTER_TAG = "AppFilter";
    public final static String EXTRA_MESSAGE = "com.example.p623419.myfirstapp01.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstTextView = (TextView) findViewById(R.id.edit_message);

        firstTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTextView.setBackgroundColor(Color.RED);
            }
        });

        Log.i(FILTER_TAG, "Main - onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(FILTER_TAG, "Main - onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(FILTER_TAG, "Main - onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(FILTER_TAG, "Main - onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(FILTER_TAG, "Main - onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(FILTER_TAG, "Main - onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(FILTER_TAG, "Main - onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(FILTER_TAG, "Main - onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(FILTER_TAG, "Main - onRestoreInstanceState");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i(FILTER_TAG, "Main - onCreateOptionsMenu");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(FILTER_TAG, "Main - onOptionsItemSelected");
        switch (item.getItemId()) {
            case R.id.action_search:
//                openSearch();
                return true;
            case R.id.action_settings:
//                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Log.i(FILTER_TAG, "Main - sendMessage");
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
