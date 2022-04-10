package org.myWebApp;

// Andreza do Nascimento Pessoa Cb3012191
// Lidiane Souza Soares  CB3012026

import model.EmpDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);
        EmpDao.delete(id);
        response.sendRedirect("ViewServlet");
    }
}