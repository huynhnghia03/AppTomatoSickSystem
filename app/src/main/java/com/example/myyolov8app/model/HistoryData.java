package com.example.myyolov8app.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HistoryData {
    private  Boolean auth;
    private ArrayList<String[]> datas;
    private kind kind;
    public HistoryData(Boolean auth) {
        this.auth = auth;
    }

    public HistoryData(ArrayList<String[]> datas, kind kind) {
        this.datas =  datas;
        this.kind= kind;
    }

    public HistoryData(kind kind) {
        this.kind=kind;
    }

    public HistoryData(Boolean auth, ArrayList<String[]> datas, kind kind) {
        this.auth = auth;
        this.datas = datas;
        this.kind=kind;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public ArrayList<String[]> getDatas() {
        return datas;
    }

    public void setDatas(ArrayList<String[]> datas) {
        this.datas = datas;
    }

    public com.example.myyolov8app.model.kind getKind() {
        return kind;
    }

    public void setKind(com.example.myyolov8app.model.kind kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "HistoryData{" +
                "auth=" + auth +
                ", datas=" + datas +
                ", kind=" + kind +
                '}';
    }
}
