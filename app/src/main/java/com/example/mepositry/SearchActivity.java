package com.example.mepositry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.znzb.partybuilding.R;
import com.znzb.partybuilding.netframe.base.BaseActivity;
import com.znzb.partybuilding.netframe.search.SearchBean;
import com.znzb.partybuilding.netframe.search.SearchPresenter;
import com.znzb.partybuilding.netframe.search.SearchViewInterface;

public class SearchActivity extends BaseActivity<SearchPresenter> implements SearchViewInterface {
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        button = findViewById(R.id.btn_search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.search("党史教育");
            }
        });
    }

    @Override
    public SearchPresenter getPresenter() {
        return new SearchPresenter();
    }

    @Override
    public void searchShow(SearchBean searchBean) {
        Log.e("TAG", "SearchActivity_searchShow:" + searchBean);
    }
}
