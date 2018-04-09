package webapp;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Inject
    private ExampleBean exampleBean;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


resp.getWriter().append("Login:  "+exampleBean.getLogin());
resp.getWriter().append("\r\nPassword:  "+exampleBean.getPassword());



//        resp.getWriter().append("Hello World! " + req.getMethod());
//
//        HttpSession session = req.getSession();
//
//        if (session.getValue("name") == null) {
//            session.putValue("name", " Hello world session");
//            resp.getWriter().append(" No session");
//        }else {
//            resp.getWriter().append((String) session.getValue("name"));
//        }
    }
}
