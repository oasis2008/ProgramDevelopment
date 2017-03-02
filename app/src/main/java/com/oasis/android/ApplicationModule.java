package com.oasis.android;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */

@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    ProgramApplication provideProgramApplication(){
        return (ProgramApplication) context.getApplicationContext();
    }
}
