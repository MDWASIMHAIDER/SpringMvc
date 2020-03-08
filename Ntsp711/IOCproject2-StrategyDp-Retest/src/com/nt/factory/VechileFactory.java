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
	public static Vechile getVechileInstance(String enginetype) {
		Vechile vechile=null;
		Engine engine=null;
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
			throw new IllegalArgumentException("invalid argument");
		}
		vechile=new Vechile();
		vechile.setEngine(engine);
		return vechile;
	}
}
