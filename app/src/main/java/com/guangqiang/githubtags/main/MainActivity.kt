package com.guangqiang.githubtags.main

import android.os.Bundle
import com.guangqiang.githubtags.AbsActivity
import com.guangqiang.githubtags.Navigator
import com.guangqiang.githubtags.R
import javax.inject.Inject

/**
 * Created by eric on 11/1/2018.
 */
class MainActivity : AbsActivity() {

    @Inject lateinit var navigater: Navigator

    @Inject lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigater.test()
        presenter.test()
    }

}