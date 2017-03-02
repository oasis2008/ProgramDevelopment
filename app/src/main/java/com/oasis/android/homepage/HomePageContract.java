package com.oasis.android.homepage;

import com.oasis.android.BasePresenter;
import com.oasis.android.BaseView;

/**
 * @author Oasis Yao
 *         Created on 2017/3/2.
 */

public interface HomePageContract {

    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePresenter{
        void start();
    }
}
