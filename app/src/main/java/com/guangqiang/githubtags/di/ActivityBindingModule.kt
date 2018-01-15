package com.guangqiang.githubtags.di

import com.guangqiang.githubtags.main.MainActivity
import com.guangqiang.githubtags.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by eric on 11/1/2018.
 */
@Module
internal abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun mainActivity(): MainActivity
}