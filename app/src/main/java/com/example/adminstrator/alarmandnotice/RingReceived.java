package com.example.adminstrator.alarmandnotice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.administrator.myapplication.NoDisplayActivity;
import com.example.administrator.myapplication.RingActivity;

public class RingReceived extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("test",intent.getAction());
        if("test1212".equals(intent.getAction())){
            Log.i("test","闹钟响了");
            //跳转到Activity n //广播接受者中（跳转Activity）
//            Intent intent1=new Intent(context,RingActivity.class);
            Intent intent1 = new Intent(context, NoDisplayActivity.class);
            //给Intent设置标志位
            intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
        }

    }
}
