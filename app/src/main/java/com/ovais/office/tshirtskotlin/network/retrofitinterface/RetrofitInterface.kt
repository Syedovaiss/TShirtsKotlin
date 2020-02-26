package com.ovais.office.tshirtskotlin.network.retrofitinterface

import com.ovais.office.tshirtskotlin.features.tshirts.model.Shirt
import com.ovais.office.tshirtskotlin.network.constants.RetrofitConstants.TSHIRT_GET_REQUEST
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @GET(TSHIRT_GET_REQUEST)
    fun getData(): Call<List<Shirt>>
}