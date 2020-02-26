package com.ovais.office.tshirtskotlin.features.tshirts.contracts

interface TShirtContracts {
    interface TShirtView {

        fun setupRecyclerView()
        fun navigateToShirtDetails()

    }

    interface TShirtPresenter {
        fun getDataFromInteractor()


    }

    interface TShirtInteractor {
        fun getDataFromAPI()


    }

    interface TShirtInteractorOut {

    }

}