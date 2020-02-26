package com.ovais.office.tshirtskotlin.features.register.view

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.ovais.office.tshirtskotlin.R
import com.ovais.office.tshirtskotlin.features.register.contracts.UserRegisterContracts
import com.ovais.office.tshirtskotlin.features.register.presenter.RegisterPresenterImpl
import com.ovais.office.tshirtskotlin.features.register.router.RegisterRouter
import com.ovais.office.tshirtskotlin.features.register.router.UserInfo
import kotlinx.android.synthetic.main.activity_user_register.*

class UserRegisterActivity : AppCompatActivity(), UserRegisterContracts.RegisterView {

    private val presenter = RegisterPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)
        setupLoginListener()

    }

    private fun getUsername(): String {
        return loginUsername.text.toString()
    }

    private fun getUserPassword(): String {
        return loginPassword.text.toString()
    }

    private fun getUserGender(): String {

        val dataAdapter = ArrayAdapter<String>(
            this,
            R.layout.support_simple_spinner_dropdown_item,
            resources.getStringArray(R.array.gender_array)
        )
        gender.setAdapter(dataAdapter)
        gender.threshold = 0
        gender.onItemClickListener =
            AdapterView.OnItemClickListener { parent, _, position, _ ->
                gender.showDropDown()
                val selectedGender = parent.getItemAtPosition(position).toString()
            }
        gender.setOnFocusChangeListener { _: View?, hasFocus: Boolean ->
            if (hasFocus) {
                gender.showDropDown()
            }
        }
        val text = gender.text
        return text.toString()


    }

    private fun setupLoginListener() {

        loginButton.setOnClickListener {

            presenter.onSuccessfulSubmit(
                UserInfoDataHolder(
                    getUsername(),
                    getUserPassword(),
                    getUserGender()
                )
            )

        }


    }

    override fun onLoginSuccess() {

        Toast.makeText(
            applicationContext,
            getString(R.string.on_successful_register),
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onUsernameError() {

        val username = findViewById<EditText>(R.id.loginUsername)
        username.error = getString(R.string.usernameError)
        username.requestFocus()
    }

    override fun onPasswordError() {

        val password = findViewById<EditText>(R.id.loginPassword)
        password.error = getString(R.string.passwordError)
        password.requestFocus()
    }

    override fun onLoginFailed() {
        Toast.makeText(
            applicationContext,
            getString(R.string.on_failure_register),
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onGenderError() {

        val gender = findViewById<AutoCompleteTextView>(R.id.gender)
        gender.error = getString(R.string.genderError)
        gender.requestFocus()
    }

    override fun onNavigationSuccess() {

        RegisterRouter(UserInfo(getUsername(), getUserPassword(), getUserGender()))
            .startActivity(this)


    }
}

data class UserInfoDataHolder(val username: String, val password: String, val gender: String)
