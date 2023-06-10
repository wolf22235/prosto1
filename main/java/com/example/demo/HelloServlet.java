package com.example.demo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("but");
        PrintWriter out = resp.getWriter();
        System.out.println(page);
        resp.setContentType("text/html");
        switch (page)
        {
            case ("1"):
                RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("index.jsp");
                requestDispatcher1.forward(req,resp);
                break;
            case ("2"):
                RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("about.jsp");
                requestDispatcher2.forward(req,resp);
                break;
            case ("3"):
                RequestDispatcher requestDispatcher3 = req.getRequestDispatcher("contact.jsp");
                requestDispatcher3.forward(req,resp);
                break;
            case ("4"):
                RequestDispatcher requestDispatcher4 = req.getRequestDispatcher("gallery.jsp");
                requestDispatcher4.forward(req,resp);
                break;
            case ("5"):
                RequestDispatcher requestDispatcher5 = req.getRequestDispatcher("blog.jsp");
                requestDispatcher5.forward(req,resp);
                break;
        }
    }
}
