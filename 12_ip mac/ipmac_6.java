import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Arrays;

public class ipmac_6 {

    public static void main(String[] args) throws Exception {
        InetAddress localhost = InetAddress.getLocalHost();
        NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localhost);
        byte[] macAddress = networkInterface.getHardwareAddress();

        System.out.println("IP Address: " + localhost.getHostAddress());
        System.out.println("MAC Address: " + Arrays.toString(macAddress));
    }
}