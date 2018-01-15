package com.guangqiang.githubtags.main;

import com.guangqiang.githubtags.di.ActivityScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by eric on 15/1/2018.
 */
@Module
public abstract class MainModule {

  @ActivityScoped
  @Binds
  abstract MainContract.Presenter presenter(MainPresenter presenter);

  @ActivityScoped
  @Provides
  static String provideUserId() {
    return "123456";
  }

}
