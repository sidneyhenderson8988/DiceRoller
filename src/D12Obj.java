
public class D12Obj {

	public int count = 0;
	
	public D12Obj(){

	}
	
	public String roll(int count){
		String rand12FullStr = "";
	for(int i = 1; i <= count; i++) {
		int rand = (int)(Math.random() * 12) + 1;
		rand12FullStr += Integer.toString(rand) + ", ";
	}
	return rand12FullStr;
}
	

	
}