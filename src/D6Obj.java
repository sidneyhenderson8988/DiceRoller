
public class D6Obj {

	public int count = 0;
	
	public D6Obj(){

	}
	
	public String roll(int count){
		String rand6FullStr = "";
	for(int i = 1; i <= count; i++) {
		int rand = (int)(Math.random() * 6) + 1;
		rand6FullStr += Integer.toString(rand) + ", ";
	}
	return rand6FullStr;
}
	
	public String singleRoll(){
		int rand = (int)(Math.random() * 6) + 1;
		String rand6Str = Integer.toString(rand);
		return rand6Str;
	}
	
}
