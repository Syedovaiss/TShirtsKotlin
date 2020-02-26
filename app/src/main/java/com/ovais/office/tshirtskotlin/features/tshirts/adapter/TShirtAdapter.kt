package com.ovais.office.tshirtskotlin.features.tshirts.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ovais.office.tshirtskotlin.R
import com.ovais.office.tshirtskotlin.features.tshirts.model.Shirt
import com.squareup.picasso.Picasso

class TShirtAdapter(private var dataList: List<Shirt>) :
    RecyclerView.Adapter<TShirtAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.tshirt_card_rows, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList[position]
        holder.title.text = dataModel.pName
        Picasso.get()
            .load(dataModel.picture)
            .placeholder(R.drawable.login_shirt)
            .error(R.drawable.login_shirt)
            .into(holder.image)
        holder.price.text = dataModel.price


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.shirt_image)
        var title: TextView = itemView.findViewById(R.id.shirt_name)
        var price: TextView = itemView.findViewById(R.id.shirt_price)


    }
}