import java.util.*;

public class Purse {
private ArrayList <String >coins=new ArrayList<String>();

public Purse(){
	coins= new ArrayList<String>();
}
	
	public static void main(String[] args) {
	Purse testPurse= new Purse();
	Purse test2=new Purse();
	test2.addCoin("Quarter");
	test2.addCoin("Nickel");
	test2.addCoin("Dime");
	test2.addCoin("Dime");
	testPurse.addCoin("Quarter");
	testPurse.addCoin("Dime");
	testPurse.addCoin("Nickel");
	testPurse.addCoin("Dime");
	testPurse.reverse();
	System.out.println(test2);
	System.out.println(testPurse);

	System.out.println(testPurse.sameCoins(test2));
	System.out.println(test2);
	System.out.println(testPurse);
	
	
	
	

	}
	public boolean sameCoins(Purse other){
		if (this.coins.size()!=other.coins.size()){
			return false;
		}
		Purse temp= new Purse();
		Purse temp2= new Purse();
		for (int i=0;i<this.coins.size();i++){
			temp.coins.add(this.coins.get(i));
		}
		for (int i=0;i<this.coins.size();i++){
			temp2.coins.add(other.coins.get(i));
		}
		temp.sort();
		temp2.sort();
		if(temp.sameContents(temp2)==false){
			return false;
		
		}
		return true;
	}
	public void sort(){
		int sorted=0;
		for (int i=sorted; i<this.coins.size();i++){
			if(this.coins.get(i).equals("Penny")){
				this.coins.set(i, this.coins.get(sorted));
				this.coins.set(sorted, "Penny");
				sorted++;
			}
		}
		for (int i=sorted; i<this.coins.size();i++){
			if(this.coins.get(i).equals("Nickel")){
				this.coins.set(i, this.coins.get(sorted));
				this.coins.set(sorted, "Nickel");
				sorted++;
			}
		}
		for (int i=sorted; i<this.coins.size();i++){
			if(this.coins.get(i).equals("Dime")){
				this.coins.set(i, this.coins.get(sorted));
				this.coins.set(sorted, "Dime");
				sorted++;
			}
		}
		for (int i=sorted; i<this.coins.size();i++){
			if(this.coins.get(i).equals("Quarter")){
				this.coins.set(i, this.coins.get(sorted));
				this.coins.set(sorted, "Quarter");
				sorted++;
			}
		}
	}
	public boolean sameContents(Purse other){
		if (this.coins.size()!=other.coins.size()){
			return false;
		}
		for(int i=0;i<this.coins.size();i++){
			if(!(this.coins.get(i).equals(other.coins.get(i)))){
				return false;
			}
		}
		return true;
	}
	public void transfer(Purse other){
		for(int i=0;i<other.coins.size();i++){
		this.coins.add(other.coins.get(i));
		}
		for(int i=other.coins.size();i>0;i--){
			other.coins.remove(i-1);
		}
	}

	public void addCoin(String coinName){
		this.coins.add(coinName);
	}
	public void reverse(){
		ArrayList <String >temp=new ArrayList<String>();
		
		for (int i=this.coins.size();i>0;i--){
			temp.add(this.coins.get(i-1));
		}
		this.coins=temp;
	}
	public String toString(){
	return "Purse"+coins;	
	}
	

}