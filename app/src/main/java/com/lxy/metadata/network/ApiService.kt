package com.lxy.wanandroid.network

import com.lxy.wanandroid.entity.HomeBannerEntity
import retrofit2.http.GET

interface ApiService {

    @GET("banner/json")
    suspend fun getBanner() : HomeBannerEntity
}