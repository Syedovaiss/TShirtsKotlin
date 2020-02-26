package com.ovais.office.tshirtskotlin.features.tshirts.view

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ovais.office.tshirtskotlin.R
import com.ovais.office.tshirtskotlin.features.tshirts.contracts.TShirtContracts
import com.ovais.office.tshirtskotlin.features.tshirts.presenter.TShirtPresenterImpl
import kotlinx.android.synthetic.main.activity_tshirt.*

class TShirtActivity : AppCompatActivity(), TShirtContracts.TShirtView {

    private val presenter = TShirtPresenterImpl(this)
    private val progressDialog = ProgressDialog(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tshirt)
        setupRecyclerView()
    }

    override fun setupRecyclerView() {
       var recyclerView=findViewById<RecyclerView>(R.id.shirt_recycler_view)

        progressDialog.show()
        presenter.getDataFromInteractor()
        progressDialog.dismiss()

    }

    override fun navigateToShirtDetails() {


    }


}
