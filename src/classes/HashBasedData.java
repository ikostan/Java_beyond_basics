package classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashBasedData {

	private final String TAG = HashBasedData.class.getSimpleName();
	
	private final static int MAX = 1000;
	private static Random rnd;
	private static HashMap<Integer, String> map;
	
	private static String a = "Something";
    private static String b = "Whatever";
    private static String c = "";
    private static String d = "hello";
    private static String e = "some really long string, like too much...";
    private static String[] strArray;
	
    
	public static void main(String[] args) {

		strArray = new String[]{a, b, c, d, e};
		rnd = new Random();
		map = new HashMap<>();
		
		createHash();
		printAll();
		removeItemKey(rnd.nextInt(MAX));
		removeItemObj(strArray[rnd.nextInt(strArray.length)]);
		printAll();
		removeAll();
		printAll();
				
		hashIt(strArray[rnd.nextInt(strArray.length)]);
	}


	private static void removeAll() {
		
		map.clear();
	}


	private static void printAll() {
		
		Set<Integer> keys = map.keySet();
		Iterator iterator = keys.iterator();
		
		while(iterator.hasNext()){	
			Integer indxKey = (Integer) iterator.next();
			System.out.println(indxKey + "\t: " + map.get(indxKey));
		}
		
		System.out.println("Size: " + map.size());
	}


	private static void createHash() {
		
		int key = 0;
		
		for(int i = 0; i < strArray.length; i++){		
			while(map.containsKey(key)){			
				key = rnd.nextInt(MAX);
			}
			map.put(key, strArray[i]);
		}
	}

	
	private static void removeItemKey(Integer key){
		
		if(map.containsKey(key)){
			
			System.out.println(String.format("removing >>> %d : %s", key, map.get(key).toString()));
			map.remove(key); 
		}
		else{
			
			System.out.println("There is no such object...");
		}
	}
	
	
	private static void removeItemObj(String obj){
		
		if(map.containsValue(obj)){
			
			int key = 0;
			Set<Integer> keys = map.keySet();
			Iterator iterator = keys.iterator();
			
			while(iterator.hasNext()){	

				key = (int) iterator.next();
				
				if(map.get(key)  == obj){
	
					System.out.println(String.format("removing >>> %d : %s", key, obj));
					map.remove(key); 
					break;
				}
			}			
		}
		else{
			
			System.out.println("There is no such object...");
		}
	}	
	

	private static void addItem(Integer key, String value){
		
		map.put(key, value);
	}
	
	
	static private void hashIt(String str){
		
		System.out.println("'" + str + "'" + " hashed value " + str.hashCode());
	}
	
	//END
}
