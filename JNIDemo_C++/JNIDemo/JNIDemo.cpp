#include "JNIDemo.h"
#include "jni_md.h"
#include <iostream>
using namespace std;
JNIEXPORT void JNICALL Java_JNIDemo_Hello(JNIEnv * env, jobject obj)
{
	cout << "Hello Word" << endl;
}