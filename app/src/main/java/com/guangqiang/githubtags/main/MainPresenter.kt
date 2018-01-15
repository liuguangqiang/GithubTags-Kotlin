package com.guangqiang.githubtags.main

import android.util.Log
import javax.inject.Inject

/**
 * Created by eric on 15/1/2018.
 */
class MainPresenter : MainContract.Presenter {

    var userId: String

    @Inject
    constructor(userId: String) {
        this.userId = userId
    }

    override fun test() {
        Log.d("test", "MainPresenter test:" + userId)
    }

}