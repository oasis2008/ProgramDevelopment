package com.oasis.android.homepage;

import dagger.Module;
import dagger.Provides;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */
@Module
public class HomePageModule {

    private HomePageContract.View view;

    public HomePageModule(HomePageContract.View view) {
        this.view = view;
    }

    @Provides
    HomePageContract.View provideHomePageContract(){
        return view;
    }
}
