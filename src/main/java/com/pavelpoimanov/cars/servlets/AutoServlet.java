package com.pavelpoimanov.cars.servlets;

import com.pavelpoimanov.cars.actions.PageAction;
import com.pavelpoimanov.cars.model.Auto;
import com.pavelpoimanov.cars.util.Connector;
import com.pavelpoimanov.cars.util.constants.PagePath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauluxxx on 19.02.2017.
 */

@WebServlet(name = "AutoServlet", urlPatterns = "/auto")
public class AutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection = Connector.getConnection();
        List<Auto> autos = new ArrayList<>();
        try {
            ResultSet resultSet = connection.createStatement().executeQuery("Select * from cars.auto");
            while (resultSet.next()) {
                Auto auto = new Auto();
                auto.persist(resultSet);
                autos.add(auto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("auto", autos.toString());
        PageAction pageAction = new PageAction(PagePath.Auto, true);
        response.setContentType("text/html;charset=UTF-8");
        if (pageAction.isForward()) {
            request.getRequestDispatcher(pageAction.getPage()).forward(request, response);
        } else {
            response.sendRedirect(pageAction.getPage());
        }
    }
}
