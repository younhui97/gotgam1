package com.example.yh.gotgam1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {


    public void onClick01(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:119"));
        startActivity(intent);
    }
    public void onClick02(View v) {
        sendMessageTo("01012345678", "This is a test message.");
    }

    private Context mContext;

    public void sendMessageTo(String phoneNum, String message) {

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNum, null, message, null, null);

        Toast.makeText(mContext, "Message transmission is completed.",
                Toast.LENGTH_SHORT).show();
    }
}