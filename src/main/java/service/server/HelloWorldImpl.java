package service.server;

import org.apache.thrift.TException;

/**
 * ʵ�ֽӿ�
 * @author �幫
 *
 */
public class HelloWorldImpl implements HelloWorld.Iface{

	@Override
	public String sendString(String para) throws TException {
		return para;
	}

}
