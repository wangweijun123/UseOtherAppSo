package com.wangweijun.sharedso;

public class NumberUtil {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("wangweijun");
    }
    public static native int add(int num1, int num2);

}
