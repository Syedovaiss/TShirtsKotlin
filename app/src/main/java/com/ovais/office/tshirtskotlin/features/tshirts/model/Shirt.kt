package com.ovais.office.tshirtskotlin.features.tshirts.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Shirt(

    @Expose
    @SerializedName("available")
    val available: Int?,
    @Expose
    @SerializedName("description")
    val description: String,
    @Expose
    @SerializedName("pName")
    val pName: String,
    @Expose
    @SerializedName("picture")
    val picture: String,
    @Expose
    @SerializedName("price")
    val price: String
)
