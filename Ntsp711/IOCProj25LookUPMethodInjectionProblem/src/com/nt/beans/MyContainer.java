package com.nt.beans;
import com.nt.beans.RequestHandler;;
public class MyContainer {

	RequestHandler handler;
	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}

	public MyContainer() {
		System.out.println("mycontainer 0-param constructor");
	}
	
	public void processRequest(String data) {
		handler.handle(data);
	}

}
