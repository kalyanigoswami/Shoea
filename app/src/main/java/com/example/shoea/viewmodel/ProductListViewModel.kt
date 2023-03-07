package com.example.shoea.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoea.data.ProductListModel
import com.example.shoea.retrofit.RetroInstance
import com.example.shoea.retrofit.RetroServiceInterface
import retrofit2.Call
import retrofit2.Response
import retrofit2.create
import retrofit2.Callback

class ProductListViewModel {

    lateinit var listViewModel: MutableLiveData<List<ProductListModel>>

    init {
        listViewModel = MutableLiveData()
    }

    fun getLiveDataObserve(): MutableLiveData<List<ProductListModel>> {
        return listViewModel
    }

    fun makeAPICall() {
        val retroInstance = RetroInstance.getRetroInstance()
        val retroServiceInterface = retroInstance.create(RetroServiceInterface::class.java)
        val call = retroServiceInterface.getProductsList()
        call.enqueue(object :Callback<List<ProductListModel>> {
            override fun onFailure(call: Call<List<ProductListModel>>, t: Throwable) {
                listViewModel.postValue(null)
            }

            override fun onResponse(
                call: Call<List<ProductListModel>>,
                response: Response<List<ProductListModel>>
            ) {
                listViewModel.postValue(response.body())
            }
        })
    }
}