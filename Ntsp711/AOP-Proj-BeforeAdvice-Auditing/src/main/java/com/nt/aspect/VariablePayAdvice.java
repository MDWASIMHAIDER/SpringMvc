package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

import com.nt.service.PayrollService;

public class VariablePayAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName()+"---> "+Arrays.toString(args));
		String desg=null;
		desg=((PayrollService)target).getDesg(((Integer)args[0]));
		if(desg.equalsIgnoreCase("sse")) {
			args[2]=true;
		}
		/*else
			args[2]=false;*/
	}

}
