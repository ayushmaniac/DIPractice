package com.di.rx

import dagger.Component

/**
 * Created by ayushshrivastava on 16/08/20.
 */

@Component(modules = [ParathaModule::class])
interface MainComponent {

    fun inject(activity: MainActivity)
}