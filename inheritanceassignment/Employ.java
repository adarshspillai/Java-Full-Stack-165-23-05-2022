package inheritanceassignment;

 class EmployeeTest {
	String firstName;
	String lastName;
	double monthlySalary;
	public EmployeeTest(String firstName,String lastName,double monthlySalary) {
		this.firstName=firstName;
		this.lastName=lastName;
		if(monthlySalary>=0.0) {
		this.monthlySalary=monthlySalary;
	}
	}
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary>=0.0) {
			this.monthlySalary=monthlySalary;
		}

		this.monthlySalary = monthlySalary;
	}
 }

class Employ{
	public static void main(String[] args) {
		EmployeeTest e=new EmployeeTest("Adarsh","Pillai",1500);
		EmployeeTest e1=new EmployeeTest("Akash","Kumar",2506);
		System.out.println(e.getFirstName()+"'s monthly salary is"+" "+e.getMonthlySalary());
		System.out.println(e1.getFirstName()+"'s monthly salary is"+" "+e1.getMonthlySalary());
		e.setMonthlySalary(e.getMonthlySalary()*1.1);
		e1.setMonthlySalary(e1.getMonthlySalary()*1.1);
		System.out.println("Salary after 10% boost");
        System.out.println(e.getFirstName() + "'s monthly salary is " + e.getMonthlySalary());
        System.out.println(e1.getFirstName() + "'s monthly salary is " + e1.getMonthlySalary());

		

	}

}
