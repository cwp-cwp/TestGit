package com.st.thrift;

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
public class TestClient1 {

	public static final String SERVER_IP = "127.0.0.1";
	public static final int SERVER_PORT = 8090;
	public static final int TIMEOUT = 30000;

	public static void main(String[] args) {

		TTransport transport = null;

		try {
			transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
			// Э��Ҫ�ͷ����һ��
			TProtocol protocol = new TBinaryProtocol(transport);
			SumService.Iface client = new SumService.Client(protocol);
			transport.open();
			// �����������ñ��ش���һ������ʵʵ���߼��ڷ�����
			String sum = client.getSum(100, 20);
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != transport) {
				transport.close();
			}
		}
	}
}