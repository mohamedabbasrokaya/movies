package com.mabbar.movies

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiManager {

    companion object{
        private var retrofit: Retrofit?=null
       private fun getInstance():Retrofit{
            if (retrofit==null) {
                retrofit = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }

            return retrofit!!
        }
        fun getApis():ApiInterface{
            return getInstance().create(ApiInterface::class.java)
        }

    }


}