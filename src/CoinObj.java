
public class CoinObj {

	public int count = 0;
	
	public CoinObj(){

	}
	
	public String flip(){
		String flipRes = "";
    		int rand = (int)(Math.random() * 2) + 1;
    		if (rand == 1) {
            	flipRes = "Coin Flip result is tails.";
            }
            else flipRes = "Coin Flip result is heads.";
            
		return flipRes;
	}
}