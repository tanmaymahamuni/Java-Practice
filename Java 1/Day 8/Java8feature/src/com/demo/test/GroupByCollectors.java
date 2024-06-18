/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.demo.test;

import com.demo.beans.Person;
import com.demo.beans.Person.Gender;

import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class GroupByCollectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1=new Person("Rajan",20,Person.Gender.MALE);
		Person p2=new Person("Yash",65,Person.Gender.MALE);
		Person p3=new Person("Ashu",26,Person.Gender.FEMALE);
		Person p4=new Person("Deepa",27,Person.Gender.FEMALE);
		
		/*Stream<Person> ss=Stream.of(p1,p2,p3,p4);
		Map<Gender,List<Person>> map=ss.collect(Collectors.groupingBy(Person::getGender));
		System.out.println(map);*/
		
		Stream<Person> ss1=Stream.of(p1,p2,p3,p4);
		//calculate average age for each group
		//Map<Gender,Double> map1=ss1.collect(Collectors.groupingBy(Person::getGender,Collectors.averagingDouble(Person::getAge)));
		Map<Gender,Long> map1=ss1.collect(Collectors.groupingBy(Person::getGender,Collectors.counting()));
		                                  
		System.out.println(map1);
		
		
		Stream<Person> ss21=Stream.of(p1,p2,p3,p4);
		//calculate average age for each group
		Map<Gender,List<Person>> map11=ss21.collect(Collectors.groupingBy(Person::getGender,Collectors.toList()));
		System.out.println(map11);
		List<Integer> lst=List.of(1,2,3,4);
                //Spliterator<Integer> s=lst.spliterator();
		Stream<Person> ss2=Stream.of(p1,p2,p3,p4);
		Map<Boolean,List<Person>> map2=ss2.collect(Collectors.partitioningBy(Person::isMale));
		System.out.println(map2);
		
		/*Stream<Person> ss3=Stream.of(p1,p2,p3,p4);
		//calculate average age for each group
		Map<Boolean,Double> map3=ss3.collect(Collectors.partitioningBy(Person::isMale,Collectors.averagingDouble(Person::getAge)));
		System.out.println(map3);*/
    }
    
}
