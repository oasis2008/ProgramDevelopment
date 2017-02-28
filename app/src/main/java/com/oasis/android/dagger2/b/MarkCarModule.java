package com.oasis.android.dagger2.b;

import dagger.Module;
import dagger.Provides;

/**
 * @author Oasis Yao
 *         Created on 2017/2/28.
 */

@Module
public class MarkCarModule {
    public MarkCarModule(){

    }

    @Provides
    Engine providesEngine(){
        return new Engine("gear");
    }

}
