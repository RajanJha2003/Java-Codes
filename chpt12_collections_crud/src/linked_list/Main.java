package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp(10, "Rajan", 1000000);
		Emp emp1=new Emp(11, "Tom", 250000);
		Emp emp2=new Emp(12, "Jerry", 300000);
		Emp emp3=new Emp(13, "Harry", 150000);
		
		LinkedList<Emp> linkedList=new LinkedList<Emp>();
		linkedList.add(emp);
		linkedList.add(emp1);
		linkedList.add(emp2);
		linkedList.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(linkedList);
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
