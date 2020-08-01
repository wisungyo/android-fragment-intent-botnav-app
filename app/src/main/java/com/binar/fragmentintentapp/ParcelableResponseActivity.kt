package com.binar.fragmentintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parcelable_response.*
import kotlinx.android.synthetic.main.activity_serializable_response.*

class ParcelableResponseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable_response)
        this.supportActionBar?.hide()

        val credential = intent.getParcelableExtra<Credential_Parcelable>("Credential_One")

        val username = credential?.username.toString()
        val password = credential?.password.toString()

        tv_hello_parcelable.text = "Hello ${username}!"
        tv_subtitle_parcelable.text = "You login with '${password}' password"
    }
}