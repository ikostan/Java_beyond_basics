package classes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetsIntro {

	private final String TAG = SetsIntro.class.getSimpleName();
	
	private final static int MAX = 1000;
	private static Random rnd;
	private static Set<Object> set;
	
	public static void main(String[] args) {

		rnd = new Random();
		set = new HashSet<Object>();
		
		setHashSet();
		printAll();
		testIsExist(rnd.nextInt(MAX));
		removeItem(rnd.nextInt(MAX));
		removeAll();
		printAll();
	}

	
	private static void removeItem(int nextInt) {
		
		if(set.contains(nextInt)){
			
			System.out.println("removing: " + nextInt);
			set.remove(nextInt);
		}
		else{
			
			System.out.println("Can not remove the item. Set does not contain: " + nextInt);
		}
	}


	private static void removeAll() {

		set.removeAll(set);
	}


	private static void setHashSet(){
		
		while(set.size() < MAX /10){		
			set.add(rnd.nextInt(MAX));
		}
	}
	
	
	private static void printAll(){
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("Size: " + set.size());
	}
	
	
	private static void testIsExist(Integer intr){
		
		if(set.contains(intr)){
			
			System.out.println("Set contains: " + intr);
		}
		else{
			
			System.out.println("Set does not contain: " + intr);
		}
	}
	
	
	//END
}
