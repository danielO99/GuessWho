import java.util.Scanner;


public class Main {

	public static Category getMin(Board myBoard){
		int sizeArr = myBoard.myCat.size();
		double minNum = Double.MAX_VALUE;
		int currentIndex = 0;
		for(int i=0; i<sizeArr; i++){
			if(myBoard.myCat.get(i).myAverage < minNum){
				minNum = myBoard.myCat.get(i).myAverage;
				currentIndex = i;
			}
		}
		return myBoard.myCat.get(currentIndex);
	}
	
	public static CatType getQuestionValue(Category myCategory){
		double minValue = Double.MAX_VALUE;
		double currIndex = 0.0;
		for(double tempKey : myCategory.myHash.keySet()){
			if(myCategory.myHash.get(tempKey).myValue < minValue){
				minValue = myCategory.myHash.get(tempKey).myValue;
				currIndex = tempKey;
			}
		}
		//System.out.println( myCategory.myHash.get(currIndex).myValue);
		return myCategory.myHash.get(currIndex);
	}
	
	
	public static Category getMax(Board myBoard){
		int sizeArr = myBoard.myCat.size();
		double minNum = Double.MIN_VALUE;
		int currentIndex = 0;
		for(int i=0; i<sizeArr; i++){
			if(myBoard.myCat.get(i).myAverage > minNum){
				minNum = myBoard.myCat.get(i).myAverage;
				currentIndex = i;
			}
		}
		
		return myBoard.myCat.get(currentIndex);
	}
	
	public static CatType getQuestionValueMax(Category myCategory){
		double minValue = Double.MIN_VALUE;
		double currIndex = 0.0;
		for(double tempKey : myCategory.myHash.keySet()){
			if(myCategory.myHash.get(tempKey).myValue > minValue){
				minValue = myCategory.myHash.get(tempKey).myValue;
				currIndex = tempKey;
			}
		}
		System.out.println( myCategory.myHash.get(currIndex).myValue);
		return myCategory.myHash.get(currIndex);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Board test = new Board();
		String lastQuestion ="";

		
		//JUEGO MINIMOS
		
		Category tempCategory;
		CatType tempCatType;
		double answer;
		while(true){
			if(test.myPeople.size()==1){
				System.out.println("Your character is: "+test.myPeople.get(0).myName);
				System.exit(0);
			}
			//System.out.println("Min Category: " +test.myCat.size());
			System.out.println("Characters left: "+test.myPeople.size());
			tempCategory = getMin(test);
			tempCatType = getQuestionValue(tempCategory);
			if(!lastQuestion.equals(tempCatType.myQuestion)){
				System.out.println(tempCatType.myQuestion);
				answer = in.nextDouble();
				if(answer==0.0){
					for(double tempKey : tempCategory.myHash.keySet()){
						if(tempCategory.myHash.get(tempKey).myQuestion.equals(tempCatType.myQuestion)){
							System.out.println(tempCategory.myName);
							System.out.println(tempKey);
							test.deletePeople(tempCategory.myName, tempKey);
							tempCategory.myHash.remove(tempKey);
						}
					}
				}
				else{
					for(double tempKey : tempCategory.myHash.keySet()){
						
						if(!tempCategory.myHash.get(tempKey).myQuestion.equals(tempCatType.myQuestion)){
							System.out.println(tempCategory.myName);
							System.out.println(tempKey);
							test.deletePeople(tempCategory.myName, tempKey);
							tempCategory.myHash.remove(tempKey);
						}
					}
				}
				test.getAverages();
				lastQuestion = tempCatType.myQuestion;
			}
			else{
				if(test.myPeople.size()==1){
					System.out.println("Your character is: "+test.myPeople.get(0).myName);
					System.exit(0);
				}
				else{
					System.out.println("Your character is: "+test.myPeople.get(0).myName+"?");
					answer = in.nextDouble();
					if(answer==0.0){
						test.myPeople.remove(0);
					}
					else{
						System.out.println("I Won");
						System.exit(0);
					}
				}
			}
		
			System.out.println("Characters left: "+test.myPeople.size());
			
		}
		
		
		
	}
	

}
