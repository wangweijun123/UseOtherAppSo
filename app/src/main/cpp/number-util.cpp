#include <jni.h>
#include <string>


extern "C"
JNIEXPORT jint JNICALL
Java_com_wangweijun_sharedso_NumberUtil_add(JNIEnv *env, jclass clazz, jint num1, jint num2) {
    return num1 + num2;
}