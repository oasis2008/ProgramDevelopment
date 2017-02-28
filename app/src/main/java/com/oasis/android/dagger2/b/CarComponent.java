package com.oasis.android.dagger2.b;

import dagger.Component;

/**
 * @author Oasis Yao
 *         Created on 2017/2/28.
 */

@Component(modules = {MarkCarModule.class})
public interface CarComponent {
    void injectCar(Car car);
}
