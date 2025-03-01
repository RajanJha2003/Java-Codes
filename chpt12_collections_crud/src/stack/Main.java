package stack;


import java.util.Stack;



public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp(10, "Rajan", 1000000);
		Emp emp1=new Emp(11, "Tom", 250000);
		Emp emp2=new Emp(12, "Jerry", 300000);
		Emp emp3=new Emp(13, "Harry", 150000);
		
		Stack<Emp> stack=new Stack<Emp>();
		stack.add(emp);
		stack.add(emp1);
		stack.add(emp2);
		stack.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.push(stack);
		imp.showData();
		
		imp.pop();
		imp.showData();
		
		System.out.println("--------------------------------");
		imp.peek();
		
		
	    
	}
	

}
