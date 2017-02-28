package com.oasis.android.dagger2.c;

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

    @QualifierA
    @Provides
    Engine providesEngineA(){
        return new Engine("GearA");
    }

    @QualifierB
    @Provides
    Engine providesEngineB(){
        return new Engine("SumSung");
    }

}
