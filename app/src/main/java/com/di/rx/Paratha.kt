package com.di.rx

import javax.inject.Inject

/**
 * Created by ayushshrivastava on 16/08/20.
 */
class Paratha @Inject constructor(type : String) {

    var parathaType : String = type
}