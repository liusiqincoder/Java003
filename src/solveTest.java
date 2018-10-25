import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/10/4.
 */
@WebServlet(name = "/solveTest",urlPatterns = "/solveTest")
public class solveTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dopost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doget");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String str=request.getParameter("str");
        PrintWriter out=response.getWriter();
        out.println("你写的是"+str);
        out.flush();
    }
}
