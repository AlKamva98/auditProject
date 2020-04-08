package com.java.createaccount.controller;

import com.java.createaccount.doa.LecturerDoa;
import com.java.createaccount.model.Lecturer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createAnAccount")
public class LecturerServlet extends HttpServlet {

   // private LecturerDoa lecturerDoa = new LecturerDoa();


    public LecturerServlet(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/web/createAnAccount.jsp");
        dispatcher.forward(request, response);
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String lectName = request.getParameter("lectName");
        String lectEmailAd = request.getParameter("lectEmailAd");
        String lectUniNo = request.getParameter("lectUniNo");
        String lectUniPassw = request.getParameter("lectUniPassw");

        Lecturer lecturer = new Lecturer();
        lecturer.setLectName(lectName);
        lecturer.setLectEmailAd(lectEmailAd);
        lecturer.setLectUniNo(lectUniNo);
        lecturer.setLectUniPassw(lectUniPassw);

        LecturerDoa lecturerDoa = new LecturerDoa();
        try {
            lecturerDoa.createLecturerAccount(lecturer);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
