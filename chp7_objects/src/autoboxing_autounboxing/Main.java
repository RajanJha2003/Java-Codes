package autoboxing_autounboxing;



public class Main {
  public static void main(String[] args) {
	int a=10;
	Integer b=a;   // autoboxing
	System.out.println(b);
	
	
	Integer c=new Integer(20);
	int d=c;   // autounboxing
	
	System.out.println(d);
}
}
