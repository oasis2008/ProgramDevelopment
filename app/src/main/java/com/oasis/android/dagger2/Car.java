package com.oasis.android.dagger2;

import javax.inject.Inject;

/**
 * @author Oasis Yao
 *         Created on 2017/2/28.
 */

public class Car {

    @Inject
    Engine engine;

    public Car(){
        DaggerCarComponent.builder().build().injectCar(this);
    }
}
