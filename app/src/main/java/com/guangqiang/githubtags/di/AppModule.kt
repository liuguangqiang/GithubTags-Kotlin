package com.guangqiang.githubtags.di

import android.content.Context
import com.guangqiang.githubtags.Navigator
import com.guangqiang.githubtags.TagsApplication
import dagger.Module
import dagger.Provides

/**
 * Created by eric on 10/1/2018.
 */
@Module
class AppModule {

    @Provides
    fun provideContext(application: TagsApplication): Context {
        return application.applicationContext
    }

    @Provides
    fun provideNavigator(): Navigator {
        return Navigator()
    }
}