package com.znzb.partybuilding.netframe.bean;

import java.io.Serializable;
import java.util.List;

public class CalendarBean {
    /**
     * msg : 请求成功
     * code : 1
     * data : {"records":[{"createTime":1621647555,"id":58,"day":20210522,"userId":968},{"createTime":1621570198,"id":56,"day":20210521,"userId":968},{"createTime":1621472656,"id":54,"day":20210520,"userId":968},{"createTime":1621387696,"id":52,"day":20210519,"userId":968},{"createTime":1621300410,"id":46,"day":20210518,"userId":968},{"createTime":1621252423,"id":44,"day":20210517,"userId":968},{"createTime":1620891363,"id":36,"day":20210513,"userId":968},{"createTime":1620794043,"id":34,"day":20210512,"userId":968},{"createTime":1620793940,"id":32,"day":20210510,"userId":968},{"createTime":1620793906,"id":30,"day":20210511,"userId":968}],"signCount":20,"lastDay":20210522,"id":6,"userId":968}
     */

    private String msg;
    private int code;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * records : [{"createTime":1621647555,"id":58,"day":20210522,"userId":968},{"createTime":1621570198,"id":56,"day":20210521,"userId":968},{"createTime":1621472656,"id":54,"day":20210520,"userId":968},{"createTime":1621387696,"id":52,"day":20210519,"userId":968},{"createTime":1621300410,"id":46,"day":20210518,"userId":968},{"createTime":1621252423,"id":44,"day":20210517,"userId":968},{"createTime":1620891363,"id":36,"day":20210513,"userId":968},{"createTime":1620794043,"id":34,"day":20210512,"userId":968},{"createTime":1620793940,"id":32,"day":20210510,"userId":968},{"createTime":1620793906,"id":30,"day":20210511,"userId":968}]
         * signCount : 20
         * lastDay : 20210522
         * id : 6
         * userId : 968
         */

        private int signCount;
        private int lastDay;
        private int id;
        private int userId;
        private List<RecordsBean> records;

        public int getSignCount() {
            return signCount;
        }

        public void setSignCount(int signCount) {
            this.signCount = signCount;
        }

        public int getLastDay() {
            return lastDay;
        }

        public void setLastDay(int lastDay) {
            this.lastDay = lastDay;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
            this.records = records;
        }

        public static class RecordsBean implements Serializable {
            /**
             * createTime : 1621647555
             * id : 58
             * day : 20210522
             * userId : 968
             */

            private int createTime;
            private int id;
            private int day;
            private int userId;

            public int getCreateTime() {
                return createTime;
            }

            public void setCreateTime(int createTime) {
                this.createTime = createTime;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }
        }
    }
}
