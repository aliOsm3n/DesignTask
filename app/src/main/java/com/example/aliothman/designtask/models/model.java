package com.example.aliothman.designtask.models;

public class model {
    String text;
    int img;

    public void setText(String text) {
        this.text = text;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public int getImg() {
        return img;
    }

    public model(String text, int img) {
        this.text = text;
        this.img = img;
    }

    public model(String text) {
        this.text = text;
    }
}
