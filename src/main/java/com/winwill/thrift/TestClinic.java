package com.winwill.thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * �ͻ���
 * 
 * @author �幫
 * 
 */
public class TestClinic {

	public static void main(String[] args) throws Exception {
		TTransport transport = new TSocket("localhost", 8090);
		TProtocol protocol = new TBinaryProtocol(transport);

		// ����client
		HelloWordService.Client client = new HelloWordService.Client(protocol);

		transport.open(); // ��������

		// ��һ����������
		com.winwill.thrift.Request request = new com.winwill.thrift.Request()
				.setType(com.winwill.thrift.RequestType.SAY_HELLO)
				.setName("winwill2012").setAge(24);
		System.out.println(client.doAction(request));

		// �ڶ�����������
		request.setType(com.winwill.thrift.RequestType.QUERY_TIME).setName(
				"winwill2012");
		System.out.println(client.doAction(request));

		transport.close(); // ����������Ͽ�����
	}
}
