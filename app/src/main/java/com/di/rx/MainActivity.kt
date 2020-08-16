package com.di.rx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntKey
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var paratha: Paratha

    @Inject
    lateinit var parathaType : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerMainComponent.create().inject(this)
        setContentView(R.layout.activity_main)

        tvParatha.text = parathaType
    }
}