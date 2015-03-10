package com.example.p623419.myfirstapp01;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.util.Log;


public class DisplayMessageActivity extends ActionBarActivity {

    public final static String FILTER_TAG = "AppFilter";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);
        Log.i(FILTER_TAG, "MessageActivity - onCreate");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(FILTER_TAG, "MessageActivity - onOptionsItemSelected");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() { }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_display_message,container, false);
            return rootView;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(FILTER_TAG, "MessageActivity - onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(FILTER_TAG, "MessageActivity - onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(FILTER_TAG, "MessageActivity - onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(FILTER_TAG, "MessageActivity - onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(FILTER_TAG, "MessageActivity - onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(FILTER_TAG, "MessageActivity - onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(FILTER_TAG, "MessageActivity - onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(FILTER_TAG, "MessageActivity - onRestoreInstanceState");
    }
}