package com.nt.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.PassangerDTO;
import com.nt.service.PassangerService;
import com.nt.service.PassangerServiceImpl;

public class BatchProcessingTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PassangerService service=null;
		String name=null;
		String source=null;
		String dest=null;
		int price=0;int size=0;
		PassangerDTO dto=null;
		List<PassangerDTO>listdto=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter passanger source");
		source=sc.nextLine();
		System.out.println("Enter pasaanger destination");
		dest=sc.nextLine();
		System.out.println("Enter passanger price");
		price=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Batch size");
		size=Integer.parseInt(sc.nextLine());
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+"passanger name");
			name=sc.nextLine();
			dto=new PassangerDTO();
			dto.setName(name);dto.setSource(source);dto.setDest(dest);
			dto.setPrice(price);
			listdto.add(dto);
		}
				ctx=new ClassPathXmlApplicationContext("com/nt/confg/AppConfig.xml");
		service=ctx.getBean("service",PassangerServiceImpl.class);
		System.out.println(service.insertPassangerBatch(listdto));
		
	}
}
