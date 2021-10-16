package com.wangweijun.signatrue;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.tencent.mars.useotherappso.MainActivity;

public class Signature {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("signatrue");
    }

    private Context context;

    public Signature(Context context) {
        this.context = context;
    }

    public String getPackage() {
        return context.getPackageName();
    }

    public String getPackageSignatureInfo() {
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        android.content.pm.Signature[] signatures = packageInfo.signatures;
        return signatures[0].toCharsString();
    }


    public native String signature();


}
