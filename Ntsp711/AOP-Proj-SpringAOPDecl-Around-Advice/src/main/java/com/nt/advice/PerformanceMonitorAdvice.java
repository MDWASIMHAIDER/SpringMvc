package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitorAdvice implements MethodInterceptor {
//AroundAdvice
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start=0,end=0;
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=invocation.proceed();//invocation has ref of primary logic or bankservice that invoke bank service method
		end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" has taken "+(end-start)+" ms to complete");
		System.out.println(Arrays.toString(invocation.getArguments()));
		System.out.println(invocation.getClass().getName()+" //////////////////////////");
		return retVal;
	}
	
/*	//BeforeAdvice
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start=0,end=0;
		Object retVal=null;
		start=System.currentTimeMillis();
			end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" has taken "+(end-start)+" ms to complete");
		retVal=invocation.proceed();//invocation has ref of primary logic or bankservice that invoke bank service method
		return retVal;
	}*/
	
	//AfterAdvice
/*	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start=0,end=0;
		Object retVal=null;
		retVal=invocation.proceed();//invocation has ref of primary logic or bankservice that invoke bank service method
		start=System.currentTimeMillis();
			end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+" has taken "+(end-start)+" ms to complete");
		return retVal;
	}*/

}
