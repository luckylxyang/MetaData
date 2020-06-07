package com.lxy.wanandroid.entity

data class HomeBannerEntity(
    val errorCode :Int,
    val errorMsg : String,
    val `data`: List<HomeBanner>
)

data class HomeBanner(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)