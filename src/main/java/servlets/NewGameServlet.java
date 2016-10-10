package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewGameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Getting the user's email from request.
        // Gets User-instance from db.
        // Watching for players who had is_ready!
        // Creating session for the Game.
        // Pulling the positions of Ships to the Server.

    }
}
