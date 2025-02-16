package parameterised;


class Emp{
	int id;
	String name;
	double sal;
	String address;
	
	
	public Emp(int id, String name, double sal, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
}

public class Main {
public static void main(String[] args) {
	Emp emp=new Emp(10, "Rajan", 100000, "Kandivali");
	System.out.println(emp);
}


}
