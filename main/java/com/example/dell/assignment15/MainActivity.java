package com.example.dell.assignment15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

               Toast t= Toast.makeText(getApplicationContext(), "action Created",Toast.LENGTH_SHORT);
               t.setGravity(Gravity.CENTER,0,0);
               t.show();

            }




     @Override
    protected void onStart() {
        super.onStart();
        Log.d("Standard","OnStart()");
         Toast t= Toast.makeText(getApplicationContext(), "action strated",Toast.LENGTH_SHORT);

         t.show();
}   @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Standard","OnDestroy()");
    Toast t= Toast.makeText(getApplicationContext(), "action destroy",Toast.LENGTH_SHORT);

    t.show();
}

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Standard","OnStop()");
        Toast t= Toast.makeText(getApplicationContext(), "action stopedd",Toast.LENGTH_SHORT);

        t.show();
    }
   @Override
    protected void onResume() {
        super.onResume();
        Log.d("Standard","OnResume()");
        Toast t= Toast.makeText(getApplicationContext(), "action resumed",Toast.LENGTH_SHORT);

        t.show();
        }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Standard","OnPause()");
        Toast t= Toast.makeText(getApplicationContext(), "action pauseed",Toast.LENGTH_SHORT);

        t.show();
        }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Standard","OnRestart()");
        Toast t= Toast.makeText(getApplicationContext(), "action restart",Toast.LENGTH_SHORT);

        t.show();
}
}
