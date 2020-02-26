package com.ovais.office.tshirtskotlin.features.register.router

import android.content.Context
import android.content.Intent
import com.ovais.office.tshirtskotlin.features.register.constants.RegisterConstants.USER_INFO_INTENT
import com.ovais.office.tshirtskotlin.features.tshirts.view.TShirtActivity
import java.io.Serializable

class RegisterRouter(val userData: UserInfo) {

    fun startActivity(context: Context) {
        val intent = Intent(context, TShirtActivity::class.java)
        intent.putExtra(USER_INFO_INTENT, userData)
        context.startActivity(intent)

    }
}

data class UserInfo(val username: String, val password: String, val gender: String) : Serializable