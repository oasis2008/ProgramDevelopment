package com.oasis.android.homepage;

import android.content.Context;

import com.oasis.android.ActivityScope;

import javax.inject.Inject;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */
@ActivityScope
public class HomePagePresenter implements HomePageContract.Presenter{

    private HomePageContract.View view;
    private Context context;

    @Inject
    HomePagePresenter(Context context,HomePageContract.View view) {
        this.context = context;
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }

    public void run(){
        System.out.println("this is Running!!!!!");
    }

    @Override
    public void start() {
        System.out.println("this is start!!!!!");
    }
}
