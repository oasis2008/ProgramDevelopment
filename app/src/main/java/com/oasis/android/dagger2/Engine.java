package com.oasis.android.dagger2;

import javax.inject.Inject;

/**
 * @author Oasis Yao
 *         Created on 2017/2/28.
 */

public class Engine {

    @Inject
    Engine(){
    }

    public void run(){
        System.out.println("引擎启动了~~~~");
    }

}
