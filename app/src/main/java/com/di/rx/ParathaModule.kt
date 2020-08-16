package com.di.rx

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by ayushshrivastava on 16/08/20.
 */
@Module
class ParathaModule {

    @Provides
    fun provideParatha() = Paratha("Gobhi Paratha")

    @Provides
    fun provideParathaType() = Paratha("XYZ").parathaType
}