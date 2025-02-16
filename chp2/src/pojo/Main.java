package pojo;

class Pojo{
	private String name;
	private double salary;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}


public class Main {
  public static void main(String[] args) {
	  Pojo pojo=new Pojo();
	  pojo.setName("Rajan");
	  System.out.println(pojo.getName());
	  pojo.setSalary(10000);
	  System.out.println(pojo.getSalary());
	  pojo.setId(10);
	  System.out.println(pojo.getId());
}
}
