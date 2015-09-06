package at.htl.ejbdemo.cdi;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/names")
public class KontakteServlet extends HttpServlet {

    /**
     * Auswahl der injizierten Bean entweder mit
     *   - @Vetoed oder
     *   - Qualifier @Test
     */
    @Inject
    private KontakteHandler kontakteProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        for (String s : kontakteProvider.getKontaktNamen()) {
            resp.getWriter().write("<p>"+s+"</p>");
        }
    }
}


