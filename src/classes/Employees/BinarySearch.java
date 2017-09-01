package classes.Employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class BinarySearch {

	private final String TAG = BinarySearch.class.getSimpleName();
	private static List<Integer> list;
	private static Random rnd;
	private final static int MAX = 25;
	
	public static void main(String[] args){
		
		list = new ArrayList<>();
		rnd = new Random();
		
		for(int i = 0; i < 25; i++){
			
			list.add(rnd.nextInt(MAX));
		}
		
		for(Integer intr : list){
			
			System.out.println(intr);
		}
		
		Collections.sort(list);
		for(Integer intr : list){
			
			System.out.println(intr);
		}
		
		int index = Collections.binarySearch(list, rnd.nextInt(MAX));
		
		System.out.println(">>> " + index);
	}
	
}
