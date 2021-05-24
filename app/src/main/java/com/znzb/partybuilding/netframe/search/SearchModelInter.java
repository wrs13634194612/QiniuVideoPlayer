package com.znzb.partybuilding.netframe.search;



public interface SearchModelInter {
    void search(String text,Response response);

    interface Response{
        void success(SearchBean searchBean);
    }
}
