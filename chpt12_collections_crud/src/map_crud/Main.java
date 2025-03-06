package map_crud;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Rajan");
		hashMap.put(2, "Jha");
		hashMap.put(3, "Developer");
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(hashMap);
		imp.showData();
		
		
		System.out.println("----------------------------------------------------");
		imp.updateData(3, "Web Developer");
		imp.showData();
		
		System.out.println("----------------------------------------------------");
		
		
		imp.deleteData(2);
		imp.showData();
		
		System.out.println("-------------------------------------------------");
		
		imp.searchData(1);
		
		
	}

}
