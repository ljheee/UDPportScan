package com.ljheee.port;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Description: ��ѯ�˿ڵ�ռ���� 
 */
public class UDPScan {

    public static void main(String[] args) {

        //2014~65535
        for (int port = 1024; port < 65536; port++) {
            try {
                DatagramSocket server = new DatagramSocket(port);
                server.close();
            } catch (SocketException e) {
            	//���  �ѱ�ռ�õĶ˿�
                System.out.println("there is a server in port:" + port + ".");
            }
        }
    }
}
