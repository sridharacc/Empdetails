package org.emp;

public class Employee {
	private void empID(int Id,String Officecode) {
		System.out.println("Employee Id -"+Id+"\n"+"office-code-"+Officecode);

	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empID(1123, "Ct1234");
	}

}
