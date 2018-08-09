package net.javatutorial.tutorials;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Gregory Weiss (gw186023)
 * Date: 6/20/18
 * @version $Id: $
 */
public class SimpleServlet extends HttpServlet
{
    private static final long serialVersionUID = -4751096228274971485L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.getWriter().println("Hello World!");
    }

    @Override
    public void init() throws ServletException
    {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    public void destroy()
    {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
