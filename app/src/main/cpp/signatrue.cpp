#include <jni.h>
#include <string>
#include <android/log.h>

const char* tag = "wangweijun_c";

static char* PACKAGE_NAME = "com.tencent.mars.useotherappso";

extern "C"
JNIEXPORT jstring JNICALL
Java_com_wangweijun_signatrue_Signature_signature(JNIEnv *env, jobject obj) {

    jclass cls = env->GetObjectClass(obj);
    jmethodID  mid = env->GetMethodID(cls, "getPackage", "()Ljava/lang/String;");
    jstring package = static_cast<jstring>(env->CallObjectMethod(obj, mid));
    const char * package_c =  env->GetStringUTFChars(package, NULL);
//    strcmp(PACKAGE_NAME, package_c)
    // 这里打印有问题
//    __android_log_print(ANDROID_LOG_DEBUG, tag, "package = %s", package_c);
//    __android_log_print(ANDROID_LOG_ERROR,"JNI_TAG","签名校验成功:");

    const char *sig = "xxxx";
    return env->NewStringUTF(sig);
}
