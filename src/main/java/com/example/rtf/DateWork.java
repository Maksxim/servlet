package com.example.rtf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "DateWork", urlPatterns = "/")
public class DateWork extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>" +
                "<h1>Homework</h1>" +
                "<h2> <a href=\"/work1\">Work 1</a> , <a href=\"/work2\">Work 2</a> , <a href=\"/work3\">Work 3</a></h2>" +
                "</html>");
    }
}
