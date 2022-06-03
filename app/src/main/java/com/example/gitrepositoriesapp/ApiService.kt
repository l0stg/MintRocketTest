package com.example.gitrepositoriesapp

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query



interface ApiService {

    @GET("/repositories")

    fun getData(@Query("since") sin: Int = 369 ): Call<MutableList<dataModels>>
}