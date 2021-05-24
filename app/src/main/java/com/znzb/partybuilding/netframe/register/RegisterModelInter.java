package com.znzb.partybuilding.netframe.register;


import com.znzb.partybuilding.netframe.bean.LoginBean;

public interface RegisterModelInter{
    void register(String username, String password, String repassword, Response response);

    interface Response{
        void success(LoginBean loginBean);
    }
}
