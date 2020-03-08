package com.nt.factory;

import com.nt.comp.CNGEngine;
import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Vechile;

public class VechileFactory {

	public VechileFactory() {
		// TODO Auto-generated constructor stub
	}
	public static  Vechile generateInstance(String enginetype) {
		Vechile vechile;
		Engine engine;
		if(enginetype.equalsIgnoreCase("diesel")) {
			engine=new DieselEngine();
		}
		else if(enginetype.equalsIgnoreCase("petrol")) {
			engine=new PetrolEngine();
		}
		else if(enginetype.equalsIgnoreCase("cng")) {
			engine=new CNGEngine();
		}
		
		else {
			throw new IllegalArgumentException("Invlid Argument");
		}
		vechile=new Vechile();
		vechile.setEngine(engine);
		return vechile;
	}//generateInstance
}//class
