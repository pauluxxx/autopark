package com.pavelpoimanov.cars.util;

import com.pavelpoimanov.cars.util.constants.JDBCConnection;

import java.sql.*;

/**
 * Created by pauluxxx on 18.02.2017.
 */
public class Connector {

    private  static Connection  connection;

    public synchronized  static  Connection getConnection(){
    if (connection == null){
        try {
            Class.forName(JDBCConnection.DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(JDBCConnection.URI,JDBCConnection.USER,JDBCConnection.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return  connection;
    }
    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void close(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
