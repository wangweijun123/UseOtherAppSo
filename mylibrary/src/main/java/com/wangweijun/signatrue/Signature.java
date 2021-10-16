package com.wangweijun.signatrue;

/**
 * so 的加载，可以加载apk里面集成的，
 * 也可以加载指定路劲的so，所以服务器下载
 */
public class Signature {
    // Used to load the 'native-lib' library on application startup.
    static {
        // 加载apk里面的so,具体目录 src/main/jniLibs/xxx/xxxx
//        System.loadLibrary("signatrue");
        // 加载指定路劲的so文件,所以可以做到动态下发so
        System.load("/data/data/com.wangweijun.useso/cache/libsignatrue.so");
    }

    public static native String signature();
}
