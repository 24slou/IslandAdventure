
public class Island extends Player(){
  private int numDays;
  public Island{
    
    public String wildAnimals(){
      System.out.println("Oh no! Wild animals are chasing you! If you have enough food, you will live.")
      if (numFood < 5){
        return "You have died... You did not have enough food for energy to run from the wild animals.";
        health == false; 
      } 
      else {
        return "You survived! You had enough food to give you energy to run away. Unfortunately, you are out of food, complete more challenges to resupply!"; 
        food = 0; 
      }  
    }

    public String findWater(int guess){
      //in the dayTracker method, at the end of the day check water resources. call this method if user is low
      System.out.println("You are running low on water! Play this number guessing game to replenish.")
      System.out.println("You have three guesses, pick any whole number between 1 & 20 inclusive."); 
      int guessNumber = (Math.random()*15)+5; 
      int guess = myObj.nextLine();
      for (int i = 0; i <= 3; i++){
	      if (guessNumber == guess){
		      numWater += 5; 
		      return "Nice job! You guessed right! You have " + numWater + " water.";
	      }
	      else {
		      System.out.println("Guess again."); 
	      } 
      } 
      return "Sorry! You are out of guesses, you currently have " + numWater + " water."; 
    } 
    
    public String dayTracker(){
	    healthCheck(); 
	    numFood = numFood - 2; 
	    numWater = numWater - 2; 
	    if numDays = 10 {
		    System.out.println("A rescue boat has come!”);
	    }
	    if numDays != 10 {
		    numDays++;
		  }
	    return "Days left: " + numDays;
	    if (numWater <= 5) {
		    findWater(); 
	    } 
    } 
	  
    public String healthCheck(){
	    if (numWater <= 0) || (numFood <= 0){
		return "You are out of resources, you have died."; 
		break;     
	    } 	  
    } 
  }   
}
