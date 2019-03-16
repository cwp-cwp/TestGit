package com.winwill.thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * 客户端
 * 
 * @author 叔公
 * 
 */
public class TestClinic {

	public static void main(String[] args) throws Exception {
		TTransport transport = new TSocket("localhost", 8090);
		TProtocol protocol = new TBinaryProtocol(transport);

		// 创建client
		HelloWordService.Client client = new HelloWordService.Client(protocol);

		transport.open(); // 建立连接

		// 第一种请求类型
		com.winwill.thrift.Request request = new com.winwill.thrift.Request()
				.setType(com.winwill.thrift.RequestType.SAY_HELLO)
				.setName("winwill2012").setAge(24);
		System.out.println(client.doAction(request));

		// 第二种请求类型
		request.setType(com.winwill.thrift.RequestType.QUERY_TIME).setName(
				"winwill2012");
		System.out.println(client.doAction(request));

		transport.close(); // 请求结束，断开连接
	}
}
