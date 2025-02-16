package variable;


class Emp{
	String name;
	int id;
	static String companyName="RJ";
	
	 void displayInfo() {
		// TODO Auto-generated method stub
		 String department="IT";
		 
		 System.out.println(department);
		 
          
	}

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
}

public class Main {
	
	public static void main(String[] args) {
		Emp emp=new Emp("Rajan",10);
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(Emp.companyName);
		emp.displayInfo();
	}

}
