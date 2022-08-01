package com.mabbar.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var textview:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview=findViewById(R.id.posttitle)
        getNewsSources()

    }

   private  fun getNewsSources() {
         ApiManager.getApis().getpost().enqueue(object:Callback<post>{
             override fun onResponse(call: Call<post>, response: Response<post>) {

                 textview.text = response.body().toString()
             }

             override fun onFailure(call: Call<post>, t: Throwable) {

                 textview.text = t.message
             }

         })



    }

}