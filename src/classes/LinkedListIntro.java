package classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListIntro {

	private final String TAG = LinkedListIntro.class.getSimpleName();

	private static List list;
	private static String[] strArray;
	private static Iterator iterator;
	
	
	public static void main(String[] args) {

		strArray = new String[]{"eggs", "dogs", "lions", "panters", "cats", "horses", "pigs"};
		
		setList();
		replaceItem("cats", "snakes");
		addItemIndx(list.indexOf("snakes") + 1, "cats");
		printAll();
	}

	
	private static void setList(){
		
		list = new LinkedList<String>();
		list.addAll(Arrays.asList(strArray));
	}

	
	private static void printItem(String item){
		
		if(list.contains(item)){
			
			System.out.println(list.get(list.indexOf(item)));
		}
		else{
			
			System.out.println("There is no such item");
		}
	}
	
	
	private static void setIterator(){
		
		iterator = list.iterator();
	}
	
	
	private static void printAll(){
		
		setIterator();
		
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}
	}
	
	
	private static void addItem(String item){
			
		list.add(item);
		System.out.println(item + " was added to the list");
	}
	
	
	private static void addItemIndx(int indx, String item){
				
		list.add(indx, item);
		System.out.println(item + " was added to the list");
	}
	
	
	private static void removeItem(String item){
		
		if(list.contains(item)){
			
			list.remove(item);
			System.out.println(item + " was removed from the list");
		}
		else{
			
			System.out.println("There is nothing to remove");
		}
	}
	
	
	private static void replaceItem(String oldItem, String newItem){
		
		if(list.contains(oldItem)){
			
			Collections.replaceAll(list, oldItem, newItem);
			System.out.println(oldItem + " was replaced by " + newItem);
		}
		else{
			
			System.out.println("There is nothing to replace.");
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
