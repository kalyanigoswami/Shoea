package com.example.shoea.retrofit

import com.example.shoea.data.ProductListModel
import retrofit2.Call
import retrofit2.http.GET

interface RetroServiceInterface {

    @GET("products")
    fun getProductsList(): Call<List<ProductListModel>>
}