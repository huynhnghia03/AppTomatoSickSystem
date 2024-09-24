package com.example.myyolov8app.model;

import java.util.ArrayList;

public class HisTomato {
    private  Boolean auth;
    private ArrayList<String[]> datas;
    private int total;

    private int bacterial_spot;
    private int early_blight;
    private int healthy;
    private int late_blight;
    private int leaf_mold;
    private int septoria_leaf_spot;
    private int spider_mites;
    private int target_spot;
    private int mosaic_virus;
    private int yellow_leaf_curl_virus;
    private int sumImgs;
    public HisTomato(Boolean auth) {
        this.auth = auth;
    }

    public HisTomato(ArrayList<String[]> datas, int total, int bacterial_spot, int early_blight, int healthy, int late_blight, int leaf_mold, int septoria_leaf_spot, int spider_mites, int target_spot, int mosaic_virus, int yellow_leaf_curl_virus) {
        this.datas = datas;
        this.total = total;
        this.bacterial_spot = bacterial_spot;
        this.early_blight = early_blight;
        this.healthy = healthy;
        this.late_blight = late_blight;
        this.leaf_mold = leaf_mold;
        this.septoria_leaf_spot = septoria_leaf_spot;
        this.spider_mites = spider_mites;
        this.target_spot = target_spot;
        this.mosaic_virus = mosaic_virus;
        this.yellow_leaf_curl_virus = yellow_leaf_curl_virus;
    }

    public HisTomato(int total, int bacterial_spot, int early_blight, int healthy, int late_blight, int leaf_mold, int septoria_leaf_spot, int spider_mites, int target_spot, int mosaic_virus, int yellow_leaf_curl_virus, int sumImgs) {
        this.total = total;
        this.bacterial_spot = bacterial_spot;
        this.early_blight = early_blight;
        this.healthy = healthy;
        this.late_blight = late_blight;
        this.leaf_mold = leaf_mold;
        this.septoria_leaf_spot = septoria_leaf_spot;
        this.spider_mites = spider_mites;
        this.target_spot = target_spot;
        this.mosaic_virus = mosaic_virus;
        this.yellow_leaf_curl_virus = yellow_leaf_curl_virus;
        this.sumImgs = sumImgs;
    }

    public HisTomato(Boolean auth, ArrayList<String[]> datas, int total, int bacterial_spot, int early_blight, int healthy, int late_blight, int leaf_mold, int septoria_leaf_spot, int spider_mites, int target_spot, int mosaic_virus, int yellow_leaf_curl_virus) {
        this.auth = auth;
        this.datas = datas;
        this.total = total;
        this.bacterial_spot = bacterial_spot;
        this.early_blight = early_blight;
        this.healthy = healthy;
        this.late_blight = late_blight;
        this.leaf_mold = leaf_mold;
        this.septoria_leaf_spot = septoria_leaf_spot;
        this.spider_mites = spider_mites;
        this.target_spot = target_spot;
        this.mosaic_virus = mosaic_virus;
        this.yellow_leaf_curl_virus = yellow_leaf_curl_virus;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBacterial_spot() {
        return bacterial_spot;
    }

    public void setBacterial_spot(int bacterial_spot) {
        this.bacterial_spot = bacterial_spot;
    }

    public int getEarly_blight() {
        return early_blight;
    }

    public void setEarly_blight(int early_blight) {
        this.early_blight = early_blight;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getLate_blight() {
        return late_blight;
    }

    public void setLate_blight(int late_blight) {
        this.late_blight = late_blight;
    }

    public int getLeaf_mold() {
        return leaf_mold;
    }

    public void setLeaf_mold(int leaf_mold) {
        this.leaf_mold = leaf_mold;
    }

    public int getSeptoria_leaf_spot() {
        return septoria_leaf_spot;
    }

    public void setSeptoria_leaf_spot(int septoria_leaf_spot) {
        this.septoria_leaf_spot = septoria_leaf_spot;
    }

    public int getSpider_mites() {
        return spider_mites;
    }

    public void setSpider_mites(int spider_mites) {
        this.spider_mites = spider_mites;
    }

    public int getTarget_spot() {
        return target_spot;
    }

    public void setTarget_spot(int target_spot) {
        this.target_spot = target_spot;
    }

    public int getMosaic_virus() {
        return mosaic_virus;
    }

    public void setMosaic_virus(int mosaic_virus) {
        this.mosaic_virus = mosaic_virus;
    }

    public int getYellow_leaf_curl_virus() {
        return yellow_leaf_curl_virus;
    }

    public void setYellow_leaf_curl_virus(int yellow_leaf_curl_virus) {
        this.yellow_leaf_curl_virus = yellow_leaf_curl_virus;
    }

    public int getSumImgs() {
        return sumImgs;
    }

    public void setSumImgs(int sumImgs) {
        this.sumImgs = sumImgs;
    }

    @Override
    public String toString() {
        return "HisTomato{" +
                "auth=" + auth +
                ", datas=" + datas +
                ", total=" + total +
                ", bacterial_spot=" + bacterial_spot +
                ", early_blight=" + early_blight +
                ", healthy=" + healthy +
                ", late_blight=" + late_blight +
                ", leaf_mold=" + leaf_mold +
                ", septoria_leaf_spot=" + septoria_leaf_spot +
                ", spider_mites=" + spider_mites +
                ", target_spot=" + target_spot +
                ", mosaic_virus=" + mosaic_virus +
                ", yellow_leaf_curl_virus=" + yellow_leaf_curl_virus +
                ", sumImgs=" + sumImgs +
                '}';
    }
}
