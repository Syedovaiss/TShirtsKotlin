package com.ovais.office.tshirtskotlin.features.register.contracts

import com.ovais.office.tshirtskotlin.features.register.view.UserInfoDataHolder

interface UserRegisterContracts {
    interface RegisterView {
        fun onLoginSuccess()
        fun onUsernameError()
        fun onPasswordError()
        fun onLoginFailed()
        fun onGenderError()
        fun onNavigationSuccess()
    }

    interface RegisterPresenter {
        fun onSuccessfulSubmit(userInfo: UserInfoDataHolder)
    }

    interface RegisterInteractor {
        fun onValidUser(userInfo: UserInfoDataHolder)
    }

    interface RegisterInteractorOut {}

}