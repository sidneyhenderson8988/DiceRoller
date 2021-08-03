
public class D10Obj {

	public int count = 0;
	
	public D10Obj(){

	}
	
	public String roll(int count){
		String rand10FullStr = "";
	for(int i = 1; i <= count; i++) {
		int rand = (int)(Math.random() * 10) + 1;
		rand10FullStr += Integer.toString(rand) + ", ";
	}
	return rand10FullStr;
}
	
	public String singleRoll(){
		int rand = (int)(Math.random() * 10) + 1;
		String rand10Str = Integer.toString(rand);
		return rand10Str;
	}
}