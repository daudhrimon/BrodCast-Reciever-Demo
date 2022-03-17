package com.example.brodcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBrodcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String myAction = intent.getAction();
        if (myAction==intent.ACTION_POWER_CONNECTED){
            Toast.makeText(context,"Power Connected", Toast.LENGTH_LONG).show();
        }
        boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
        if(isAirplaneModeOn){
            Toast.makeText(context, "Airplane Mode On", Toast.LENGTH_SHORT).show();
        }
    }
}
