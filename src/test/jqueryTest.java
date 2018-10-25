package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/15.
 */
@WebServlet(name = "jqueryTest",urlPatterns = "/jqueryTest")
public class jqueryTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String val=request.getParameter("val");
        System.out.println("jquery传来的值："+name+"，val："+val);
        response.setCharacterEncoding("utf-8");
        response.getWriter().println("来自服务器端的servlet的回应");
        response.flushBuffer();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String val=request.getParameter("val");
        System.out.println("jquery传来的值："+name+"，val："+val);
        response.setCharacterEncoding("utf-8");
        response.getWriter().println("来自服务器端的servlet的回应");
        response.flushBuffer();
    }
}
