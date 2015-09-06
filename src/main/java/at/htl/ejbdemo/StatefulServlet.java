package at.htl.ejbdemo;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/counter")
public class StatefulServlet extends HttpServlet {

    @Inject
    private BeanManager beanManager;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        beanManager.incAccess();
        response.getWriter().write("<h1>Dein " + beanManager.getCountAccess() + ". Zugriff</h1>");
    }
}


