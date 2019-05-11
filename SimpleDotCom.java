public class SimpleDotCom{
	int[] locationCells;
	int numOfHits = 0;


	void setLocationCells(int[] cellLocation){
		locationCells = cellLocation;
	}

	String checkYourself(String userGuess){
		String result = "Miss";

		int guess = Integer.parseInt(userGuess);

		for(int cell:locationCells){
			if(guess == cell){
				result = "Hit";
				numOfHits++;
				break;
			}
		}

		if(numOfHits == locationCells.length){
			result = "Ship sinked!";
		}
		System.out.println(result);
		return result;
	}
}