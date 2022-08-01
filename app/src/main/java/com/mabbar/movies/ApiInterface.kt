package com.mabbar.movies

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("posts/1")
    fun getpost():Call<post>


    }




