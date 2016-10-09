package servlets;

import beans.UserEntity;
import entityservices.QueryConfiguration;
import entityservices.UserEntityService;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 *
 * This servlet will handle the requests on the host/newgame address.
 * @author Kargin Nikita
 * @version 1.02
 *
 */

public class NewGameServlet extends HttpServlet {

    public NewGameServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }

}
