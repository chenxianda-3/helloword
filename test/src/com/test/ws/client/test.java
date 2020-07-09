package com.test.ws.client;

public class test {
	public static void main(String[] args) {
		HelloServiceService ss = new HelloServiceService();
		//创建客户端代理对象，用于远程调用
		HelloService proxy = ss.getHelloServicePort();
		String ret = proxy.sayHello("小明", 10);
		System.out.println(ret);
	}


}
