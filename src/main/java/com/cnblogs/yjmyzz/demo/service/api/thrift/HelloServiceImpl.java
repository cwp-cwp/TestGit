package com.cnblogs.yjmyzz.demo.service.api.thrift;

import org.apache.thrift.TException;

/**
 * 生成代码的接口实现
 * @author 叔公
 *
 */
public class HelloServiceImpl implements ThriftHelloService.Iface{

	@Override
	public String ping() throws TException {
		return "service call done: ThriftHelloService.ping()123456";
	}

}
