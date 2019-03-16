package com.winwill.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * 服务端
 * 
 * @author 叔公
 * 
 */
public class TestServer {
	public static final int PORT = 8090;

	public static void main(String[] args) {

		try {
			System.out.println("服务端开启");
			TProcessor tProcessor = new HelloWordService.Processor<HelloWordService.Iface>(
					new HelloWordServiceImpl());
			// 简单的单线程服务模型
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
