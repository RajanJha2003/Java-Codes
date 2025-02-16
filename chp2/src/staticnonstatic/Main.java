package staticnonstatic;


class Emp{
	String name="Rajan";
	int id=100;
	static String companyName="RJ Tech";
	
	 void displayInfo() {
		// TODO Auto-generated method stub
		 System.out.println(name);
		 System.out.println(id);

	}
	 
	 
	 
	 static void displayCompany() {
		 System.out.println(companyName);
	 }
	
}


public class Main {
  public static void main(String[] args) {
	Emp emp=new Emp();
	emp.displayInfo();
	Emp.displayCompany();
}
}
