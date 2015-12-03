package com.example.testndk.jni;

public class JniClient {
	static public native String AddStr(String strA, String strB);
	static public native int addInt(int a, int b);
}
