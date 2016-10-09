package servlets;

import entityservices.QueryConfiguration;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewGameServlet extends HttpServlet {

    public NewGameServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Session session =
                QueryConfiguration.getInstance().getFactory().openSession();


    }

}
