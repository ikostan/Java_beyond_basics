package classes;

import java.util.Comparator;
import java.util.Random;
import java.util.Stack;

public class StackIntro {

	private final String TAG = StackIntro.class.getSimpleName();

	private final static int MAX = 25;
	private static Random rnd;
	private static Stack<Integer> stack;
	
	public static void main(String[] args) {

		rnd = new Random();
		stack = new Stack<>();
		
		System.out.println("Unsorted:");
		setStack();
		printAll();
		
		System.out.println("Sorted:");
		sortAll();
		printAll();
				
		System.out.println("Sorted in reverse:");
		rsortAll();
		printAll();
		
		System.out.println("Removing all elements from the stack:");
		removeAll();
	}
	
	
	private static void setStack(){
		
		while(stack.size() < MAX){					
			stack.push(rnd.nextInt(MAX));
		}
	}
	
	
	private static void printAll(){
		
		for(Integer intr : stack){
			System.out.println(intr);
		}
		System.out.println("Size: " + stack.size());
	}
	
	
	private static void sortAll(){
				
		stack.sort(new StackComparator());
	}


	private static void rsortAll(){
	
		stack.sort(new StackReverseComparator());
	}
	
	private static void removeAll(){
		
		while(!stack.empty()){
			System.out.println(stack.peek());
			stack.pop();
		}
		System.out.println("Size: " + stack.size());
	}
	
	
	static class StackComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer arg0, Integer arg1) {
			
			if(arg0 == arg1){
				
				return 0;
			}
			else if(arg0 > arg1){
				
				return 1;
			}
			else{
				
				return -1;
			}
			
		}
	
	}
		
	static class StackReverseComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer arg0, Integer arg1) {
				
			if(arg0 == arg1){
					
				return 0;
			}
			else if(arg0 > arg1){
					
				return -1;
			}
			else{
					
				return 1;
			}
				
		}
			
	}
	
	//END
}
