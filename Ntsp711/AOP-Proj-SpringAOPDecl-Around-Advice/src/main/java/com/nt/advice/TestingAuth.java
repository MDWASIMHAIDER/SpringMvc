package com.nt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestingAuth implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("im tester");
		Object auth=invocation.proceed();
		System.out.println("proceed called");
		return auth;
	}

}
