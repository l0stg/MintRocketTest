package com.example.gitrepositoriesapp

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/repositories")
    fun getDataList(): Call<MutableList<DataModels>>
}