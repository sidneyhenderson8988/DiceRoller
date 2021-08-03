
public class D20Obj {

	public int count = 0;
	
	public D20Obj(){

	}
	
	public String roll(int count){
		String rand20FullStr = "";
	for(int i = 1; i <= count; i++) {
		int rand = (int)(Math.random() * 20) + 1;
		rand20FullStr += Integer.toString(rand) + ", ";
	}
	return rand20FullStr;
}
	
}