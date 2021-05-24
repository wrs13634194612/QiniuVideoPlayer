package com.example.mepositry;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.znzb.partybuilding.R;
import com.znzb.partybuilding.netframe.base.BaseActivity;
import com.znzb.partybuilding.netframe.register.RegisterViewInterface;
import com.znzb.partybuilding.netframe.bean.LoginBean;
import com.znzb.partybuilding.netframe.register.RegisterPresenter;

public class RegisterActivity extends BaseActivity<RegisterPresenter> implements RegisterViewInterface {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button = findViewById(R.id.regsiter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.checkRegister("wangrusheng",
                        "123456",
                        "123456");
            }
        });


    }

    @Override
    public RegisterPresenter getPresenter() {
        return new RegisterPresenter();
    }

    @Override
    public void registerShow(LoginBean loginBean) {
        Log.e("TAG","RegisterActivity_registerShow:"+loginBean);
    }

}
