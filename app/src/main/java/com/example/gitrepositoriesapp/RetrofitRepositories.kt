package com.example.gitrepositoriesapp


import retrofit2.Response

class RetrofitRepositories {
    fun getData(): Response<DataModels>{
        return RetrofitInstance.api.getDataList()
    }
}