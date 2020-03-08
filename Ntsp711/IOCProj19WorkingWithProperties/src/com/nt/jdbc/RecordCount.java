package com.nt.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class RecordCount {
	
	public static void main(String[] args)throws Exception {
		InputStream is=new FileInputStream("src/com/nt/commans/DBDetails.properties");
		Properties props=new Properties();
		props.load(is);
		Class.forName(props.getProperty("jdbc.driver"));
		Connection con=DriverManager.getConnection(props.getProperty("jdbc.url"),
		props.getProperty("db.user"),
		props.getProperty("db.pwd"));
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) from student1");
		int cnt=0;
		if(rs.next()) {
			cnt=rs.getInt(1);
		}
		System.out.println("record count is "+cnt);
		rs.close();
		st.close();
		con.close();
	}
}
