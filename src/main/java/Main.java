import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

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

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        /*
            There's will be the point where all Servlets will be created by
            Servlet's Factory.
         */

        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        /*
            No servlets this time.
         */

        Server server = new Server(8080);
        try {

            server.start();
            server.join();

        } catch (Exception e) {

            logger.error("ERROR! Problem with server starting");

        }

    }

}
