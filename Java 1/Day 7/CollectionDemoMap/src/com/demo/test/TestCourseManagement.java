package com.demo.test;

import java.util.Map;
import java.util.Scanner;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class TestCourseManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseService cservice=new CourseServiceImpl();
		int choice=0;
		do {
		System.out.println("1. add new course\n2.Display all\n3. display info of the course by name");
				System.out.println("4. display all course names by capacity\n5.Delete the couse\n6. Modify the course capacity");
				System.out.println("7. modify course name\n8.Display in sorted order of coursename");
				System.out.println("9. exit\nchoice:");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					boolean status=cservice.addnewCourse();
					if(status) {
						System.out.println("course added");
					}else {
						System.out.println("duplicate course name");
					}
					break;
				case 2:
					Map<String,Integer> hm=cservice.displayAll();
					for(String s:hm.keySet()) {
						System.out.println(s+"--->"+hm.get(s));
					}
					break;
				case 3:
					System.out.println("enetr coursename to search");
					String cname=sc.next();
					int c=cservice.getInfo(cname);
					if(c!=-1) {
						System.out.println(cname+"--->"+c);
					}
					break;
				case 4:
					System.out.println("enetr capacity for search");
					c=sc.nextInt();
					hm=cservice.getByCapacity(c);
					if(hm!=null) {
						for(String s:hm.keySet()) {
							System.out.println(s+"--->"+hm.get(s));
						}
					}else {
						System.out.println("not found");
					}
					
					break;
				case 5:
					System.out.println("enetr coursename to delete");
					cname=sc.next();
					status=cservice.deleteByName(cname);
					if(status) {
						System.out.println("course deleted");
					}else {
						System.out.println("not found");
					}
					break;
				case 6:
					System.out.println("enter coursename to modify");
					cname=sc.next();
					System.out.println("enter new capacity");
					c=sc.nextInt();
					status=cservice.modifycapacity(cname,c);
					if(status)
						System.out.println("modification done");
					else
						System.out.println("not found");
				
					break;
				case 7:
					System.out.println("enter coursename to modify");
					cname=sc.next();
					System.out.println("enter new coursename to modify");
					String newname=sc.next();
					status=cservice.modifycoursename(cname,newname);
					if(status)
						System.out.println("modification done");
					else
						System.out.println("not found");
						
					break;
				case 8:
					hm=cservice.sortByName();
					for(String s:hm.keySet()) {
						System.out.println(s+"--->"+hm.get(s));
					}
					break;
				case 9:
					sc.close();
					System.out.println("Thank you for visiting.....");
					break;
				default:
					System.out.println("invalid option");
				}
		}while(choice!=9);
	} 

}
