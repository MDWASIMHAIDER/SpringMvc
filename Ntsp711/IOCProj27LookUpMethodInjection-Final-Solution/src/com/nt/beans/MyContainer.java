package com.nt.beans;

public abstract class MyContainer {

	public MyContainer() {
		System.out.println("container 0-param constructor");
	}
	public void processRequest(String data) {
		RequestHandler handler=getRequestHandler();
		handler.handle(data);
	}
	public abstract  RequestHandler getRequestHandler();

}
