package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
	ArrayList< Integer> arrayList=new ArrayList<Integer>();
	
	// add elements
	arrayList.add(10);
	arrayList.add(11);
	arrayList.add(12);
	arrayList.add(13);
	arrayList.add(14);
	System.out.println(arrayList);
	
	// delete element
	arrayList.remove(2);
	System.out.println(arrayList);
	
	
	// update element
	arrayList.set(1, 101);
	System.out.println(arrayList);
	
	
	int search=13;
	
	if(arrayList.contains(search)) {
		System.out.println("Element found");
	}else {
		System.out.println("Element not found");
	}
	
	Iterator<Integer> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
        
        if (iterator.next() == search) {
            System.out.println("Element found");
        }
    }
	
	
	
	
	
}
}
