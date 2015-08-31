package com.thanhnghia.learnlaunchmode;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    private final String TAG = "LaunchMode_MainActivity";
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        data = getIntent().getStringExtra(SubActivity.EXTRA_NAME);
        if (data != null) {
            Log.i(TAG, "data=" + data);
        }
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn_sub_activity);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SubActivity.class);
                startActivity(i);

            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "onNewIntent");
        data = intent.getStringExtra(SubActivity.EXTRA_NAME);
        if (data != null) {
            Log.i(TAG, "data=" + data);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");

        // get Extra here in second time (but values not change )
        data = getIntent().getStringExtra(SubActivity.EXTRA_NAME);
        if (data != null) {
            Log.i(TAG, "data=" + data);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        data = getIntent().getStringExtra(SubActivity.EXTRA_NAME);
        if (data != null) {
            Log.i(TAG, "data=" + data);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        Log.i(TAG, "onStart");
        data = getIntent().getStringExtra(SubActivity.EXTRA_NAME);
        if (data != null) {
            Log.i(TAG, "data=" + data);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}
