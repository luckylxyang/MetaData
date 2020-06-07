package com.lxy.metadata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lxy.metadata.base.BaseActivity
import com.lxy.metadata.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {


    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initActivity(savedInstanceState: Bundle?) {

    }
}
