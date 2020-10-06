package com.pendtium.grafikaapp.ui.HalamanUtama;

public class Data {
    private String title;
    private int imageId;

    public Data(){

    }

    public Data(String title, int imageId){
        this.imageId = imageId;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getImageId(){
        return imageId;
    }

    public void setImageId(int imageId){
        this.imageId = imageId;
    }
}
