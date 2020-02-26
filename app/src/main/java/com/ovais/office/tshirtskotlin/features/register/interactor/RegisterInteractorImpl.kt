package com.ovais.office.tshirtskotlin.features.register.interactor

import com.ovais.office.tshirtskotlin.features.register.contracts.UserRegisterContracts
import com.ovais.office.tshirtskotlin.features.register.view.UserInfoDataHolder

class RegisterInteractorImpl(private val interactorOut: UserRegisterContracts.RegisterInteractorOut) :
    UserRegisterContracts.RegisterInteractor {
    override fun onValidUser(userInfo: UserInfoDataHolder) {


        //Repo Lagaane hai
    }



}