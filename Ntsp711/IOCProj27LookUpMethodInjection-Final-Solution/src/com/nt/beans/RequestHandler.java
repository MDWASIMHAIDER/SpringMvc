package com.nt.beans;

public class RequestHandler {

	private static int count;
	public RequestHandler() {
		count++;
		System.out.println("request handler 0-param constrictor "+count);
	}
	public void handle(String data) {
		System.out.println("handle req  count->"+count+"  with data  "+data );
	}

}
