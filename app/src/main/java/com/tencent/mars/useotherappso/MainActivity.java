package com.tencent.mars.useotherappso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.wangweijun.sharedso.NumberUtil;

public class MainActivity extends AppCompatActivity {


    public static final String TAG = "wangweijun";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.sample_text);
        tv.setText(NumberUtil.add(100, 200) + "");

        com.wangweijun.signatrue.Signature sig = new com.wangweijun.signatrue.Signature(getApplicationContext());

        String signature = sig.signature();
        Log.i(TAG, "signature:"+signature);

        getSig();
    }

    /**
     * 获取应用的签名信息
     */
    private void getSig() {
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        Signature[] signatures = packageInfo.signatures;
        Log.i(TAG,"signatures[0] = " + signatures[0].toCharsString());
    }

}