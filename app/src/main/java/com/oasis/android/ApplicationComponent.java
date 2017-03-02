package com.oasis.android;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    ProgramApplication getApplication();
    Context getContext();
}
