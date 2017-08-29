package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsIntro {

	
	private static String[] strArray;
	private static List<String> list;
	
	
	//Main method
	public static void main(String[] args) {

		strArray = new String[]{"eggs", "dogs", "lions", "panters"};
		setList();
		delItem("eggs");
		printAll();
	}

	
	private static void setList(){
		
		list = new ArrayList<String>();
		list.addAll(Arrays.asList(strArray));		
	
		for(int i = 0; i < list.size(); i++){
			
			System.out.println(list.get(i));
		}
	}
	
	
	private static void delItem(String item){
		
		if(list.contains(item)){
			
			int indx = list.indexOf(item);
			System.out.println("The item was found and will be removed from the list, index: " + indx);			
			list.remove(indx);
		}
		else{
			
			System.out.println("The item is not part of the list");
		}
		
		for(int i = 0; i < list.size(); i++){
			
			System.out.println(list.get(i));
		}
	}
	
	
	private static void printAll(){
		
		System.out.println("Printing all items from the list:");
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}		
	}
	
	
	
	//END
}
