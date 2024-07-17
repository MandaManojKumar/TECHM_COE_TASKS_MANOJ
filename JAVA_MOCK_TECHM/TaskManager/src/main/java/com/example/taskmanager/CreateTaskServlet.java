
package com.example.taskmanager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CreateTaskServlet")
public class CreateTaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String dueDate = request.getParameter("dueDate");
        String priority = request.getParameter("priority");

        if (title == null || title.isEmpty() || description == null || description.isEmpty() ||
            dueDate == null || dueDate.isEmpty() || priority == null || priority.isEmpty()) {
        	response.sendRedirect("error.jsp");

            /*String errorRedirect = System.getenv("VSCODE_PROXY_URI") + "/error.jsp";
            response.sendRedirect(errorRedirect);*/
        } else {
            Task task = new Task(title, description, dueDate, priority);
            request.setAttribute("task", task);
            request.getRequestDispatcher("success.jsp").forward(request, response);
            /*String successRedirect = System.getenv("VSCODE_PROXY_URI") + "/success.jsp";
            response.sendRedirect(successRedirect);*/
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

