package classes;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueIntro {

private final String TAG = QueueIntro.class.getSimpleName();
	
	private final static int MAX = 25;
	private static Random rnd;
	private static Queue<Integer> queue;
	
	public static void main(String[] args) {

		rnd = new Random();
		queue = new PriorityQueue<Integer>();
		
		System.out.println("Create a new queue:");
		setQueue();
		printAll();
		
		System.out.println("Removing all elements from the stack:");
		removeAll();
	}

	
	private static void setQueue(){
		
		while(queue.size() < MAX){	
			int num = rnd.nextInt(MAX);
			System.out.println("adding: " + num);
			queue.add(num);
		}
	}
	
	
	private static void printAll(){
		
		for(Integer intr : queue){		
			System.out.println(intr);
		}
	}
	
	
	private static void removeAll(){
		
		while(!queue.isEmpty()){			
			System.out.println("removing " + queue.peek());
			queue.remove();
		}
	}
	
		
	
	//END

}
