package com.nt.test;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.Property;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		List<String>list1=null;
		List<Date>list2=null;
		Set<String>set1=null;
		Set<Date>set2=null;
		Map<String,Date>map=null;
		Properties prop1=null,prop2=null;
		Float mpi=null;
		list1=ctx.getBean("list1",List.class);
		System.out.println(list1+" "+list1.getClass());
		list2=ctx.getBean("list2",List.class);
		System.out.println(list2+" "+list1.getClass());
		set1=ctx.getBean("set1",Set.class);
		System.out.println(set1+" "+set1.getClass());
		set2=ctx.getBean("set2",Set.class);
		System.out.println(set2+" "+set2.getClass());
		map=ctx.getBean("map",Map.class);
		System.out.println(map+" "+map.getClass());
		mpi=ctx.getBean("mpi",Float.class);
		System.out.println(mpi+" "+mpi.getClass());
		prop1=ctx.getBean("prop1",Properties.class);
		prop2=ctx.getBean("prop2",Properties.class);
		System.out.println(prop2+"property2 "+prop2.getClass());
		System.out.println(prop1+"property1 "+prop1.getClass());
		
		
		

	}

}
