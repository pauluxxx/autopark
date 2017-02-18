package com.pavelpoimanov.cars.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by pauluxxx on 18.02.2017.
 */
public class Auto {

    private int id;
    private String num;
    private String color;
    private String mark;

    public Auto() {
    }

    public int getPersone_id() {
        return persone_id;
    }

    public void setPersone_id(int persone_id) {
        this.persone_id = persone_id;
    }

    private int persone_id;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Auto{");
        sb.append("id=").append(id);
        sb.append(", num='").append(num).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", mark='").append(mark).append('\'');
        sb.append('}');
        return sb.toString();
    }

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


    public Auto(int id, String num, String color, String mark) {
        this.id = id;
        this.num = num;
        this.color = color;
        this.mark = mark;
    }

    public void persist(ResultSet resultSet) throws SQLException {
    this.setId(resultSet.getInt("id"));
        this.setNum(resultSet.getString("num"));
        this.setColor(resultSet.getString("color"));
        this.setMark(resultSet.getString("mark"));
        this.setPersone_id(resultSet.getInt("persone_id"));
    }
}
