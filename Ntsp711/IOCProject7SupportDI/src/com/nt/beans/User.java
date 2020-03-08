package com.nt.beans;

import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

public class User {
			
			private Set<String> phoneNummber;
			private java.util.Date dat=null;
			/*private Arrays address=null;*/
			private String[]  address=null;
			private Properties userDetail;
			private String education;
		
			public void User(String education) {
				this.education=education;
			}
			public void setUserDetail(Properties userDetail) {
				this.userDetail = userDetail;
			}

			public void setAddress(String[] address) {
				this.address = address;
			}

			public void setPhoneNummber(Set<String> phoneNummber) {
				this.phoneNummber = phoneNummber;
			}

			public void setDat(java.util.Date dat) {
				this.dat = dat;
			}
			@Override
			public String toString() {
				return "User [phoneNummber=" + phoneNummber + ", dat=" + dat + ", address=" + Arrays.toString(address)
						+ ", userDetail=" + userDetail + ", education=" + education + "]";
			}

			
}
