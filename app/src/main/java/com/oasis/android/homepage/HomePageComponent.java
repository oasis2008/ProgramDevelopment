package com.oasis.android.homepage;

import com.oasis.android.ActivityScope;
import com.oasis.android.ApplicationComponent;

import dagger.Component;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */
@ActivityScope
@Component(modules = HomePageModule.class,dependencies = ApplicationComponent.class)
public interface HomePageComponent {
    void inject(HomePageActivity activity);
}
