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

public class NewGameServlet extends HttpServlet {

    public NewGameServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Session session =
                QueryConfiguration.getInstance().getFactory().openSession();

        Map<String, String[]> paramsMap = req.getParameterMap();
        UserEntityService firstUser = new UserEntityService(session);
        firstUser.getUserByEmail(paramsMap.get("e-mail")[0]).setIs_ready(true);

        /*
        TODO!
        THREAD!
        !! AT THIS MOMENT WILL BE CREATED A RUNNABLE COMPONENT !!
        Watching for users who had is_ready - true option.
        Gets this User.
        Creating the Session of User1 & User2 game.
        Send to users
        When the game has already started, we're handling the Post requests.
         */

    }

}
