package com.example.rtf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;

@WebServlet (name = "Work3", urlPatterns = "/work3")
public class Work3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>" +
                "<h1>Please provide date (YYYY-MM-DD):</h1>" +
                "<body>" +
                "<form action=\"/work3\" method=\"POST\">" +
                "<input type=\"text\" name=\"date\"><br>" +
                "<input type=\"submit\" value=\"Submit\"/>" +
                "</form>" +
                "</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date = req.getParameter("date");
        LocalDate dt = LocalDate.parse(date);
        int dayOfYear = dt.getDayOfYear();

        PrintWriter writer = resp.getWriter();
        writer.println("<html>" +
                "<h1>Please provide date (YYYY-MM-DD):</h1>" +
                "<body>" +
                "<form action=\"/work3\" method=\"POST\">" +
                "<input type=\"text\" name=\"date\"><br>" +
                "<input type=\"submit\" value=\"Submit\"/>" +
                "</form>" +
                "<h2>" + dayOfYear + " day" +"</h2>" +
                "</body>" +
                "</html>");
    }
}
