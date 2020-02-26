package com.ovais.office.tshirtskotlin.network.retrofitinstance

import com.ovais.office.tshirtskotlin.network.retrofitinterface.RetrofitInterface
import com.ovais.office.tshirtskotlin.network.constants.RetrofitConstants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    val getClient: RetrofitInterface
        get() {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(RetrofitInterface::class.java)
        }

}