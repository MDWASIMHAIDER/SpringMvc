package com.nt.test;

import com.nt.comp.Vechile;
import com.nt.factory.VechileFactory;

public class StrategyDpTest {

	public StrategyDpTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Vechile vechile=null;
		Vechile vechile1=null;
		//get vechile obbj
		vechile=VechileFactory.generateInstance("diesel");
		vechile.journey("bihar", "hydrabad");
		System.out.println("==============================");
		vechile1=VechileFactory.generateInstance("petrol");
		vechile.journey("hydrabad","bihar");
		
	}

}
