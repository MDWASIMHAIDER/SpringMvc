package com.nt.beans;

public class RequestHandler {

	private static int count;
	public RequestHandler() {
		count++;
		System.out.println("handler 0-param constructor");
	}
	public void handle(String data) {
		System.out.println("request "+count+" with data"+data );
	}

}
