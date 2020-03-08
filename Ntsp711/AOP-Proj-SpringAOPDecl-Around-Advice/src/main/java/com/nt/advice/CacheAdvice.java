package com.nt.advice;

import java.util.Arrays;
import java.util.HashMap;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {

	private HashMap<String, Object>map=new HashMap<String, Object>();
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String  key=null;
		Object retVal=null;
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		System.out.println("=============================  ");
		if(!map.containsKey(key)) {
			retVal=invocation.proceed();
			map.put(key, retVal);
			System.out.println("from target method");
		}
		else {
			retVal=map.get(key);
			System.out.println("from cache Map ");
		}
		return retVal;
	}

}
