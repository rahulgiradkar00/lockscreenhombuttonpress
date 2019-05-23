
package com.rg.rahul.lockapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.back).setBackgroundResource(getIntent().getIntExtra("color",0));


    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Second onStop","onStop ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Second onResume","onResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Second onPause","onPause ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
       // Toast.makeText(getApplication(),"Toajddd",Toast.LENGTH_LONG).show();
    }
}
