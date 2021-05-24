package com.example.mepositry;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ListView;
import com.znzb.partybuilding.R;
import com.znzb.partybuilding.R;
import com.znzb.partybuilding.netframe.adapter.NewsAdapter;
import com.znzb.partybuilding.netframe.base.BaseActivity;
import com.znzb.partybuilding.netframe.bean.NewsBean;
import com.znzb.partybuilding.netframe.news.NewsPresenter;
import com.znzb.partybuilding.netframe.news.NewsViewInterface;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends BaseActivity<NewsPresenter> implements NewsViewInterface {
    private ListView list_two;
    private String id;

    private List<NewsBean.DataBean> list;
    private NewsAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        list_two = findViewById(R.id.list_two);
        Bundle receive = getIntent().getExtras();
        id = receive.getString("id");
        Log.e("TAG", "TwoActivity:" + id);
        presenter.checkNews(id, "1");
    }

    @Override
    public NewsPresenter getPresenter() {
        return new NewsPresenter();
    }

    @Override
    public void newsShow(NewsBean mNewsBean) {
        Log.e("TAG", "TwoActivity_newsShow:" + mNewsBean);
        list = new ArrayList<>();
        list.addAll(mNewsBean.getData());
        adapter = new NewsAdapter(getApplicationContext(), list);
        list_two.setAdapter(adapter);
    }
}
