package com.ovais.office.tshirtskotlin.features.register.presenter

import com.ovais.office.tshirtskotlin.features.register.contracts.UserRegisterContracts
import com.ovais.office.tshirtskotlin.features.register.interactor.RegisterInteractorImpl
import com.ovais.office.tshirtskotlin.features.register.view.UserInfoDataHolder

class RegisterPresenterImpl(private val view: UserRegisterContracts.RegisterView) :
    UserRegisterContracts.RegisterPresenter, UserRegisterContracts.RegisterInteractorOut {
    private val registerInteractor: UserRegisterContracts.RegisterInteractor =
        RegisterInteractorImpl(this)

    override fun onSuccessfulSubmit(userInfo: UserInfoDataHolder) {
        when {
            userInfo.username.isBlank() -> {
                view.onUsernameError()
                view.onLoginFailed()

            }
            userInfo.password.isBlank() -> {
                view.onPasswordError()
                view.onLoginFailed()

            }
            userInfo.gender.isBlank() -> {
                view.onGenderError()
                view.onLoginFailed()

            }
            else -> {

                registerInteractor.onValidUser(userInfo)
                view.onLoginSuccess()
                view.onNavigationSuccess()
            }
        }


    }


}