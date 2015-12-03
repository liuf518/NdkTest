LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := TestNdk
LOCAL_SRC_FILES := com_example_testndk_jni_JniClient.c
include $(BUILD_SHARED_LIBRARY)