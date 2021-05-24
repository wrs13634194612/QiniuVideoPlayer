package com.znzb.partybuilding.netframe.login;


import com.znzb.partybuilding.netframe.base.BaseModelInterface;
import com.znzb.partybuilding.netframe.bean.LoginBean;

public interface LoginModelInter extends BaseModelInterface {

    void login(String username, String password, Response response);
    interface Response{
        void success(LoginBean loginBean);
    }
}
