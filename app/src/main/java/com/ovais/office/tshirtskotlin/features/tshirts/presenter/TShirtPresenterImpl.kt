package com.ovais.office.tshirtskotlin.features.tshirts.presenter

import com.ovais.office.tshirtskotlin.features.tshirts.contracts.TShirtContracts
import com.ovais.office.tshirtskotlin.features.tshirts.interactor.TShirtInteractorImpl

class TShirtPresenterImpl(private val view: TShirtContracts.TShirtView) :
    TShirtContracts.TShirtPresenter, TShirtContracts.TShirtInteractorOut {

    private val tshirtInteractor: TShirtContracts.TShirtInteractor =
        TShirtInteractorImpl(this)

    override fun getDataFromInteractor() {
        tshirtInteractor.getDataFromAPI()

    }


}