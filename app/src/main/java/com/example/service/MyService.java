package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

 public class MyService extends Service {

     String TAG="MyServices";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

     @Override
     public void onCreate() {
        // Toast.makeText(MyService.this,"onBind",Toast.LENGTH_LONG).show();
         Log.d(TAG,"onbind");
         super.onCreate();
     }

     @Override
     public int onStartCommand(Intent intent, int flags, int startId) {
         //Toast.makeText(MyService.this,"My Service Started",Toast.LENGTH_LONG).show();
         Log.d(TAG,"My Service Started");
         return super.onStartCommand(intent, flags, startId);
     }

     @Override
     public void onDestroy() {
         super.onDestroy();
         //Toast.makeText(MyService.this,"My Service Started",Toast.LENGTH_LONG).show();
         Log.d(TAG,"My Service Stopped");


     }
 }


