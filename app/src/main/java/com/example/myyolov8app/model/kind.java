package com.example.myyolov8app.model;

public class kind {
    private int total;
    private int EarlyBlight;
    private int Healthy;
    private int LateBlight;
    private int LeafMiner;
    private int LeafMold;
    private int MosaicVirus;
    private int Septoria;
    private int SpiderMites;
    private int YellowLeafCurlVirus;

    public kind(int total, int earlyBlight, int healthy, int lateBlight, int leafMiner, int leafMold, int mosaicVirus, int septoria, int spiderMites, int yellowLeafCurlVirus) {
        this.total = total;
        EarlyBlight = earlyBlight;
        Healthy = healthy;
        LateBlight = lateBlight;
        LeafMiner = leafMiner;
        LeafMold = leafMold;
        MosaicVirus = mosaicVirus;
        Septoria = septoria;
        SpiderMites = spiderMites;
        YellowLeafCurlVirus = yellowLeafCurlVirus;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getEarlyBlight() {
        return EarlyBlight;
    }

    public void setEarlyBlight(int earlyBlight) {
        EarlyBlight = earlyBlight;
    }

    public int getHealthy() {
        return Healthy;
    }

    public void setHealthy(int healthy) {
        Healthy = healthy;
    }

    public int getLateBlight() {
        return LateBlight;
    }

    public void setLateBlight(int lateBlight) {
        LateBlight = lateBlight;
    }

    public int getLeafMiner() {
        return LeafMiner;
    }

    public void setLeafMiner(int leafMiner) {
        LeafMiner = leafMiner;
    }

    public int getLeafMold() {
        return LeafMold;
    }

    public void setLeafMold(int leafMold) {
        LeafMold = leafMold;
    }

    public int getMosaicVirus() {
        return MosaicVirus;
    }

    public void setMosaicVirus(int mosaicVirus) {
        MosaicVirus = mosaicVirus;
    }

    public int getSeptoria() {
        return Septoria;
    }

    public void setSeptoria(int septoria) {
        Septoria = septoria;
    }

    public int getSpiderMites() {
        return SpiderMites;
    }

    public void setSpiderMites(int spiderMites) {
        SpiderMites = spiderMites;
    }

    public int getYellowLeafCurlVirus() {
        return YellowLeafCurlVirus;
    }

    public void setYellowLeafCurlVirus(int yellowLeafCurlVirus) {
        YellowLeafCurlVirus = yellowLeafCurlVirus;
    }

    @Override
    public String toString() {
        return "kind{" +
                "total=" + total +
                ", EarlyBlight=" + EarlyBlight +
                ", Healthy=" + Healthy +
                ", LateBlight=" + LateBlight +
                ", LeafMiner=" + LeafMiner +
                ", LeafMold=" + LeafMold +
                ", MosaicVirus=" + MosaicVirus +
                ", Septoria=" + Septoria +
                ", SpiderMites=" + SpiderMites +
                ", YellowLeafCurlVirus=" + YellowLeafCurlVirus +
                '}';
    }
}
