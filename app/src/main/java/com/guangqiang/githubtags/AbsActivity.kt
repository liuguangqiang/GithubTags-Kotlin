package com.guangqiang.githubtags

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by eric on 10/1/2018.
 */
abstract class AbsActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}