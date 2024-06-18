package com.demo.dao;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
     static Employee[] emparr;
     static int cnt=0;
     static{
    	 emparr=new Employee[10];
    	 emparr[0]=new SalariedEmp(1,"Rajan","222","gaming","developer",LocalDate.of(2020, 02, 02),777777);
    	 emparr[1]=new ContractEmp(2,"Rajan","4444","UX","manager",LocalDate.of(1998, 02, 02),45,8000);
    	 emparr[2]=new SalariedEmp(3,"Manjiri","222","gaming","manager",LocalDate.of(2020, 02, 02),565656);
    	 cnt=3;
     }
	@Override
	public boolean save(Employee e) {
		if(cnt<emparr.length) {
			emparr[cnt]=e;
			cnt++;	
			return true;
		}
		else {
			System.out.println("array is full");
			return false;
		}
        
	}
	@Override
	public Employee[] findAll() {
		return emparr;
	}
	@Override
	public Employee getById(int pid) {
		for(Employee e:emparr) {
			if(e!=null) {
				if(e.getPid()==pid) {
					return e;
				}
			}else {
			    break;
			}
		}
		/*Optional<Employee> e=Stream.of(emparr)
				.filter(ob->ob.getPid()==pid)
				.findFirst();
		if(e.isPresent())
			return e.get();*/
		return null;
	}
	@Override
	public Employee[] getByName(String nm) {
		Employee[] arr=new Employee[cnt];
		int i=0;
		for(Employee e:emparr) {
			if(e!=null) {
				if(e.getPname().equals(nm)) {
					arr[i]=e;
					i++;
				}
			}else {
			  break;
			}
			
		}
		if(i>0) {
			return arr;
		}
		/*Stream.of(emparr)
		.filter(ob->ob.getPname().equals(nm))
		.collect(Collectors.toList());*/
		return null;
	}
	@Override
	public boolean modifySalById(int pid, float s) {
		Employee e=getById(pid);
		System.out.println(e);
		if(e!=null) {
			if( e instanceof SalariedEmp)
			   ((SalariedEmp)e).setSal(s);
			else if(e instanceof ContractEmp) {
				((ContractEmp)e).setCharges(s);
			}else {
				//vendor code goes here
			}
		    return true;	
		}
		return false;
		
	}

}









