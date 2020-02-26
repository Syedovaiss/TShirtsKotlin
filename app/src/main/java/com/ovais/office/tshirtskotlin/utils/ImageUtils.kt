package com.ovais.office.tshirtskotlin.utils

import android.widget.ImageView
import com.ovais.office.tshirtskotlin.R
import com.squareup.picasso.Picasso

class ImageUtils {
    fun setImageToAdapter(imageUrl: String, image: ImageView) {
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.drawable.login_shirt)
            .error(R.drawable.login_shirt)
            .into(image)

    }
}