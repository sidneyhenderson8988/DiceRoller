
public class D100Obj {

	public int count = 0;
	
	public D100Obj(){

	}
	
	void roll(int count){
		int sum = 0;
		for(int i = 1; i <= count; i++) {
    		int rand = (int)(Math.random() * 100) + 1;
    		sum += rand;
    		System.out.println("d100 result " + i + ": " + rand);
    	}
		System.out.println("\nTotal sum of dice is: " + sum);
	}
	
}