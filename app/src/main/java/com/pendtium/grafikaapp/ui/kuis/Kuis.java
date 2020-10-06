package com.pendtium.grafikaapp.ui.kuis;

public class Kuis {
    private String Title;
    private int Thumbnail;
    private int Thumbnail2;


    public Kuis(String title, int thumbnail, int thumbnail2) {
        Title = title;
        Thumbnail = thumbnail;
        Thumbnail2 = thumbnail2;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }
    public int getThumbnail2() {
        return Thumbnail2;
    }


}
