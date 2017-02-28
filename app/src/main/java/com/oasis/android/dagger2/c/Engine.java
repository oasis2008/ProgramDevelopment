package com.oasis.android.dagger2.c;

/**
 * @author Oasis Yao
 *         Created on 2017/2/28.
 */

public class Engine {
    private String name;

    public Engine(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name + " is running!!!" );
    }

}
