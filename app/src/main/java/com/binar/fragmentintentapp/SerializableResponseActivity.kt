package com.binar.fragmentintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_serializable_response.*

class SerializableResponseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable_response)

        this.supportActionBar?.hide()

        val credential = intent.getSerializableExtra("Credential_One") as Credential_Serializable

        val username = credential.username.toString()
        val password = credential.password.toString()

        tv_hello_serializable.text = "Hello ${username}!"
        tv_subtitle_serializable.text = "You login with '${password}' password"
    }
}