package com.st.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * �����
 * 
 * @author �幫
 * 
 */
public class TestServer1 {

	public static final int PORT = 8090;

	public static void main(String[] args) {

		try {
			System.out.println("����˿���");
			TProcessor tProcessor = new SumService.Processor<SumService.Iface>(
					new SumServiceImp());
			// �򵥵ĵ��̷߳���ģ��
			TServerSocket serverTransport = new TServerSocket(PORT);
			TServer.Args tArgs = new TServer.Args(serverTransport);
			tArgs.processor(tProcessor);
			tArgs.protocolFactory(new TBinaryProtocol.Factory());
			TServer server = new TSimpleServer(tArgs);
			server.serve();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
	}
}
