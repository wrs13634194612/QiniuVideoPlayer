package com.znzb.partybuilding.netframe.search;

import java.io.Serializable;
import java.util.List;

public class SearchBean {
    /**
     * msg : 请求成功
     * code : 1
     * data : [{"favorites":0,"comments":0,"smallImg":"http://znzb.test/template/1/znzb/_files/img/nopic.jpg","author":"","publishDate":1621136432000,"description":"党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容","allowComment":true,"title":"党史教育测试标题","url":"http://znzb.test/api/info/html/7043","allowShare":true,"hasRead":0,"id":7043,"diggs":0,"pics":[],"nodeId":387},{"favorites":936,"comments":1748,"smallImg":"http://znzb.test/uploads/1/image/public/201807/20180704111711_6xwghxlatn.jpg","author":"集团党委","publishDate":1530260392000,"description":"6月20、24日下午，智能装备集团及旗下广日股份等公司组织专场观看中共党史电影《大会师》\u201c主题党日\u201d活动，重温红色岁月、传承红色基因，聚集强大正能量。智能装备集团各企业党员、预备党员代表近500人参加了党日活动并观看了电影。","allowComment":true,"title":"重温红色岁月 传承红色基因--广州智能装备集团及旗下成员企业组织观看中共党史教育电影活动","url":"http://znzb.test/api/info/html/1252","allowShare":true,"hasRead":0,"id":1252,"diggs":0,"pics":[],"nodeId":181}]
     */

    private String msg;
    private int code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * favorites : 0
         * comments : 0
         * smallImg : http://znzb.test/template/1/znzb/_files/img/nopic.jpg
         * author :
         * publishDate : 1621136432000
         * description : 党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容党史教育内容
         * allowComment : true
         * title : 党史教育测试标题
         * url : http://znzb.test/api/info/html/7043
         * allowShare : true
         * hasRead : 0
         * id : 7043
         * diggs : 0
         * pics : []
         * nodeId : 387
         */

        private int favorites;
        private int comments;
        private String smallImg;
        private String author;
        private long publishDate;
        private String description;
        private boolean allowComment;
        private String title;
        private String url;
        private boolean allowShare;
        private int hasRead;
        private int id;
        private int diggs;
        private int nodeId;
        private List<?> pics;

        public int getFavorites() {
            return favorites;
        }

        public void setFavorites(int favorites) {
            this.favorites = favorites;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public String getSmallImg() {
            return smallImg;
        }

        public void setSmallImg(String smallImg) {
            this.smallImg = smallImg;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public long getPublishDate() {
            return publishDate;
        }

        public void setPublishDate(long publishDate) {
            this.publishDate = publishDate;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isAllowComment() {
            return allowComment;
        }

        public void setAllowComment(boolean allowComment) {
            this.allowComment = allowComment;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isAllowShare() {
            return allowShare;
        }

        public void setAllowShare(boolean allowShare) {
            this.allowShare = allowShare;
        }

        public int getHasRead() {
            return hasRead;
        }

        public void setHasRead(int hasRead) {
            this.hasRead = hasRead;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDiggs() {
            return diggs;
        }

        public void setDiggs(int diggs) {
            this.diggs = diggs;
        }

        public int getNodeId() {
            return nodeId;
        }

        public void setNodeId(int nodeId) {
            this.nodeId = nodeId;
        }

        public List<?> getPics() {
            return pics;
        }

        public void setPics(List<?> pics) {
            this.pics = pics;
        }
    }
}
