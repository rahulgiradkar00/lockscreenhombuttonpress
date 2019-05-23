package com.rg.rahul.lockapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends BaseActivity {
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("color",R.color.red);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("color",R.color.green);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("color",R.color.blue);
                startActivity(intent);
            }
        }); /*findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity onStop", "onStop ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity onResume", "onResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity onPause", "onPause ");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(getApplication(),"Toajddd",Toast.LENGTH_LONG).show();
    }
}
