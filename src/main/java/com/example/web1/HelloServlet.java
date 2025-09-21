package com.example.web1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name == null || name.isBlank()) {
            name = "World";
        }
        request.setAttribute("userName", name);

        request.getRequestDispatcher("/hello.jsp").forward(request, response);

    }
}

