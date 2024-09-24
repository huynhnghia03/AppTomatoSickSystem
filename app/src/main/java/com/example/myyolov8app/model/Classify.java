package com.example.myyolov8app.model;

public class Classify {
    public String Filename;
    public kind Info;
    public String msg;
    public Boolean video;

    public  String date;
    public Boolean success;
//    {
//        "Filename": "/static/yolov8/yolov8RaBPMgYy.jpg",
//            "Info": {
//        "EarlyBlight": 2,
//                "Healthy": 2,
//                "LateBlight": 9,
//                "LeafMiner": 2,
//                "LeafMold": 14,
//                "MosaicVirus": 5,
//                "Septoria": 4,
//                "SpiderMites": 0,
//                "YellowLeafCurlVirus": 2,
//                "total": 40
//    },
//        "date": "Sun, 22 Sep 2024 00:00:00 GMT",
//            "msg": "File predict successfully",
//            "success": true,
//            "video": false

    public Classify(String filename, kind info, String msg, Boolean video, Boolean success) {
        this.Filename = filename;
        this.Info = info;
        this.msg = msg;
        this.video = video;
        this.success = success;
    }

    public Classify(String filename, kind info, String msg, Boolean video, String date, Boolean success) {
        Filename = filename;
        this.Info = info;
        this.msg = msg;
        this.video = video;
        this.date = date;
        this.success = success;
    }

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String filename) {
        this.Filename = filename;
    }

    public kind getInfo() {
        return Info;
    }

    public void setInfo(kind info) {
        Info = info;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "Filename='" + Filename + '\'' +
                ", Info=" + Info +
                ", msg='" + msg + '\'' +
                ", video=" + video +
                ", date='" + date + '\'' +
                ", success=" + success +
                '}';
    }
}
