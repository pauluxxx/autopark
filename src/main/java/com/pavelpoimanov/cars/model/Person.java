package com.pavelpoimanov.cars.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by pauluxxx on 19.02.2017.
 */
public class Person {
    private int id;
    private String first_name;
    private String last_name;


    public Person() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("id=").append(id);
        sb.append(", first_name='").append(first_name).append('\'');
        sb.append(", last_name='").append(last_name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void persist(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            this.setId(resultSet.getInt("id"));
            this.setFirst_name(resultSet.getString(2));
            this.setLast_name(resultSet.getString(3));
        }
    }
}
