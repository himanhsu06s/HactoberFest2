import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressAndHostName {

    public static void main(String[] args) {
        try {
            InetAddress myIP = InetAddress.getLocalHost();
            System.out.println("IP Address: " + myIP.getHostAddress());
            System.out.println("Host Name: " + myIP.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
