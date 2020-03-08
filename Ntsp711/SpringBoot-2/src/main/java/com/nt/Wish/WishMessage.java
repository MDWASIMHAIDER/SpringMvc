package com.nt.Wish;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishMessage {

	public WishMessage() {
		System.out.println("wishmessage 0-param constructor");
	}
	public void wishing() {
		System.out.println("hello how r you");
	}

}
