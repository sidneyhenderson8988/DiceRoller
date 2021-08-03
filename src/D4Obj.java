
public class D4Obj {

	public int count = 0;
	
	public D4Obj(){

	}
	
	public String roll(int count){
			String rand4FullStr = "";
		for(int i = 1; i <= count; i++) {
    		int rand = (int)(Math.random() * 4) + 1;
    		rand4FullStr += Integer.toString(rand) + ", ";
    	}
		return rand4FullStr;
	}
	
	public String singleRoll(){
    		int rand = (int)(Math.random() * 4) + 1;
    		String rand4Str = Integer.toString(rand);
    		return rand4Str;
    	}
		
	}
	

