package com.example.apptentiver8demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.apptentive.android.sdk.Apptentive
import com.apptentive.android.sdk.ApptentiveConfiguration

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Apptentive.register(
            application,
            ApptentiveConfiguration("", "")
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
