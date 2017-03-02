package com.oasis.android.homepage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.oasis.android.ProgramApplication;
import com.oasis.android.R;

import javax.inject.Inject;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */

public class HomePageActivity extends AppCompatActivity implements HomePageContract.View{

    @Inject
    HomePagePresenter homePagePresenter;

    HomePageContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerHomePageComponent.builder()
                .applicationComponent(ProgramApplication.getInstance().getApplicationComponent())
                .homePageModule(new HomePageModule(this)).build()
                .inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.start();
    }

    @Override
    public void setPresenter(HomePageContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
