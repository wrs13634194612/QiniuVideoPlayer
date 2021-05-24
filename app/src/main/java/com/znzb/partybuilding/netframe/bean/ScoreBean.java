package com.znzb.partybuilding.netframe.bean;

import java.io.Serializable;
import java.util.List;

public class ScoreBean {

    /**
     * msg : 请求成功
     * totalPoint : 426
     * usablePoint : 426
     * code : 1
     * data : [{"pointValue":2,"cycleMaxTimes":1,"alias":"登录","id":9,"actionDesc":"登录成功","cycleDesc":"每天","gotPoint":0,"actionRemark":"每日首次登录"},{"pointValue":1,"cycleMaxTimes":10,"alias":"阅读资讯","id":10,"actionDesc":"阅读资讯","cycleDesc":"一次性","gotPoint":0,"actionRemark":"每篇"},{"pointValue":1,"cycleMaxTimes":5,"alias":"收藏资讯","id":11,"actionDesc":"收藏资讯","cycleDesc":"一次性","gotPoint":0,"actionRemark":"每篇"},{"pointValue":2,"cycleMaxTimes":5,"alias":"资讯评论","id":13,"actionDesc":"资讯评论","cycleDesc":"一次性","gotPoint":0,"actionRemark":"每篇"},{"pointValue":1,"cycleMaxTimes":20,"alias":"学习卡片","id":14,"actionDesc":"学习卡片","cycleDesc":"每天","gotPoint":0,"actionRemark":"每张"},{"pointValue":3,"cycleMaxTimes":3,"alias":"发布党建圈动态","id":33,"actionDesc":"发布动态(个人)","cycleDesc":"每天","gotPoint":0,"actionRemark":"每条"},{"pointValue":10,"cycleMaxTimes":1,"alias":"登录学习强国","id":43,"actionDesc":"学习强国","cycleDesc":"每天","gotPoint":0,"actionRemark":"每日首次"},{"pointValue":1,"cycleMaxTimes":5,"alias":"动态评论","id":53,"actionDesc":"动态评论","cycleDesc":"一次性","gotPoint":0,"actionRemark":"每篇"}]
     */

    private String msg;
    private int totalPoint;
    private int usablePoint;
    private int code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public int getUsablePoint() {
        return usablePoint;
    }

    public void setUsablePoint(int usablePoint) {
        this.usablePoint = usablePoint;
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
         * pointValue : 2
         * cycleMaxTimes : 1
         * alias : 登录
         * id : 9
         * actionDesc : 登录成功
         * cycleDesc : 每天
         * gotPoint : 0
         * actionRemark : 每日首次登录
         */

        private int pointValue;
        private int cycleMaxTimes;
        private String alias;
        private int id;
        private String actionDesc;
        private String cycleDesc;
        private int gotPoint;
        private String actionRemark;

        public int getPointValue() {
            return pointValue;
        }

        public void setPointValue(int pointValue) {
            this.pointValue = pointValue;
        }

        public int getCycleMaxTimes() {
            return cycleMaxTimes;
        }

        public void setCycleMaxTimes(int cycleMaxTimes) {
            this.cycleMaxTimes = cycleMaxTimes;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getActionDesc() {
            return actionDesc;
        }

        public void setActionDesc(String actionDesc) {
            this.actionDesc = actionDesc;
        }

        public String getCycleDesc() {
            return cycleDesc;
        }

        public void setCycleDesc(String cycleDesc) {
            this.cycleDesc = cycleDesc;
        }

        public int getGotPoint() {
            return gotPoint;
        }

        public void setGotPoint(int gotPoint) {
            this.gotPoint = gotPoint;
        }

        public String getActionRemark() {
            return actionRemark;
        }

        public void setActionRemark(String actionRemark) {
            this.actionRemark = actionRemark;
        }
    }
}
