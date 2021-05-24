package com.znzb.partybuilding.netframe.search;


import com.znzb.partybuilding.netframe.base.BasePresenter;

public class SearchPresenter extends BasePresenter<SearchViewInterface> {
    private SearchModel model = new SearchModel();

    public void search(String text){
        model.search(text, new SearchModelInter.Response() {
            @Override
            public void success(SearchBean searchBean) {
                mView.searchShow(searchBean);
            }
        });
    }
}
