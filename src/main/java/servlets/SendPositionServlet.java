package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SendPositionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Gets session_id from request.
        // Check for the Session from db
        // Gets the shot
        // Add shot to the Field.
        // Check for the right shot.
        // Sending information to both users.

    }
}
