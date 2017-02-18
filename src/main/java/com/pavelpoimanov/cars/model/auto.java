package com.pavelpoimanov.cars.model;

/**
 * Created by pauluxxx on 18.02.2017.
 */
public class auto {

    private int id;
    private String num;
    private String color;
    private String mark;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    public auto(int id, String num, String color, String mark) {
        this.id = id;
        this.num = num;
        this.color = color;
        this.mark = mark;
    }

}
