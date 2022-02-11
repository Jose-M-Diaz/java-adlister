package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (email.isEmpty() || password.isEmpty() || username.isEmpty() || DaoFactory.getUsersDao().findByUsername(username).getUsername() != null) {
            response.sendRedirect("/register");
        }else {
            // TODO: create a new user based off of the submitted information
            User user = new User(username, email, password);
            DaoFactory.getUsersDao().insert(user);
            // TODO: if a user was successfully created, send them to their profile
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        }
//        if (user) {
//            request.getSession().setAttribute("user", email);
//            request.getSession().setAttribute("user", username);
//            request.getSession().setAttribute("user", password);
//
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/register");
//        }
    }
}
