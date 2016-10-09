package servlets;

import beans.UserEntity;
import entityservices.QueryConfiguration;
import entityservices.UserEntityService;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * This servlet will handle the requests on the host/newgame address.
 * @author Kargin Nikita
 * @version 1.02
 *
 */

public class NewGameServlet extends HttpServlet {

    final private Logger logger = Logger.getLogger(NewGameServlet.class);

    public NewGameServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Getting user's email from request.
        String eMail = req.getParameter("email");
        logger.info(eMail);
        // Getting service for this entiry by the configuration at QueryConf.
        Session session = QueryConfiguration.getInstance().getFactory()
                .openSession();

        UserEntityService service = new UserEntityService(session);
        // Getting user by email from request.
        UserEntity requestedUser = service.getUserByEmail(eMail);

        /* For user, who even don't have entity at the db it will created.
        */

        session.close();

    }

}
