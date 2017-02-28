package com.oasis.android.dagger2.c;

import javax.inject.Inject;

/**
 * @author Oasis Yao
 *         Created on 2017/2/28.
 */

public class Car {

    @QualifierA
    @Inject
    Engine engineA;

    @QualifierB
    @Inject
    Engine engineB;

    public Car(){
        DaggerCarComponent.builder().markCarModule(new MarkCarModule())
                .build().injectCar(this);
    }

    public Engine getEngineA() {
        return engineA;
    }

    public Engine getEngineB() {
        return engineB;
    }
}
