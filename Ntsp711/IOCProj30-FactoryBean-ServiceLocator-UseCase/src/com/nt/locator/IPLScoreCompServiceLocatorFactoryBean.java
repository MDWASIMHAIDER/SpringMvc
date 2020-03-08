package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ExternalIPLScoreComp;
import com.nt.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean implements FactoryBean<ExternalIPLScoreComp> {

	private Map<String,ExternalIPLScoreComp> cacheMap=null;
	private String jndi;
	public IPLScoreCompServiceLocatorFactoryBean(String jndi) {
			this.jndi=jndi;
			cacheMap=new HashMap<>();
	}

	@Override
	public ExternalIPLScoreComp getObject() throws Exception {
		ExternalIPLScoreComp extcomp=null;
		if(!cacheMap.containsKey(jndi)) {
			extcomp=new ExternalIPLScoreCompImpl();
			cacheMap.put(jndi, extcomp);
		}
		return cacheMap.get(jndi);
	}

	@Override
	public Class<?> getObjectType() {
		return ExternalIPLScoreComp.class;
	}
	public boolean isSingleton() {
		return true;
	}

}
