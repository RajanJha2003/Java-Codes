package user_defined_exception;

class VoteException extends Exception {
	
}



class Vote{
	void eligible(int age) throws VoteException {
		if(age<18) {
			throw new VoteException();
		}else {
			System.out.println("You are eligible to vote");
		}
	}
	
}

public class Main {
    public static void main(String[] args) {
		Vote vote=new Vote();
		try {
			vote.eligible(13);
		} catch (VoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
