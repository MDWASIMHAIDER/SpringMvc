package com.nt.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

  abstract class AbstractTest{
	public abstract void test();
	public static void main(String [] args) {
		System.out.println("abstract test"+args);
	}
}
public class TestingQuestion extends AbstractTest{

	public static void main(String[] args) {
		System.out.println("main started");
		TestingQuestion test=new TestingQuestion();
		test.test();
		args[1]="wasim";
		test.main(args);
		/*List list=new ArrayList();
		list.add("wasim");
		list.add(12);
		list.add(12);
		List list1=new ArrayList(new HashSet(list));
		System.out.println(list1);*/       //this is best way to avoid duplicates in list
		
	/*	List<Set> list=new ArrayList();
		Set set=new HashSet();
		//set.add("wasim")
		set.add(1234);
		set.add("wasim");
		set.add(121);
		set.add(121);
		list.add(set);
		//List list1=new ArrayList(new HashSet(set));
		System.out.println(list);*/
		
	/*	Set set=new HashSet();
		set.add("wasim");
		set.add(123);
		set.add("wasim");
		Set set1=new HashSet(new ArrayList(set));
		System.out.println(set1);*/

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("TestingQuestion.test()");
	}

}
