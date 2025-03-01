package treeset;



import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp(10, "Rajan", 1000000);
		Emp emp1=new  Emp(10, "Rajan", 1000000);
		Emp emp2=new Emp(12, "Jerry", 300000);
		Emp emp3=new Emp(13, "Harry", 150000);
		
		TreeSet<Emp> treeSet=new TreeSet<Emp>();
		treeSet.add(emp);
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(treeSet);
		imp.showData();
		System.out.println("---------------------------------");
	    imp.updateData(13, "Kary");
	    imp.showData();
	    System.out.println("--------------------------------");
	    imp.deleteData(12);
	    imp.showData();
	    System.out.println("----------------------------------------");
	    imp.searchData(10);
	    
	}
	

}
