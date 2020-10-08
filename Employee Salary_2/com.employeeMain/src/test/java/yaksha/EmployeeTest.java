package test.java.yaksha;

import com.averageCalculator.TestUtils;

//import static org.junit.jupiter.api.Assertions.*;

import main.java.yaksha.*;
//import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testCalculateNetSalary() {
		Employee e=new Employee();
		
		//assert(true, e.calculateNetSalary(10));
		 TestUtils.yakshaAssert(TestUtils.currentTest(),e.calculateNetSalary(10)==true==true?"true":"false",TestUtils.businessTestFile);
	}

}
