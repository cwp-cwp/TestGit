package com.cnblogs.yjmyzz.demo.service.api.thrift;

import org.apache.thrift.TException;

/**
 * ���ɴ���Ľӿ�ʵ��
 * @author �幫
 *
 */
public class HelloServiceImpl implements ThriftHelloService.Iface{

	@Override
	public String ping() throws TException {
		return "service call done: ThriftHelloService.ping()123456";
	}

}
