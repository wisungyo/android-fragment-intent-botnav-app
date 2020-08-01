package com.binar.fragmentintentapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bundle_response.*

class BundleResponseActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_response)
        this.supportActionBar?.hide()

        val bundle = intent.extras
        val username = bundle?.getString("username")
        val password = bundle?.getString("password")

        tv_hello_bundle.text = "Hello ${username}!"
        tv_subtitle_bundle.text = "You login with '${password}' password"
    }
}