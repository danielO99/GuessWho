import java.util.ArrayList;
import java.util.HashMap;

//Class for the board, for now since the csv reader is no realiable everything is by hand.
//Methods
public class Board {
	public ArrayList<Person> myPeople;
	public ArrayList<Category> myCat;
	
	public Category catGender;
	public Category catHair;
	public Category catGlasses;
	public Category catEyes;
	public Category catBlush;
	public Category catHat;
	public Category catMustache;
	public Category catBeard;
	public Category catBald;
	public Category catLongHair;
	
	
	//Function to get the log value
	public static  double log2(double n){
		return (Math.log(n) / Math.log(2));
	}
	
	public Board(){
		this.myPeople 		= new ArrayList<Person>();
		this.myCat			= new ArrayList<Category>();
		
		this.catGender 		= new Category("gender");
		this.catHair 		= new Category("hair");
		this.catGlasses		= new Category("glasses");
		this.catEyes 		= new Category("eyes");
		this.catBlush 		= new Category("blush");
		this.catHat 		= new Category("hat");
		this.catMustache 	= new Category("mustache");
		this.catBeard 		= new Category("beard");
		this.catBald 		= new Category("bald");
		this.catLongHair 	= new Category("longHair");
		//Values
		
		//Female, 0.0
		//Male, 1.0
		
		//Glasses, Blush, Hat, Mustache, Beard, Bald and Long_Hair
		//"yes" or true, 1.0
		//"no" or false, 0.0
		
		//Eyes
		//brown, 0.0
		//blue, 1.0
		
		//Hair
		//brown, 0.0
		//black, 1.0
		//red, 2
		//blond, 3
		//white, 4
		this.myPeople.add(new Person("Alex",1.0,1.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Alfred",1.0,2,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0));
		this.myPeople.add(new Person("Anita",0.0,3,0.0,1.0,1.0,0.0,0.0,0.0,0.0,1.0));
		this.myPeople.add(new Person("Anne",0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Bernard",1.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Bill",1.0,2,0.0,0.0,1.0,0.0,0.0,1.0,1.0,0.0));
		this.myPeople.add(new Person("Charles",1.0,3,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Claire",0.0,2,1.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("David",1.0,3,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Eric",1.0,3,0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Frans",1.0,2,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("George",1.0,4,0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Herman",1.0,2,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0));
		this.myPeople.add(new Person("Joe",1.0,3,1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Maria",0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,1.0));
		this.myPeople.add(new Person("Max",1.0,1.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Paul",1.0,4,1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Peter",1.0,4,0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Philip",1.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0));
		this.myPeople.add(new Person("Richard",1.0,0.0,0.0,0.0,0.0,0.0,1.0,1.0,1.0,0.0));
		this.myPeople.add(new Person("Robert",1.0,0.0,0.0,1.0,1.0,0.0,0.0,0.0,0.0,0.0));
		this.myPeople.add(new Person("Sam",1.0,4,1.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0));
		this.myPeople.add(new Person("Susan",0.0,4,0.0,0.0,1.0,0.0,0.0,0.0,0.0,1.0));
		this.myPeople.add(new Person("Tom",1.0,1.0,1.0,1.0,0.0,0.0,0.0,0.0,1.0,0.0));
		
		this.myCat.add(catGender);
		this.myCat.add(catHair);
		this.myCat.add(catGlasses);
		this.myCat.add(catEyes);
		this.myCat.add(catBlush);
		this.myCat.add(catHat);
		this.myCat.add(catMustache);
		this.myCat.add(catBeard);
		this.myCat.add(catBald);
		this.myCat.add(catLongHair);
		//Initializing categories
		
		
		//Initializing the average values
		//Getting all the initial average values.
		this.initPeople();

	}
	
	public void initPeople(){

		this.initNums();
		int sizeAr = this.myPeople.size();
		for(int i=0; i<sizeAr; i++){
			Person temp = this.myPeople.get(i);
			
			if(this.catGender.myHash.containsKey(temp.myGender)){
				this.catGender.myHash.put(temp.myGender,new CatType(this.myCat.get(0).myHash.get(temp.myGender).myQuestion,this.myCat.get(0).myHash.get(temp.myGender).myValue+1.0));
			}
			else{
				if(temp.myGender==0.0){
					this.catGender.myHash.put(temp.myGender, new CatType("Tu personaje es mujer?",1.0));
				}
				if(temp.myGender==1.0){
					this.catGender.myHash.put(temp.myGender, new CatType("Tu personaje es hombre?",1.0));
				}
			}
			if(this.catHair.myHash.containsKey(temp.myHair)){
				this.catHair.myHash.put(temp.myHair,new CatType(this.myCat.get(1).myHash.get(temp.myHair).myQuestion,this.myCat.get(1).myHash.get(temp.myHair).myValue+1.0));
			}
			else{
				if(temp.myHair==0.0){
					this.catHair.myHash.put(temp.myHair, new CatType("Tu personaje tiene el cabello cafe?",1.0));
				}
				if(temp.myHair==1.0){
					this.catHair.myHash.put(temp.myHair, new CatType("Tu personaje tiene el cabello negro?",1.0));
				}
				if(temp.myHair==2.0){
					this.catHair.myHash.put(temp.myHair, new CatType("Tu personaje tiene el cabello rojo?",1.0));
				}
				if(temp.myHair==3.0){
					this.catHair.myHash.put(temp.myHair, new CatType("Tu personaje tiene el cabello dorado?",1.0));
				}
				if(temp.myHair==4.0){
					this.catHair.myHash.put(temp.myHair, new CatType("Tu personaje tiene el cabello gris?",1.0));
				}
			}
			if(this.catGlasses.myHash.containsKey(temp.myGlasses)){
				//System.o
				this.catGlasses.myHash.put(temp.myGlasses,new CatType(this.myCat.get(2).myHash.get(temp.myGlasses).myQuestion,this.myCat.get(2).myHash.get(temp.myGlasses).myValue+1.0));
			}
			else{
				if(temp.myGlasses==0.0){
					this.catGlasses.myHash.put(temp.myGlasses, new CatType("Tu personaje no usa lentes?",1.0));
				}
				if(temp.myGlasses==1.0){
					this.catGlasses.myHash.put(temp.myGlasses, new CatType("Tu personaje usa lentes???",1.0));
				}
			}
			if(this.catEyes.myHash.containsKey(temp.myEyes)){
				this.catEyes.myHash.put(temp.myEyes,new CatType(this.myCat.get(3).myHash.get(temp.myEyes).myQuestion,this.myCat.get(3).myHash.get(temp.myEyes).myValue+1.0));
			}
			else{
				if(temp.myEyes==0.0){
					this.catEyes.myHash.put(temp.myEyes, new CatType("Tu personaje tiene los ojos cafés?",1.0));
				}
				if(temp.myEyes==1.0){
					this.catEyes.myHash.put(temp.myEyes, new CatType("Tu personaje tiene los ojos azules?",1.0));
				}
			}
			if(this.catBlush.myHash.containsKey(temp.myBlush)){
				this.catBlush.myHash.put(temp.myBlush,new CatType(this.myCat.get(4).myHash.get(temp.myBlush).myQuestion,this.myCat.get(4).myHash.get(temp.myBlush).myValue+1.0));
			}
			else{
				if(temp.myBlush==0.0){
					this.catBlush.myHash.put(temp.myBlush, new CatType("Tu personaje tiene las mejillas rosadas?",1.0));
				}
				if(temp.myBlush==1.0){
					this.catBlush.myHash.put(temp.myBlush, new CatType("Tu personaje tiene las mejillas rosadas???",1.0));
				}
			}
			if(this.catHat.myHash.containsKey(temp.myHat)){
				this.catHat.myHash.put(temp.myHat,new CatType(this.myCat.get(5).myHash.get(temp.myHat).myQuestion,this.myCat.get(5).myHash.get(temp.myHat).myValue+1.0));
			}
			else{
				if(temp.myHat==0.0){
					this.catHat.myHash.put(temp.myHat, new CatType("Tu personaje usa sombrero?",1.0));
				}
				if(temp.myHat==1.0){
					this.catHat.myHash.put(temp.myHat, new CatType("Tu personaje usa sombrero???",1.0));
				}
			}
			if(this.catMustache.myHash.containsKey(temp.myMustache)){
				this.catMustache.myHash.put(temp.myMustache,new CatType(this.myCat.get(6).myHash.get(temp.myMustache).myQuestion,this.myCat.get(6).myHash.get(temp.myMustache).myValue+1.0));
			}
			else{
				if(temp.myMustache==0.0){
					this.catMustache.myHash.put(temp.myMustache, new CatType("Tu personaje tiene bigote?",1.0));
				}
				if(temp.myMustache==1.0){
					this.catMustache.myHash.put(temp.myMustache, new CatType("Tu personaje tiene bigote???",1.0));
				}
			}
			if(this.catBeard.myHash.containsKey(temp.myBeard)){
				this.catBeard.myHash.put(temp.myBeard,new CatType(this.myCat.get(7).myHash.get(temp.myBeard).myQuestion,this.myCat.get(7).myHash.get(temp.myBeard).myValue+1.0));
			}
			else{
				if(temp.myBeard==0.0){
					this.catBeard.myHash.put(temp.myBeard, new CatType("Tu personaje tiene barba?",1.0));
				}
				if(temp.myBeard==1.0){
					this.catBeard.myHash.put(temp.myBeard, new CatType("Tu personaje tiene barba???",1.0));
				}
			}
			if(this.catBald.myHash.containsKey(temp.myBald)){
				this.catBald.myHash.put(temp.myBald,new CatType(this.myCat.get(8).myHash.get(temp.myBald).myQuestion,this.myCat.get(8).myHash.get(temp.myBald).myValue+1.0));
			}
			else{
				if(temp.myBald==0.0){
					this.catBald.myHash.put(temp.myBald, new CatType("Tu personaje es calvo??",1.0));
				}
				if(temp.myBald==1.0){
					this.catBald.myHash.put(temp.myBald, new CatType("Tu personaje es calvo???",1.0));
				}
			}
			if(this.catLongHair.myHash.containsKey(temp.myLongHair)){
				this.catLongHair.myHash.put(temp.myLongHair,new CatType(this.myCat.get(9).myHash.get(temp.myLongHair).myQuestion,this.myCat.get(9).myHash.get(temp.myLongHair).myValue+1.0));
			}
			else{
				if(temp.myLongHair==0.0){
					this.catLongHair.myHash.put(temp.myLongHair, new CatType("Tu personaje tiene el cabello largo?",1.0));
				}
				if(temp.myLongHair==1.0){
					this.catLongHair.myHash.put(temp.myLongHair, new CatType("Tu personaje tiene el cabello largo???",1.0));
				}
			}
			
		}
		this.getAverages();
	}
	//Update all the averages in the hashmaps.
	public void getAverages(){
		int sizeCat = this.myCat.size();
		double tempAverage = 0;
		double tempTotal = 0;
		for(int i=0; i<sizeCat; i++){
			for(double tempKey : this.myCat.get(i).myHash.keySet()){
				double x = this.myCat.get(i).myHash.get(tempKey).myValue;
				if(!Double.isInfinite(log2(x))){
					//System.out.println(Double.isNaN(log2(x)));
					tempAverage += (x*log2(x));
					tempTotal += x;
				}
			}
			//System.out.println(tempAverage);
			this.myCat.get(i).myAverage = tempAverage/tempTotal;
			tempAverage = 0;
			tempTotal = 0;
		}
		
	}
	//Remove all the selected people from the list and update the category average
	//Going backwards to remove elements without getting outofbounds
	//Probably an iterator would be a more elegant solution but there is no time to find out.
	
	public void deletePeople(String category, double value){
		int sizeArr = this.myPeople.size(); 
		for(int i=sizeArr-1; i>=0; i--){
			if(category.equals("gender")&&this.myPeople.get(i).myGender==value){
				//System.out.println("aqui1.0");
				this.myCat.get(0).myHash.put(value, new CatType(this.myCat.get(0).myHash.get(value).myQuestion,this.myCat.get(0).myHash.get(value).myValue-1.0));
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
				//System.out.println(myCat.get(0).myHash.get(0.0));
			}
			if(category.equals("hair")&&this.myPeople.get(i).myHair==value){
				this.myCat.get(1).myHash.put(value, new CatType(this.myCat.get(1).myHash.get(value).myQuestion,this.myCat.get(1).myHash.get(value).myValue-1));
				//System.out.println("aqui2");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("glasses")&&this.myPeople.get(i).myGlasses==value){
				this.myCat.get(2).myHash.put(value, new CatType(this.myCat.get(2).myHash.get(value).myQuestion,this.myCat.get(2).myHash.get(value).myValue-1.0));
				//System.out.println("aqui3");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("eyes")&&this.myPeople.get(i).myEyes==value){
				this.myCat.get(3).myHash.put(value, new CatType(this.myCat.get(3).myHash.get(value).myQuestion,this.myCat.get(3).myHash.get(value).myValue-1.0));
				//System.out.println("aqui4");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("blush")&&this.myPeople.get(i).myBlush==value){
				this.myCat.get(4).myHash.put(value, new CatType(this.myCat.get(4).myHash.get(value).myQuestion,this.myCat.get(4).myHash.get(value).myValue-1.0));
				//System.out.println("aqui5");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("hat")&&this.myPeople.get(i).myHat==value){
				this.myCat.get(5).myHash.put(value, new CatType(this.myCat.get(5).myHash.get(value).myQuestion,this.myCat.get(5).myHash.get(value).myValue-1.0));
				//System.out.println("aqui6");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("mustache")&&this.myPeople.get(i).myMustache==value){
				this.myCat.get(6).myHash.put(value, new CatType(this.myCat.get(6).myHash.get(value).myQuestion,this.myCat.get(6).myHash.get(value).myValue-1.0));
				//System.out.println("aqui7");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("beard")&&this.myPeople.get(i).myBeard==value){
				this.myCat.get(7).myHash.put(value, new CatType(this.myCat.get(7).myHash.get(value).myQuestion,this.myCat.get(7).myHash.get(value).myValue-1.0));
				//System.out.println("aqui8");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("bald")&&this.myPeople.get(i).myBald==value){
				this.myCat.get(8).myHash.put(value, new CatType(this.myCat.get(8).myHash.get(value).myQuestion,this.myCat.get(8).myHash.get(value).myValue-1.0));
				//System.out.println("aqui9");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
			if(category.equals("longHair")&&this.myPeople.get(i).myLongHair==value){
				this.myCat.get(9).myHash.put(value, new CatType(this.myCat.get(9).myHash.get(value).myQuestion,this.myCat.get(9).myHash.get(value).myValue-1.0));
				//System.out.println("aqui1.00");
				System.out.println(this.myPeople.get(i).myName);
				this.myPeople.remove(i);
			}
		}
		
		//After removing all the values and updating the total we need to get the average again.
		this.initPeople();
		this.getAverages();
	}
	
	public void initNums(){
		this.catGender.myHash = new HashMap<Double, CatType>();
		this.catHair.myHash = new HashMap<Double, CatType>();
		this.catGlasses.myHash = new HashMap<Double, CatType>();
		this.catEyes.myHash = new HashMap<Double, CatType>();
		this.catBlush.myHash = new HashMap<Double, CatType>();
		this.catHat.myHash = new HashMap<Double, CatType>();
		this.catMustache.myHash = new HashMap<Double, CatType>();
		this.catBeard.myHash = new HashMap<Double, CatType>();
		this.catBald.myHash = new HashMap<Double, CatType>();
		this.catLongHair.myHash = new HashMap<Double, CatType>();
		
	}
}
