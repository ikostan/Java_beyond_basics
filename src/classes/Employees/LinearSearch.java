package classes.Employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LinearSearch {

	private final String TAG = LinearSearch.class.getSimpleName();
	private static List<Integer> list;
	private static Random rnd;
	private final static int MAX = 25;
	
	public static void main(String[] args){
		
		list = new ArrayList<>();
		rnd = new Random();
		
		while(list.size() < MAX){
			
			int num = rnd.nextInt(MAX);
			
			if(!list.contains(num)){
				
				list.add(num);
			}
		}
		
		for(Integer intr : list){
			
			System.out.println(intr);
		}
		
		int number = rnd.nextInt(MAX);
		
		for(int index = 0; index < list.size(); index++){
			
			if(list.get(index) == number){
				
				System.out.println(String.format("number %d has index %d", number, index));
			}
		}
		
	}
}
