import java.util.HashMap;


public class Category {
	public String myName;
	public HashMap<Double,CatType> myHash;
	public double myAverage;
	
	
	
	public Category(String name){
		this.myName = name;
		this.myHash = new HashMap<Double, CatType>();
		this.myAverage = 0;
	}
}
