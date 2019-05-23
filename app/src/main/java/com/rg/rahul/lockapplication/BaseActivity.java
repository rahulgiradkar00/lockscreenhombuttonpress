package com.rg.rahul.lockapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

   /* @Override
    public void onCreate(@androidx.annotation.Nullable Bundle savedInstanceState, @androidx.annotation.Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }*/

    @Override
    protected void onStart() {
        super.onStart();
       // Log.w("onTrimMemory", String.valueOf(level) + "                   ----");
        /*boolean flag = ((App) getApplication()).flag;
        if(flag==true){
            Intent intent = new Intent(this, SampleActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }*/

    }
}
