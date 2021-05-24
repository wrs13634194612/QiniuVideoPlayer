package com.znzb.partybuilding.netframe.register;


import com.znzb.partybuilding.netframe.bean.LoginBean;
import com.znzb.partybuilding.netframe.base.BasePresenter;

public class RegisterPresenter extends BasePresenter<RegisterViewInterface> {
    private RegisterModel model = new RegisterModel();

    public void checkRegister(String username, String password, String repassword){
        model.register(username, password, repassword, new RegisterModelInter.Response() {
            @Override
            public void success(LoginBean loginBean) {
                mView.registerShow(loginBean);
            }
        });
    }
}
