package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionsIntro {

	private final String TAG = CollectionsIntro.class.getSimpleName();
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
	
	
	private int findItemIndx(String item){
		
		int i = -1;
		
		if(!list.isEmpty() && list.contains(item)){
			
			i = list.indexOf(item);
		}
		
		return i;
	}
	
	
	private void addItem(String item){
		
		if(list != null){
			
			list.add(item);
		}
		else{
			
			System.out.println("The dosen't exist in the memory. Please create a new list.");			
		}
	}
	
	
	private void addItemIndx(int indx, String item){
		
		if(list != null){
			
			list.add(indx, item);
		}
		else{
			
			System.out.println("The dosen't exist in the memory. Please create a new list.");			
		}
	}
	
	
	private static void delItem(String item){
		
		if(list != null && !list.isEmpty() && list.contains(item)){
			
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
	
	
	private static void replaceItem(String oldItem, String newItem){
		
		if(list != null && !list.isEmpty() && list.contains(oldItem)){
			
			Collections.replaceAll(list, oldItem, newItem);
			System.out.println(oldItem + " was replaced by " + newItem);
		}
		else{
			
			System.out.println("There is nothing to replace.");
		}
	}
	
	
	private static void printAll(){
		
		System.out.println("Printing all items from the list:");
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}		
	}
	
	
	private static void sortList(){
		
		Collections.sort(list);
		printAll();
	}
	
	
	private static void reverseList(){
		
		Collections.reverse(list);
		printAll();
	}
	
	
	//END
}
