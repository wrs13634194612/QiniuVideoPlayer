package com.znzb.partybuilding.netframe.base;


import android.support.v4.app.Fragment;

public abstract class BaseFragment<T extends BasePresenter> extends Fragment implements BaseViewInterface {
    public T presenter = null;

    @Override
    public void onStart() {
        super.onStart();
        presenter = getPresenter();
        presenter.attach(this);//connect
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detach();     //break connect
    }

    public abstract T getPresenter();

}
