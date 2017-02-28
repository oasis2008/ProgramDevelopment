package com.oasis.android.dagger2;

import dagger.Component;

/**
 * @author Oasis Yao
 *         Created on 2017/2/28.
 *         桥梁
 */
@Component
public interface CarComponent {
    void injectCar(Car car);
}
