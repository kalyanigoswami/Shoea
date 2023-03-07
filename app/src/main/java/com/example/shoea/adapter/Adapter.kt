package com.example.shoea.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoea.ProductList
import com.example.shoea.R
import com.example.shoea.data.ProductListModel


private val View.tvTitle: Any
    get() {
        TODO("Not yet implemented")
    }
private val View.tvCategory: Any
    get() {
        TODO("Not yet implemented")
    }
private val View.ivProduct: Any
    get() {
        TODO("Not yet implemented")
    }

class Adapter: RecyclerView.Adapter<Adapter.MyViewHolder>() {

   private var productList: List<ProductListModel>? = null

    fun setProductList(productList: List<ProductListModel>?) {
        this.productList = productList
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        if (productList == null) return 0
        else return productList?.size!!
    }

    class MyViewHolder(view : View): RecyclerView.ViewHolder(view){
        val ivProduct = view.ivProduct
        val tvTitle = view.tvTitle
        val tvCategory = view.tvCategory





        }
    }

