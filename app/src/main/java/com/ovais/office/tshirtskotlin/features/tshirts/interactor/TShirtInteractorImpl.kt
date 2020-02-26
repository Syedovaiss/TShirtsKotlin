package com.ovais.office.tshirtskotlin.features.tshirts.interactor


import com.ovais.office.tshirtskotlin.features.tshirts.contracts.TShirtContracts
import com.ovais.office.tshirtskotlin.features.tshirts.model.Shirt
import com.ovais.office.tshirtskotlin.network.retrofitinstance.APIClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TShirtInteractorImpl(private val interactorOut: TShirtContracts.TShirtInteractorOut) :
    TShirtContracts.TShirtInteractor {
    var dataList = ArrayList<Shirt>()


    override fun getDataFromAPI() {

        val call: Call<List<Shirt>> = APIClient.getClient.getData()
        call.enqueue(object : Callback<List<Shirt>> {
            override fun onResponse(call: Call<List<Shirt>>?, response: Response<List<Shirt>>?) {
                dataList.addAll(response!!.body()!!)
                //Save to DB
            }

            override fun onFailure(call: Call<List<Shirt>>?, t: Throwable?) {
                //Get from DB
            }
        })


    }
}