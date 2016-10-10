import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AuthorizationServlet;

import javax.servlet.http.HttpServlet;

/**
 *
 * This is a Main SeeBattle's server class.
 * Here is starts the Server on port 8080, at the local machine (at the debug-time)
 *
 * @version 1.0
 * @author Kargin Nikita (hei@spark-mail.ru)
 *
 */

public class Main extends HttpServlet {

    private final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        AuthorizationServlet authorizationServlet = new AuthorizationServlet();

        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);

        contextHandler.addServlet(new ServletHolder(authorizationServlet), "/authorize");

        int port = 8080;
        Server server = new Server(port);
        server.setHandler(contextHandler);
        try {

            server.start();
            server.join();

        } catch (Exception e) {

            logger.error("Problem with server starting");

        }

    }

}
