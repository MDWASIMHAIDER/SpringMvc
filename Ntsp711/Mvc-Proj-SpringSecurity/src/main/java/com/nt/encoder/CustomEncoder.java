package com.nt.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CustomEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder =
                new BCryptPasswordEncoder(11);
//String hashedPwd1 = passwordEncoder.encode("wasim91");
//String hashedPwd2 = passwordEncoder.encode("bharat91");
String hashedPwd3 = passwordEncoder.encode("rahul91");
//System.out.println(hashedPwd1);
//System.out.println(hashedPwd2);
System.out.println(hashedPwd3);

	}

}
