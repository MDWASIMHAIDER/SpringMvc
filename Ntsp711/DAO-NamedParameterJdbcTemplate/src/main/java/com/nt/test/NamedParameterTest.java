package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.PolicyDTO;
import com.nt.service.PolicyService;

public class NamedParameterTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PolicyService service=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/applicationContext.xml");
		service=ctx.getBean("service",PolicyService.class);
		System.out.println(service.getPolicyByNum(1003));
		PolicyDTO dto=null;
		dto=new PolicyDTO();
		dto.setPolicyId(1004);
		dto.setPolicyName("jsjb");
		dto.setTenure(2);
		dto.setCompany("orientpolicy");
		dto.setInitialAmount(1000000);
		//System.out.println(service.PolicyInsert(dto));
		System.out.println(service.findPolicyByName("jeevanS", "jsjb", "mrs bima"));
		((AbstractApplicationContext) ctx).close();

	}

}
