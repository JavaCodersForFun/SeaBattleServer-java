import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class MainTest {

    @Test
    public void checkConnection() {

        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 8080);
            Assert.assertEquals(socket.isConnected(), true);
            System.out.println("Successfully Connected!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
