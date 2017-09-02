package classes;

import java.util.HashSet;
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
		
	}

	
	private static void setHashSet(){
		
		for(int i = 0; i < MAX / 10; i++){		
			set.add(rnd.nextInt(MAX));
		}
	}
	
	
	//END
}
