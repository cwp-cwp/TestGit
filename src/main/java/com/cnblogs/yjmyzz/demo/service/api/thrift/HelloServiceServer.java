package com.cnblogs.yjmyzz.demo.service.api.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * 服务端
 * 
 * @author 叔公
 * 
 */
public class HelloServiceServer {

	public static void main(String[] args) {
		try {
			// 设置服务端口为 7911
			TServerSocket serverTransport = new TServerSocket(7911);
			// 设置协议工厂为 TBinaryProtocol.Factory
			TBinaryProtocol.Factory proFactory = new TBinaryProtocol.Factory();
			// 关联处理器与 Hello 服务的实现
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
