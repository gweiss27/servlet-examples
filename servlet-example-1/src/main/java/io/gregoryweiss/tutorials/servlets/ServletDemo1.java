package io.gregoryweiss.tutorials.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 6/20/18
 * @version $Id: $
 */
public class ServletDemo1 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello Servlet - This is an Http Get!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
