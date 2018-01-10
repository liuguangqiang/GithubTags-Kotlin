package com.guangqiang.githubtags.inject

import com.guangqiang.githubtags.TagsApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by eric on 10/1/2018.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class
))
interface AppComponent : AndroidInjector<TagsApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<TagsApplication>()
}