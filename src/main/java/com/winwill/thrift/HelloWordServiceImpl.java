package com.winwill.thrift;

import java.util.Date;

import org.apache.thrift.TException;

/**
 * 生成代码的接口实现类
 * 
 * @author 叔公
 * 
 */
public class HelloWordServiceImpl implements HelloWordService.Iface {

	/**
	 * 实现这个方法完成具体的逻辑。
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
