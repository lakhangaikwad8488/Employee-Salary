package main.java.yaksha;

public class Employee {
	 private int employeeId;
		private String employeeName;
		private  double salary;
		private  double netSalary;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getNetSalary() {
			return netSalary;
		}
		public void setNetSalary(double netSalary) {
			this.netSalary = netSalary;
		}
		public void calculateNetSalary(int pfpercentage)
		{
			double net=0;
		    double sal=getSalary();
		    net=sal-(sal*pfpercentage/100);
		    setNetSalary(net);
		   
			
			System.out.println("Id : "+getEmployeeId());
		    System.out.println("Name : "+getEmployeeName());
		    System.out.println("Net Salary : "+getNetSalary());
		}
}
