package com.nt.mapp;

import java.util.ArrayList;
import java.util.List;

public class SerachMissingElementInMap {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<20;i++) {
			list.add(i);
		}
		list.remove(18);
		System.out.println(list);
		System.out.println("========================");
	//	System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			//System.out.println(i+"  -------"+list.get(i));
			/*if(i!=list.get(i)) {	
				System.out.println(i+" element not available in list");
			}*/
			if(list.contains(i)==false) {
				System.out.println(i+" element not available in list");
				//System.out.println(i);
				
			}
		}
		System.out.println(list);

	}

}
