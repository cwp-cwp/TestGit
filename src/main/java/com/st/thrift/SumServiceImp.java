package com.st.thrift;

import org.apache.thrift.TException;

/**
 * 实现接口的业务逻辑层
 * @author 叔公
 *
 */
public class SumServiceImp implements SumService.Iface{

	@Override
	public String getSum(int num1, int num2) throws TException {
		return num1 + num2 + "";
	}

}
