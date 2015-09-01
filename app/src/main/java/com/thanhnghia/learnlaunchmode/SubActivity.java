package com.thanhnghia.learnlaunchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ngh on 8/31/2015.
 */
public class SubActivity extends Activity {
    public static final String EXTRA_NAME="DataFromSubActivity";

    private final String TAG="LaunchMode SubActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG,"onCreate");

        setContentView(R.layout.activity_sub);
        Button btn=(Button)findViewById(R.id.btn_send_to_main_activity);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String time=simpleDateFormat.format(Calendar.getInstance().getTime());
                Log.i(TAG," startActivity time="+time);
                Intent i=new Intent(SubActivity.this,MainActivity.class);
                i.putExtra(EXTRA_NAME,"data from sub activity "+time);

                startActivity(i);
            }
        });

    }


}
