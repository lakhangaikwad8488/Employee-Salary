package main.java.yaksha2;

import java.util.Scanner;

import com.employeeInfo.Employee;

import main.java.yaksha.EmployeeMain;

public class EmployeeMain {
	public static void main(String[] args) {
		 
		Employee emp=EmployeeMain.getEmployeeDetails();
		int pf=EmployeeMain.getPFPercentage();
		emp.calculateNetSalary(pf);
		

		}
		  public static Employee getEmployeeDetails()
		  {Employee emp = null;
			 try { 
				 emp=new Employee();
			  Scanner sc=new Scanner(System.in);
				  
					  System.out.println("Enter Id:");
					 emp.setEmployeeId(sc.nextInt());
		  System.out.println("Enter Name:");
		  emp.setEmployeeName(sc.next());
		  System.out.println("Enter salary:");
		  emp.setSalary(sc.nextDouble());
			 }
			 catch(Exception e)
			 {
				
			 }
		  
			
			return emp;
			  
		  }
		  public static int getPFPercentage()
		  {
			  int pf = 0;
			  try {
				  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter PF percentage:");
			 pf =sc.nextInt();
		  }
			  catch (Exception e) {
				// TODO: handle exception
			}
			return pf;
			 
	}
}
