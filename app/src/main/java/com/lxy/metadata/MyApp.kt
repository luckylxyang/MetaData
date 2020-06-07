package com.lxy.metadata

import android.app.Application
import android.content.Context
import com.lxy.sdk.SensorsDataAPI

class MyApp : Application(){


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        SensorsDataAPI.init(this)
    }

    companion object {
        lateinit var context: Context
    }
}