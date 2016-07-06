# UDPportScan
UDPportScan----An sample example to scan port,which is occupied.
利用 创建套接字，指定端口
 DatagramSocket server = new DatagramSocket(port);
 若端口已被占用，则会抛异常。