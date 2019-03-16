package com.cnblogs.yjmyzz.demo.service.api.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * �����
 * 
 * @author �幫
 * 
 */
public class HelloServiceServer {

	public static void main(String[] args) {
		try {
			// ���÷���˿�Ϊ 7911
			TServerSocket serverTransport = new TServerSocket(7911);
			// ����Э�鹤��Ϊ TBinaryProtocol.Factory
			TBinaryProtocol.Factory proFactory = new TBinaryProtocol.Factory();
			// ������������ Hello �����ʵ��
			TProcessor processor = new ThriftHelloService.Processor(
					new HelloServiceImpl());
			TThreadPoolServer.Args args1 = new TThreadPoolServer.Args(
					serverTransport);
			args1.processor(processor);
			args1.protocolFactory(proFactory);

			TServer server = new TThreadPoolServer(args1);
			System.out.println("Start server on port 7911...");
			server.serve();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
	}
}
