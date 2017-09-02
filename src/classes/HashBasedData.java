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
	}


	private static void printAll() {
		
		Set<Integer> keys = map.keySet();
		Iterator iterator = keys.iterator();
		
		while(iterator.hasNext()){	
			Integer indx = (Integer) iterator.next();
			System.out.println(indx + "\t: " + map.get(indx));
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

	
	//END
}
