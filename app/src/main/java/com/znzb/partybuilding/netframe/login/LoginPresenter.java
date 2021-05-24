package com.znzb.partybuilding.netframe.login;

import com.znzb.partybuilding.netframe.base.BasePresenter;
import com.znzb.partybuilding.netframe.bean.LoginBean;

public class LoginPresenter extends BasePresenter<LoginViewInterface> {
    private LoginModel model = new LoginModel();

    public void checkLogin(String username, String password) {
        model.login(username, password, new LoginModelInter.Response() {
            @Override
            public void success(LoginBean loginBean) {
                mView.loginShow(loginBean);
            }
        });
    }
}
