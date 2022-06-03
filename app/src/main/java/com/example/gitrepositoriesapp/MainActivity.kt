package com.example.gitrepositoriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.myrecyclerview)
        val retrofitInstance = RetrofitInstance.buildService(ApiService::class.java)
        val call = retrofitInstance.getData()
        val buttonGet = findViewById<Button>(R.id.buttget)

        fun get(){
            call.clone().enqueue(object : Callback<MutableList<dataModels>> {
                override fun onResponse(
                    call: Call<MutableList<dataModels>>,
                    response: Response<MutableList<dataModels>>
                ) {
                    if (response.isSuccessful) {
                        Log.d("tagggggy", "Всё ок")
                        rv.apply {
                            layoutManager = LinearLayoutManager(this@MainActivity)
                            adapter = MyAdapter(response.body()!!)
                        }
                    }
                }
                override fun onFailure(call: Call<MutableList<dataModels>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "FFFFFF", Toast.LENGTH_LONG).show()
                }
            })
        }

        buttonGet.setOnClickListener() {
        get()
        }
    }
}








