package com.oasis.android;

import android.app.Application;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */

public class ProgramApplication extends Application{

    private ApplicationComponent applicationComponent;

    private static ProgramApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        instance = this;

    }

    public static ProgramApplication getInstance(){
        return instance;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
