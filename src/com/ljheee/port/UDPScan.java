package com.ljheee.port;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Description: 查询端口的占用情 
 */
public class UDPScan {

    public static void main(String[] args) {

        //2014~65535
        for (int port = 1024; port < 65536; port++) {
            try {
                DatagramSocket server = new DatagramSocket(port);
                server.close();
            } catch (SocketException e) {
            	//输出  已被占用的端口
                System.out.println("there is a server in port:" + port + ".");
            }
        }
    }
}
