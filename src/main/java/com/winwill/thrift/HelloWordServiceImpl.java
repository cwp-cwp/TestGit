package com.winwill.thrift;

import java.util.Date;

import org.apache.thrift.TException;

/**
 * ���ɴ���Ľӿ�ʵ����
 * 
 * @author �幫
 * 
 */
public class HelloWordServiceImpl implements HelloWordService.Iface {

	/**
	 * ʵ�����������ɾ�����߼���
	 */
	@Override
	public String doAction(com.winwill.thrift.Request request)
			throws com.winwill.thrift.RequestException, TException {
		System.out.println("Get request: " + request);
		if (request.getName().trim() == "" || request.getType() == null) {
			throw new com.winwill.thrift.RequestException();
		}
		String result = "Hello, " + request.getName();
		if (request.getType() == com.winwill.thrift.RequestType.SAY_HELLO) {
			result += ", Welcome!";
		} else {
			result += ", Now is " + new Date().toLocaleString();
		}
		return result;
	}

}
