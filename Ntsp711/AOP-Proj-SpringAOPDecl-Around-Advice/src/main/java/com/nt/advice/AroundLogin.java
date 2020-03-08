package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLogin implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		Object[] args=null;
		System.out.println("=======================================");
		System.out.println("Entering from "+invocation.getMethod().getName()+" "+Arrays.toString(invocation.getArguments()));
		args=invocation.getArguments();
		if((Float)args[0]<=50000) 
			args[1]=(Float)args[1]-0.5f;
		
			if((Float)args[0]<=0||(Float)args[1]<=0||(Float)args[2]<=0) 
				throw new IllegalArgumentException("provide valid inputs");
			
			retVal=invocation.proceed();
			retVal=(Float)retVal+(Float)retVal*0.01f;
			
			System.out.println("Exiting from "+invocation.getMethod().getName());
			System.out.println(Arrays.toString(invocation.getArguments()));
			

		System.out.println("============================================");
		return retVal;
	}

}
