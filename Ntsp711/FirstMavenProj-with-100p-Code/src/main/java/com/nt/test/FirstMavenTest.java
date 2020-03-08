package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config1.AppConfig;
import com.nt.service.DeptService;
import com.nt.service.DeptServiceImpl;

public class FirstMavenTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
	        DeptService service=null;
	        ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	        service=ctx.getBean("service",DeptService.class);
	        System.out.println("Total count "+service.getCount());
	        System.out.println("Total count through number "+service.getDetailsByNumber("delhi"));
	        System.out.println("All details od Department "+service.getAllDetails());
	        System.out.println("All  Department number "+service.getAllDeptNumber("service"));
	      //  System.out.println("Remove dept By location "+service.removeDeptRecordByLocation("mumbai"));
	       // System.out.println("Remove old loc by new loc "+service.removeOldLocByNewLoc("pune", "mumbai"));
	}

}
