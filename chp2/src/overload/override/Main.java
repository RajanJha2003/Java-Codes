package overload.override;



class Account{
	double sal(int sal) {
		return sal;
	}
	
	double sal(int sal,int bonus) {
		return sal+bonus;
	}
	
	double sal(int sal,int bonus,int tax) {
		return sal+bonus+tax;
	}
}


class HR extends Account{
	@Override
	double sal(int sal, int bonus, int tax) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus, tax);
	}
	
}


class Manager extends Account{
	@Override
	double sal(int sal, int bonus) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus);
	}
	
}


class Worker extends Account{
	@Override
	double sal(int sal) {
		// TODO Auto-generated method stub
		return super.sal(sal);
	}
	
}


public class Main {
  public static void main(String[] args) {
	  HR hr=new HR();
	  System.out.println(hr.sal(100000,20000,1000));
	  
	  Manager manager=new Manager();
	  System.out.println(manager.sal(10000, 2000));
	  
	  
	  Worker worker=new Worker();
	  System.out.println(worker.sal(100000));
	
}
}
