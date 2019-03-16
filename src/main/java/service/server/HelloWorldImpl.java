package service.server;

import org.apache.thrift.TException;

/**
 * 实现接口
 * @author 叔公
 *
 */
public class HelloWorldImpl implements HelloWorld.Iface{

	@Override
	public String sendString(String para) throws TException {
		return para;
	}

}
