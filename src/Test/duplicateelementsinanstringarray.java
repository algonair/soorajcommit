package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class duplicateelementsinanstringarray {

	public static void main(String[] args) {
		String programmes[]= {"Java","Python","Java","c","c"};
		
		//Create a new set 
		Set<String> store = new HashSet<String>();
		for(String duplicate : programmes ) {
			
			if(store.add(duplicate)==false) {
				
				System.out.println(duplicate);
			}
		}

	}

}
    

