package com.st.thrift;

import org.apache.thrift.TException;

/**
 * ʵ�ֽӿڵ�ҵ���߼���
 * @author �幫
 *
 */
public class SumServiceImp implements SumService.Iface{

	@Override
	public String getSum(int num1, int num2) throws TException {
		return num1 + num2 + "";
	}

}
