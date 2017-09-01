package classes;

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
		
		while(stack.size() < MAX){			
			stack.push(rnd.nextInt(MAX));
		}
		
		int i = 0;
		
		while(i < stack.size()){
			
			System.out.println(stack.peek());
			i++;
		}
		System.out.println("Size: " + stack.size());
		
		
		while(!stack.empty()){
			
			System.out.println(stack.pop());
		}
		System.out.println("Size: " + stack.size());
		
	}
	
	
	//END
}
