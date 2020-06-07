package com.lxy.wanandroid.utils

import android.util.Log

object LogUtils {

    private var isDebugger = true

    fun warn(msg : String){
        if (!isDebugger) return
        Log.w("warn",msg)
    }


    fun info(msg : String){
        if (!isDebugger) return
        Log.i("info",msg)
    }


    fun error(msg : String){
        if (!isDebugger) return
        Log.e("error",msg)
    }

    fun verbose(msg : String){
        if (!isDebugger) return
        Log.v("verbose",msg)
    }

}