
public class D8Obj {

	public int count = 0;
	
	public D8Obj(){

	}
	
	public String roll(int count){
		String rand8FullStr = "";
	for(int i = 1; i <= count; i++) {
		int rand = (int)(Math.random() * 8) + 1;
		rand8FullStr += Integer.toString(rand) + ", ";
	}
	return rand8FullStr;
}
	
	public String singleRoll(){
		int rand = (int)(Math.random() * 8) + 1;
		String rand8Str = Integer.toString(rand);
		return rand8Str;
	}
	
}